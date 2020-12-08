package hbrs.ooka;

import hbrs.ooka.annotation.Inject;
import hbrs.ooka.annotation.Start;
import hbrs.ooka.annotation.Stop;
import hbrs.ooka.gui.GUI;
import hbrs.ooka.log.Logger;

/**
 * Hello world!
 *
 */
public class AppX
{

    private GUI gui;

    @Inject
    private Logger logger;

    public AppX(){
        //System.out.println( "Dummy Component initialized..." );
        gui = new GUI();
    }

    public Logger getLogger() {
        return logger;
    }

    @Inject
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Start
    public void start(){
        logger.sendLog( "Dummy Component started..." );
        gui.startLogging();
    }

    @Stop
    public void stop(){
        logger.sendLog( "Dummy Component stopped..." );
        gui.stopLogging();
    }
}
