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
        int[] arrays[] = {item1,item2};
        
        for(int l = 0; l < arrays.length; l++){
        g.setColor(Color.green);
        g.fillRect((this.x/5) * arrays[l][0], (this.y/5) * arrays[l][1], (this.x / 5), (this.y / 5));
        }
        
        for(int i = 0; i <= 5; i++){
            for(int t = 0; t <= 5; t++){
                g.setColor(Color.black);
                g.drawRect((this.x/5) * i, (this.y/5) * t, (this.x / 5), (this.y / 5));
            }
        }
        
    }
    
}
