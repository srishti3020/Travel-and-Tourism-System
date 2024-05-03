
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Paytm extends  JFrame implements ActionListener{
    
    Paytm() {
        setBounds(500, 200, 800, 600);
        setLayout(null);
        
        JEditorPane Pane = new JEditorPane();
        Pane.setEditable(false);
        try {
            Pane.setPage("https://paytm.com/rent-payment");
            
        }catch(IOException e) {
           Pane.setContentType("text/html");
           Pane.setText("<html>Could not Load, Error 404 </html>");
        }
        
        JScrollPane sp = new JScrollPane(Pane);
        getContentPane().add(sp);
        
        JButton back =  new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
         new Payment();
     }
     
    public static void main(String[] args){
     new   Paytm();
    }
}
