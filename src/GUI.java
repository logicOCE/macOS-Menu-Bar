import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public class GUI {
    public JPanel createContentPane (){
        //Size of screen; will resize if on bigger monitor
        Dimension sizing = Toolkit.getDefaultToolkit().getScreenSize();
        int gapSize = (sizing.width - 1102);

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);
        totalGUI.setSize(sizing.width, 30);

        // Creation of a Panel to contain the app menus
        JPanel appPanel = new JPanel();
        appPanel.setLayout(null);
        appPanel.setLocation(0, 0);
        appPanel.setSize(702, 30);
        appPanel.setBackground(red);
        totalGUI.add(appPanel);

        // Button
        // Part of appPanel
        JButton appButton = new JButton("CURRENTLY FOCUSED APP");
        appButton.setLocation(50, 0);
        appButton.setSize(200, 30);
        appPanel.add(appButton);

        // Creation of an Empty Panel
        JPanel gapPanel = new JPanel();
        gapPanel.setLayout(null);
        gapPanel.setLocation(702, 0);
        gapPanel.setSize(gapSize, 30);
        gapPanel.setBackground(green);
        totalGUI.add(gapPanel);

        // Creation of a Panel to Hold Other Options
        JPanel otherPanel = new JPanel();
        otherPanel.setLayout(null);
        otherPanel.setLocation(1136, 0);
        otherPanel.setSize(400, 30);
        otherPanel.setBackground(blue);
        totalGUI.add(otherPanel);

        totalGUI.setOpaque(true);
        return totalGUI;
    }

    private static void createAndShowGUI() {

        //Size of screen; will resize if on bigger monitor
        Dimension sizing = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame frame = new JFrame("Menu Bar");

        //Create and set up the content pane.
        GUI demo = new GUI();
        frame.setContentPane(demo.createContentPane());

        // The other bits and pieces that make our program a bit more stable.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setSize(sizing.width, 30);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);

    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
                createAndShowGUI();
    }
}