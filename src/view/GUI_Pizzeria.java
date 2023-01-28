package view;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controller.Controler_Pizzeria;
import model.*;


public class GUI_Pizzeria extends JFrame{
	
	private JLabel labelp;
    
    

	private JButton pizza = new JButton("Pizza");
	private JButton employer = new JButton("Employer");

    model.Pizzeria p ;
   
    public GUI_Pizzeria(Pizzeria a) {

        p = a;
        
        // JLabel
        
        labelp = new JLabel(p.nom);
        
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("bg_pizzeria.png").getImage().getScaledInstance(810, 507, Image.SCALE_AREA_AVERAGING));
        labelp.setIcon(imageIcon);
        
      
        
        labelp.setHorizontalTextPosition(JLabel.CENTER);
        labelp.setVerticalTextPosition(JLabel.CENTER);
        labelp.setBackground(new Color (0x404040));
        labelp.setOpaque(true);
       
        this.getContentPane().add(BorderLayout.CENTER,labelp);
        labelp.setForeground(new Color(0xF5F7F0));
        labelp.setFont(new Font ("Cooper Black",Font.ITALIC,30));
        labelp.setVerticalAlignment(JLabel.CENTER);
        labelp.setHorizontalAlignment(JLabel.CENTER);
        
        // JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("PIZZERIA");
        ImageIcon image = new ImageIcon("pizza1.png");
        this.setIconImage(image.getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
       
        
        // JPanel
    JPanel option = new JPanel();
            option.setLayout(new GridLayout(1,2,60,0));
            option.setBackground(new Color (0x404040));
            option.add(pizza);
            option.add(employer);
    JPanel pos = new JPanel();
        pos.add(BorderLayout.SOUTH,option);
        pos.setBackground(new Color (0x404040));
        pos.setPreferredSize(new Dimension(150,150));

        this.getContentPane().add(BorderLayout.SOUTH,pos);
        
        
        // JButton
        pizza.setFocusable(false); // retire le carré 
        employer.setFocusable(false);
        pizza.setForeground(Color.black); // couleur écriture boutton
        pizza.setFont(new Font ("Cooper Black",Font.ITALIC,18));
        pizza.setBackground(Color.WHITE);// couleur boutton
        employer.setForeground(Color.black);
        employer.setFont(new Font ("Cooper Black",Font.ITALIC,18));
        employer.setBackground(Color.WHITE);
        
        //ActionListener
        
        Controler_Pizzeria ctr  = new Controler_Pizzeria(this,labelp, p);
        pizza.addActionListener(ctr);
        employer.addActionListener(ctr);

       

    }

        // Main
        public static void main(String []args) {
        	
        	//Pizzeria
            Pizzeria piz = new Pizzeria("BIENVENU CHEZ RAPIZZA ! ");
            GUI_Pizzeria v1 = new GUI_Pizzeria(piz);
            v1.setVisible(true);
            







        }

	}

