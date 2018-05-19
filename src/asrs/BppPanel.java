/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrs;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author chris
 */
public class BppPanel extends JPanel {
    
    private int x = 360;
    private int y = 415;
    
    public BppPanel(){
        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.black));
        //setSize(360, 414);
        setBounds(710, 80, this.x, this.y);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int x = this.x;
        int y = this.y;
        
        int item1[] = {1, 2, 0};
        int item2[] = {2, 3, 1};
        int item3[] = {3, 1, 0};
        int item4[] = {4, 4, 0};
        int item5[] = {5, 1, 1};
        int item6[] = {6, 5, 0};
        int item7[] = {7, 2, 1};
        
        int[] doos1[] = {item1, item2, item3, item4};
        int[] doos2[] = {item7, item6, item5};
        int[][] dozen[] = {doos1,doos2};
        
        for(int i = 0; i < dozen.length; i++){
            int s = 0;
            for(int t = 0; t < dozen[i].length; t++){
                int xPos = 0 + s;
                int yPos = y / 5 * i;
                int width = x / 10 * dozen[i][t][1];
                int height = y / 5;
                
                if(dozen[i][t][2] == 1){
                    g.setColor(Color.green);
                } else {
                    g.setColor(Color.red);
                }

                g.fillRect(xPos, yPos, width, height);
                g.setColor(Color.black);
                g.drawRect(xPos, yPos, width, height);
                
                g.drawString(Integer.toString(dozen[i][t][0]), xPos + (width / 2), yPos + (height / 2));
                
                s += (x / 10 * dozen[i][t][1]);
            }
            
        }
        
        for(int i = 0; i <= 5; i++){
            g.setColor(Color.black);
            g.drawRect(0, y / 5 * i, x, y);
        }
        
    }
    
}
