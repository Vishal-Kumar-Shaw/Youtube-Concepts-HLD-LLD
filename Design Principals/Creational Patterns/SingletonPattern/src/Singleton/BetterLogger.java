package Singleton;

public class BetterLogger {
    // Multithreading problem

    // What if 2 thread access that piece of code at the same time
    // 2 times object will be created because both the time instance will be null


    // Solution 1 - Using synchronized function
    // no 2 thread can get into the code at the same time

    // Pros - Problem solved
    // cons - Performance issue, every calls get locked even if object is there
    private static BetterLogger instance;
    private BetterLogger(){}
    public static synchronized BetterLogger getInstance(){
        if(instance == null){
            instance = new BetterLogger();
        }
        return instance;
    }


    // Solution 2 - Eager Initialization
    // Means - Code compile hote hi object bana kar thaile me rakh do
    // Jo v thread baad me aaye usko wahi object de do
    // How to do it
    private static final BetterLogger instance2 = new BetterLogger();


    public static BetterLogger getInstance2(){
        return instance2;
    }

    // Solution 3 - Double Checked Locking
    public static BetterLogger getInstance3(){
        if(instance == null){
            synchronized (BetterLogger.class){
                if(instance == null){
                    instance = new BetterLogger();
                }
            }
        }
        return instance;
    }

}
