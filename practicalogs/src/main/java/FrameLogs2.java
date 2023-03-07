import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameLogs2 extends JFrame {
    private JButton btnMostrar = new JButton("Mostrar");
    private JButton btnError = new JButton("Error");
    private static final Logger logger = LogManager.getLogger(FrameLogs2.class);

    public FrameLogs2() {
        this.setLayout(new BorderLayout());
        this.add(btnMostrar, BorderLayout.NORTH);
        this.add(btnError, BorderLayout.SOUTH);
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logger.info("Hizo click en el botón mostrar");
            }
        });
        btnError.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = 0;
                    int b = 5 / a;
                } catch (Exception ex) {
                    logger.error("División entre cero aquí");
                }
            }
        });
    }
}
