package controller;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

import model.Employer;
import model.Pizza;
import model.Pizzeria;
import view.*;

public class Controler_Pizzeria implements ActionListener{
	private JLabel labelp;
	   
    Pizzeria p ;
    
    private JFrame fp;

    public Controler_Pizzeria(JFrame f,JLabel l,Pizzeria piz) {
        labelp = l;
        p = piz;
        fp = f;
       
    }
    
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    	
        if(((JButton)e.getSource()).getText().equals("Pizza")) {
            fp.dispose();
        	p.getPizza("Choisir Pizza");
            Pizza piz = new Pizza(0,"Choisir pizza");
            GUI_Pizza v2 = new GUI_Pizza(piz);
            v2.setVisible(true);
           
        }
        
        if(((JButton)e.getSource()).getText().equals("Employer")) {
        	
        	fp.dispose();
            GUI_Employer v1 = new GUI_Employer(p.getEmployer(0));
            v1.setVisible(true);
            
     
            
            }
    }
}
