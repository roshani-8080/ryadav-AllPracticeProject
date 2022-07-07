package PkgA;

import org.apache.logging.log4j.*;

//import java.util.logging.Logger;

public class Demo1 {
    private static Logger log= LogManager.getLogger(Demo1.class.getName());
//private static Logger log= Logger.getLogger(Demo1.class.getName());

    public static void main(String[] args) {
        log.error("This is an Error");
        log.debug("Debugging message");
        log.fatal("This is Fatal");
        //log.log("log");


    }
}
