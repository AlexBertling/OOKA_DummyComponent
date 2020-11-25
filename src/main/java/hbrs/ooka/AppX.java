package hbrs.ooka;

import hbrs.ooka.annotation.Start;
import hbrs.ooka.annotation.Stop;

/**
 * Hello world!
 *
 */
public class AppX
{
    private static AppX instance;

    public AppX(){
        System.out.println( "Hello World!" );
    }

    @Start
    public static AppX start(){
        instance = new AppX();
        return instance;
    }

    @Stop
    public static void stop(){
        instance = null;
    }
}
