package hbrs.ooka;

import hbrs.ooka.log.ConcreteLogger;
import hbrs.ooka.log.Logger;
import hbrs.ooka.log.LoggerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppXTest
{
    private static AppX appX;

    @BeforeAll
    public static void instantiate(){
        appX = new AppX();
    }

    @Test
    public void start() throws InterruptedException {
        appX.setLogger(LoggerFactory.createLogger());
        appX.start();
        // let component work some seconds
        Thread.sleep(5000);
    }
}
