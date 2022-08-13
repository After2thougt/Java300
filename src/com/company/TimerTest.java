/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/25/2022 9:28 PM
 */
package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerTest {

    public static void main(String[] args)
    {
        var listener = new TimePrinter();

        // construct a timer that calls the listener
        // once every second
        var timer = new Timer(100, listener);
        timer.start();

        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

    static class TimePrinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            // return epoch time
            System.out.println("At the tone, the time is "
            + Instant.ofEpochMilli(event.getWhen()));
            // return exactly time
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
