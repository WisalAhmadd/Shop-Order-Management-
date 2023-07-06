/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopStop;

/**
 *
 * @author J e r r Y
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author admin
 */
public class Gallery extends JFrame  implements ActionListener
{
    ImageIcon s[];
    JLabel lbl;
    JButton b1,b2;
    int i ,l1;
    JPanel p;
    
    public Gallery()
    {
        setLayout(new BorderLayout( ));
        setSize(1200, 900);
        setVisible(true);
        setLocationRelativeTo(null);
        JPanel p=new JPanel(new FlowLayout());
        
        b1=new JButton("👈😎Back  ");
        b2=new JButton("Next 😎👉");
        p.add(b1);
        p.add(b2);
        add(p,BorderLayout.SOUTH);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        s = new ImageIcon[23]; 
        s[0] = new ImageIcon("images/1.jpg");
        s[1] = new ImageIcon("images/2.jpg");
        s[2] = new ImageIcon("images/3.jpg");
        s[3] = new ImageIcon("images/4.jpg");
        s[4] = new ImageIcon("images/5.jpg");
        s[5] = new ImageIcon("images/6.jpg");
        s[6] = new ImageIcon("images/7.jpg");
        s[7] = new ImageIcon("images/8.jpg");
        s[8] = new ImageIcon("images/9.jpeg");
        s[9] = new ImageIcon("images/10.jpg");
        s[10] = new ImageIcon("images/11.jpg");
        s[11] = new ImageIcon("images/12.jpg");
        s[12] = new ImageIcon("images/13.jpg");
        s[13] = new ImageIcon("images/14.jpg");
        s[14] = new ImageIcon("images/15.jpg");
        s[15] = new ImageIcon("images/16.jpg");
        s[16] = new ImageIcon("images/17.png");
        s[17] = new ImageIcon("images/18.png");
        s[18] = new ImageIcon("images/19.jpg");
        s[19] = new ImageIcon("images/20.jpg");
        s[20] = new ImageIcon("images/22.jpg");
        s[21] = new ImageIcon("images/23.jpg");
        s[22] = new ImageIcon("images/24.jpg");
        
        
        lbl = new JLabel("|Available",JLabel.CENTER);        add(lbl,BorderLayout.CENTER);
        lbl.setIcon(s[0]);

    }
    
    public  void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            if(i==0)
            {
                JOptionPane.showMessageDialog(null,"This is First Image");
                
            }
            else
            {
                i=i-1;
                lbl.setIcon(s[i]);
            }
        }
        if(e.getSource()==b2)
        {
            if(i==s.length-1)
            {
                JOptionPane.showMessageDialog(null,"This is Last Image");
             
            }
            else
            {
                i=i+1;
                lbl.setIcon(s[i]);
            }
            }
    }
    
}
