package view;



import java.util.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.Controler_Client;
import controller.Controler_Pizzeria;
import model.*;

public class GUI_Client extends JFrame{
	
	private JLabel labelc;
	private JLabel nom = new JLabel("NOM :");
	private JLabel telephone = new JLabel("TELEPHONE :");
	private JLabel adresse = new JLabel("ADRESSE :");
	private JTextField nomtf=new JTextField("", 20) ;
	private JTextField telephonetf=new JTextField("", 20) ;
	private JTextField adressetf=new JTextField("", 20) ;
	private JButton valider = new JButton("Commander");
	private JButton ajouterclt = new JButton("Nouveau Client");
	private JButton retour = new JButton("Retour");

     model.Client cl;
     model.Pizzeria p;
     view.GUI_Commande a;
     public GUI_Client(Client c){
    	 
    	 cl = c;
    	 
    	// JLabel
         
         labelc = new JLabel();
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("neon4.png").getImage().getScaledInstance(150, 150,Image.SCALE_AREA_AVERAGING));

         labelc.setText("ESPACE CLIENT");
	     labelc.setIcon(imageIcon);
         labelc.setForeground(Color.white);
         labelc.setFont(new Font ("Cooper Black",Font.ITALIC,30));
         labelc.setBackground(new Color (0x404040));
         labelc.setOpaque(true);
         labelc.setPreferredSize(new Dimension(200,200));
         this.getContentPane().add(BorderLayout.NORTH,labelc);
	        labelc.setVerticalAlignment(JLabel.CENTER);
	        labelc.setHorizontalAlignment(JLabel.CENTER);
	        labelc.setPreferredSize(new Dimension(0,150));
	        

         
         
      // JFrame
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("CLIENT");
         ImageIcon image = new ImageIcon("pizza1.png");
         this.setIconImage(image.getImage());
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
     // JPanel    
         JPanel cls = new JPanel();
         cls.setLayout(new GridLayout(3,1,-190,50));
         cls.setBackground(new Color (0x404040));
         cls.add(nom);
         cls.add(nomtf);
         cls.add(telephone);
         cls.add(telephonetf);
         cls.add(adresse);
         cls.add(adressetf);
       
         
         JPanel option = new JPanel();
         option.setLayout(new GridLayout(1,3,20,40));
         option.setBackground(new Color (0x404040));
         option.add(valider);
         option.add(ajouterclt);
         option.add(retour);

         
         
         JPanel pos1 = new JPanel();
        

     		pos1.add(BorderLayout.CENTER,cls);
     		
	        pos1.setBackground(new Color (0x404040));
	       

	        this.getContentPane().add(BorderLayout.CENTER,pos1);
	        
	        
	        JPanel pos2 = new JPanel();
	        
     		pos2.add(BorderLayout.SOUTH,option);
	        pos2.setBackground(new Color (0x404040));
	       

	        this.getContentPane().add(BorderLayout.SOUTH,pos2);
	        pos2.setPreferredSize(new Dimension(0,250));
	        

	  //Font
	        
	        nom.setFont(new Font ("Cooper Black",Font.ITALIC,25));
	        nomtf.setFont(new Font ("Cooper Black",Font.PLAIN,20));
	        nom.setForeground(Color.white);
	        telephone.setFont(new Font ("Cooper Black",Font.ITALIC,25));
	        telephonetf.setFont(new Font ("Cooper Black",Font.PLAIN,20));
	        telephone.setForeground(Color.white);
	        adresse.setFont(new Font ("Cooper Black",Font.ITALIC,25));
	        adressetf.setFont(new Font ("Cooper Black",Font.PLAIN,20));
	        adresse.setForeground(Color.white);
	        valider.setFocusable(false);
	        ajouterclt.setFocusable(false);
	        valider.setFont(new Font ("Cooper Black",Font.ITALIC,20));
	        ajouterclt.setFont(new Font ("Cooper Black",Font.ITALIC,20));
	        valider.setForeground(Color.black);
	        valider.setBackground(Color.WHITE);
	        ajouterclt.setForeground(Color.black);
	        ajouterclt.setBackground(Color.WHITE);
	        retour.setFocusable(false);
	        retour.setFont(new Font ("Cooper Black",Font.ITALIC,20));
	        retour.setForeground(Color.black);
	        retour.setBackground(Color.WHITE);
	        

	        
	        adresse.setVisible(false);
	        adressetf.setVisible(false);
	        
	        Controler_Client ctr  = new Controler_Client(this,
	        											labelc,adresse,
	        											nomtf, telephonetf , adressetf,
	        											ajouterclt,valider,
	        											cl);
	        retour.addActionListener(ctr);
	        ajouterclt.addActionListener(ctr);
	        valider.addActionListener(ctr);


	        
	        
     	}

	
	}
		

			
		
		
	
     
	

