/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagement;
import javax.swing.*;
/**
 *
 * @author jucanik
 */
public class Login extends JFrame{
    
    Login(){
        setTitle("ATM Money");
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        JLabel label = new JLabel(imageIcon );
        add(label);
        setSize(800, 480);
        setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
        new Login();
    }
}
