/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author binh_ & christiaan
 */
public class GUI extends JFrame implements ActionListener {
    private JComboBox comPort1;
    private JComboBox comPort2;
    private JButton uploadOrder;
    private JButton start;
    private JButton stop;
    private JLabel robotStatus;
    private JLabel sorteerStatus;
    
    public GUI() {
        setSize(1500, 800);
        setLayout(null);
        setTitle("Automated Storage and Retrieval System");

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] ports = { "port 1", "port 2", "port 4", "port 5", "port 6" };
        comPort1 = new JComboBox(ports);
        comPort1.addActionListener(this);
        add(comPort1);

        comPort2 = new JComboBox(ports);
        comPort2.addActionListener(this);
        add(comPort2);

        uploadOrder = new JButton("Upload order");
        uploadOrder.addActionListener(this);
        add(uploadOrder);

        start = new JButton("Start");
        start.addActionListener(this);
        add(start);

        stop = new JButton("Stop");
        stop.addActionListener(this);
        add(stop);

        robotStatus = new JLabel("Robot Status");
        add(robotStatus);

        sorteerStatus = new JLabel("Sorteer Status");
        add(sorteerStatus);

        TspPanel panel = new TspPanel();

        add(panel);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comPort1) {
            JComboBox comPort1A = (JComboBox)e.getSource();
            String comPort1S = (String)comPort1A.getSelectedItem();
            //setComPort1(comPort1S);
        }
        if (e.getSource() == comPort1) {
            JComboBox comPort2A = (JComboBox)e.getSource();
            String comPort2S = (String)comPort2A.getSelectedItem();
            //setComPort2(comPort2S);
        }
        //repaint();
    }
}
