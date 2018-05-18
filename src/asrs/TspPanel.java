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
 * @author binh_
 */
class TspPanel extends JPanel {
    int x = 325;
    int y = 345;
    
    public TspPanel(){
        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.black));
        //setSize(315, 335);
        setBounds(10, 150, this.x, this.y);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int item1[] = {2, 0};
        int item2[] = {1, 4};
        int item3[] = {3, 2};
        int item4[] = {0, 1};
        
        int[] arrays2[] = {item3,item4};
        
        for(int i = 0; i < arrays2.length; i++){
        g.setColor(Color.red);
        g.fillRect((this.x/5) * arrays2[i][0], (this.y/5) * arrays2[i][1], (this.x / 5), (this.y / 5));
        }
        
        int[] arrays[] = {item1,item2};
        
        for(int i = 0; i < arrays.length; i++){
        g.setColor(Color.green);
        g.fillRect((this.x/5) * arrays[i][0], (this.y/5) * arrays[i][1], (this.x / 5), (this.y / 5));
        }
        
        for(int i = 0; i < arrays.length - 1; i++){
            g.setColor(Color.blue);
            int offSet = this.x/10;
            g.drawLine((this.x/5) * arrays[i][0] + offSet, (this.y/5) * arrays[i][1] + offSet, (this.x/5) * arrays[i + 1][0] + offSet, (this.y/5) * arrays[i + 1][1] + offSet);
        }
        
        for(int i = 0; i <= 5; i++){
            for(int t = 0; t <= 5; t++){
                g.setColor(Color.black);
                g.drawRect((this.x/5) * i, (this.y/5) * t, (this.x / 5), (this.y / 5));
            }
        }
        
    }
    
}
