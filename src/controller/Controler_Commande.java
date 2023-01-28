package controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import model.Client;
import model.Commande;
import model.ligneCommande;
import model.Pizzeria;
import view.*;

	public class Controler_Commande implements ActionListener {
		private JFrame framep;
		private JLabel labelp;
	    Commande cm;
	    
	    

	    public Controler_Commande(	JFrame p,
	    							JLabel l,
	    							Commande c) {
	        framep = p; 
	        labelp = l; 
	        cm = c;
	        
	        
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			framep.dispose();
			if(((JButton)e.getSource()).getText().equals("Confirmer")) {
				Client cl = new Client(0,0,"Inserez l'Adresse");
				cm.ajoutClient(cl);
				GUI_Client v1 = new GUI_Client(cl);
	            v1.setVisible(true);
	        }
		if(((JButton)e.getSource()).getText().equals("Retour")) {
    		framep.dispose();
    		Pizzeria p = new Pizzeria("BIENVENU CHEZ RAPIZZA ! ");
    		cm.ajoutligneCommande(new ligneCommande(0));
            GUI_Pizzeria v1 = new GUI_Pizzeria(p);
            v1.setVisible(true);
    		}
		
		
		}
	}
