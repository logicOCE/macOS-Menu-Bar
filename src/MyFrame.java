import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import static java.awt.Color.*;

public class MyFrame extends JFrame implements MouseListener {
    static Dimension sizing = Toolkit.getDefaultToolkit().getScreenSize();
    int gapSize = (sizing.width - 1102);
    MyFrame() {
        //Frame to put everything on
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setSize(sizing.width, 30);
        this.setVisible(true);
        this.setAlwaysOnTop(true);

        //Creation of a panel to contain the app menus
        JPanel appPanel = new JPanel();
        appPanel.setLayout(null);
        appPanel.setBounds(0, 0, 702, 30);
        appPanel.setBackground(red);
        this.add(appPanel);

        //Button
        //Part of appPanel
        JButton appButton = new JButton("CURRENTLY FOCUSED APP");
        appButton.setBounds(50, 0, 200, 30);
        appButton.addMouseListener(this);
        appPanel.add(appButton);

        // Creation of an Empty Panel
        JPanel gapPanel = new JPanel();
        gapPanel.setLayout(null);
        gapPanel.setBounds(702, 0, gapSize, 30);
        gapPanel.setBackground(green);
        this.add(gapPanel);

        // Creation of a Panel to Hold Other Options
        JPanel otherPanel = new JPanel();
        otherPanel.setLayout(null);
        otherPanel.setBounds(1136, 0, 400, 30);
        otherPanel.setBackground(blue);
        this.add(otherPanel);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the button!!!");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
