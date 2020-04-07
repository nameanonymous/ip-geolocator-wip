package geolocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.error("This is an ERROR message");
        logger.warn("This is a WARNING message");
        logger.info("This is an INFO message");
        logger.debug("This is a DEBUG message");
        logger.trace("This is a TRACE message");
        logger.info("User's name is {}", System.getProperty("user.name"));
        logger.error("Something is wrong", new RuntimeException("Oops"));
        System.out.println("I DO NOT KNOW WHY THESE LOGGER CANNOT OUTPUT TO .log");
    }

}
