package hbrs.ooka.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class GUI {

    private JFrame frame;
    private Timer timer;

    public void startLogging(){
        //Creating the Frame
        frame = new JFrame("Log Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Text Area at the Center
        final JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.CENTER, sp);
        frame.setVisible(true);

        class Heartbeat extends TimerTask {
            public void run() {
                ta.setText(new Date().toString() + "\n" + ta.getText());
            }
        }

        // And From your main() method or any other method
        timer = new Timer();
        timer.schedule(new Heartbeat(), 0, 1000);
    }

    public void stopLogging(){
        timer.cancel();
        timer.purge();
        frame.setVisible(false); //you can't see me!
        frame.dispose(); //Destroy the JFrame object
    }
}
