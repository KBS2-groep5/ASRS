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
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int x = this.x/5;
        int y = this.y/5;
        
        //x y ingepakt
        int item1[] = {2, 0, 1};
        int item2[] = {1, 4, 0};
        int item3[] = {3, 2, 0};
        int item4[] = {0, 1, 0};
        int item5[] = {2, 2, 1};
        
        int[] order[] = {item1,item5,item3,item2,item4};
        
        for(int i = 0; i < order.length; i++){
            if(order[i][2] == 1){
                g.setColor(Color.green);
            } else {
                g.setColor(Color.red);
            }
        g.fillRect(x * order[i][0], y * order[i][1], x, y);
        }
        
        for(int i = 0; i <= 5; i++){
            for(int t = 0; t <= 5; t++){
                g.setColor(Color.black);
                g.drawRect(x * i, y * t, x, y);
            }
        }
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        
        for(int i = 0; i < order.length - 1; i++){
            g2.setColor(Color.blue);
            int offSet = x/2;
            g2.drawLine(x * order[i][0] + offSet, y * order[i][1] + offSet, x * order[i + 1][0] + offSet, y * order[i + 1][1] + offSet);
        }
        
        g2.setStroke(new BasicStroke(1));
        
    }
    
}
