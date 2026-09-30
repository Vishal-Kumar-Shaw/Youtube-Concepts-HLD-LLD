package Singleton;

public class Logger {

//    public Logger(){
//
//  }

    // Rule 1 - Always keep the constructor private
    // so No outside class can make Logger Object

    // Rule 2 - Always keep the instance of the
    // logger within the class

    // Rule 3 - Make the getInstance Method static so that
    // with the help of class only Instance can be get

    // Rule 4- Give a public method to get the instance of the object

    private static Logger logger;
    // constructor
    private Logger(){

    }

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }



}
