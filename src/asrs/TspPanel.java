/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrs;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author binh_
 */
class TspPanel extends JPanel {
    private int x = 325;
    private int y = 345;
    
    public TspPanel(){
        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.black));
        //setSize(315, 335);
        setBounds(10, 150, this.x, this.y);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int x = this.x/5;
        int y = this.y/5;
        
        int item1[] = {2, 0};
        int item2[] = {1, 4};
        int item3[] = {3, 2};
        int item4[] = {0, 1};
        int item5[] = {2, 2};
        
        int[] arrays2[] = {item3,item4};
        
        for(int i = 0; i < arrays2.length; i++){
        g.setColor(Color.red);
        g.fillRect(x * arrays2[i][0], y * arrays2[i][1], x, y);
        }
        
        int[] arrays[] = {item1,item5,item2};
        
        for(int i = 0; i < arrays.length; i++){
        g.setColor(Color.green);
        g.fillRect(x * arrays[i][0], y * arrays[i][1], x, y);
        }
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        
        int[] totalArrays[] = {item1,item5,item2,item3,item4};
        
        for(int i = 0; i < totalArrays.length - 1; i++){
            g2.setColor(Color.blue);
            int offSet = x/2;
            g2.drawLine(x * totalArrays[i][0] + offSet, y * totalArrays[i][1] + offSet, x * totalArrays[i + 1][0] + offSet, y * totalArrays[i + 1][1] + offSet);
        }
        
        g2.setStroke(new BasicStroke(1));
        
        for(int i = 0; i <= 5; i++){
            for(int t = 0; t <= 5; t++){
                g.setColor(Color.black);
                g.drawRect(x * i, y * t, x, y);
            }
        }
        
    }
    
}
