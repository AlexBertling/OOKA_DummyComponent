package hbrs.ooka;

import hbrs.ooka.annotation.Start;
import hbrs.ooka.annotation.Stop;
import hbrs.ooka.gui.GUI;

/**
 * Hello world!
 *
 */
public class AppX
{

    private GUI gui;

    public AppX(){
        System.out.println( "Dummy Component initialized..." );
        gui = new GUI();
    }

    @Start
    public void start(){
        System.out.println( "Dummy Component started..." );
        gui.startLogging();
    }

    @Stop
    public void stop(){
        System.out.println( "Dummy Component stopped..." );
        gui.stopLogging();
    }
}
