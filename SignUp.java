/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SignUp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class SignUp extends JFrame{

    
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel passwordPnl;
    private JPanel collective;
    private JPanel buttonPnl;
    private JPanel mainPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel passwordLbl;
    
    private JTextField nametxf;
    private JPasswordField passwordfld;
    
    private JButton submitbtn;
    
    public SignUp(){
        
        setSize(300, 350);
        setTitle("User Login Page");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        namePnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        collective = new JPanel(new GridLayout(2,1));
        buttonPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        mainPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        headingLbl = new JLabel("Login details");
        nameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("Password: ");
        
        nametxf = new JTextField(15);
        
        passwordfld = new JPasswordField(15);
        
        submitbtn = new JButton("Submit");
        submitbtn.setSize(2, 5);
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nametxf);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordfld);
        
        collective.add(namePnl );
        collective.add(passwordPnl);
                
        
        mainPnl.add(collective);
        
        
        add(headingLbl,BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
        add(submitbtn,BorderLayout.SOUTH);
                
        pack();
        setVisible(true);
    }
    
    
}
