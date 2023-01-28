package controller;

import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

import model.*;
import view.*;

public class Controler_Pizza implements ActionListener {
	private JFrame fp;
	private JLabel labelp;
	Pizza pi ;

    public Controler_Pizza(JFrame f,JLabel l,Pizza piz) {
        fp = f;
    	labelp = l;
        pi = piz;
    }
    public void actionPerformed(ActionEvent e) {
    	
    	if(((JButton)e.getSource()).getText().equals("Ajouter")) {
    		fp.dispose();
    		pi.ajoutligneCommande(new ligneCommande(0));
    		Commande c = new Commande(0,"taille","nomPizza",new SimpleDateFormat().format(new Date()));
    		GUI_Commande v1 = new GUI_Commande(c);
            v1.setVisible(true);
            
        }
    	if(((JButton)e.getSource()).getText().equals("Retour")) {
    		fp.dispose();
    		Pizzeria p = new Pizzeria("BIENVENU CHEZ RAPIZZA ! ");
    		p.deletePizza(pi);
            GUI_Pizzeria v1 = new GUI_Pizzeria(p);
            v1.setVisible(true);
            
    	}
        
    }
}
