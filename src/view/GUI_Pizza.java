package view;
import java.util.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.Controler_Pizza;
import model.*;

public class GUI_Pizza extends JFrame{
	
	private JLabel labelp;
	
	private JButton ajouter = new JButton("Ajouter");
	private JButton supprimer = new JButton("Retour");
	    
	    
	     model.Pizza pi;


	    public GUI_Pizza(Pizza a) {
	    	
	    	pi=a;
	    	
	    	
	    	// JLabel
	    	 
	    	 
	    	
	    	labelp = new JLabel();
	        labelp.setText("FAITES VOTRE CHOIX !");
	    	
	        ImageIcon imageIcon = new ImageIcon(new ImageIcon("neon2.png").getImage().getScaledInstance(400, 400, Image.SCALE_AREA_AVERAGING));
	        labelp.setIcon(imageIcon);
	        labelp.setHorizontalTextPosition(JLabel.CENTER);
	        labelp.setVerticalTextPosition(JLabel.NORTH);
	        labelp.setIconTextGap(-25);
	        labelp.setForeground(Color.white);
	        labelp.setFont(new Font ("Cooper Black",Font.ITALIC,30));
	        labelp.setBackground(new Color (0x404040));
	        labelp.setOpaque(true);
	        labelp.setVerticalAlignment(JLabel.CENTER);
	        labelp.setHorizontalAlignment(JLabel.CENTER);
	        labelp.setPreferredSize(new Dimension(0,510));
	        this.getContentPane().add(BorderLayout.NORTH,labelp);
	    	
	    	// JFrame
	         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         this.setTitle("PIZZA");
	         ImageIcon image = new ImageIcon("pizza1.png");
	         this.setIconImage(image.getImage());
	         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	        
	        
	        // JPanel
	    JPanel option = new JPanel();
	            option.setLayout(new GridLayout(1,2,25,0));
	            option.setBackground(new Color (0x404040));
	            option.add(ajouter);
	            option.add(supprimer);
	    JPanel pos = new JPanel();
	        pos.add(BorderLayout.CENTER,option);
	        pos.setBackground(new Color (0x404040));
	        this.getContentPane().add(BorderLayout.CENTER,pos);
	        
	        // JButton
	       // ajouter.addActionListener(this);
	       // supprimer.addActionListener(this);
	        ajouter.setFocusable(false); // retire le carré 
	        supprimer.setFocusable(false);
	        ajouter.setForeground(Color.black); // couleur écriture boutton
	        ajouter.setFont(new Font ("Cooper Black",Font.ITALIC,18));
	        ajouter.setBackground(Color.WHITE);// couleur boutton
	        supprimer.setForeground(Color.black);
	        supprimer.setFont(new Font ("Cooper Black",Font.ITALIC,18));
	        supprimer.setBackground(Color.WHITE);
	        
	    
	        Controler_Pizza ctr=new Controler_Pizza(this,labelp,pi);
            ajouter.addActionListener(ctr);
            supprimer.addActionListener(ctr);

	    }

	    

}
