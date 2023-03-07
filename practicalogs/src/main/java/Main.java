import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Inició el programa");
        JFrame frame = new FrameLogs2();
        frame.setBounds(100, 100, 500, 500);
        frame.setVisible(true);
        logger.debug("mensaje de prueba");
        logger.fatal("Prueba");
        logger.fatal("Prueba");
    }
}
