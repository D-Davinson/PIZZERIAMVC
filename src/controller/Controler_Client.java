package controller;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Client;
import model.Commande;
import model.Pizzeria;
import view.GUI_Client;
import view.GUI_Commande;
public class Controler_Client implements ActionListener{
	private JFrame framep;
	private JLabel labelp;
	private JButton ajouterclt;
	private JButton valider;
	private JLabel adresse;
	private JTextField nomtf;
	private JTextField telephonetf;
	private JTextField adressetf;
	Client c;
	public Controler_Client(JFrame p,
							JLabel l,JLabel adr,
							JTextField ntf, JTextField tf , JTextField adrtf,
							JButton ajtcl , JButton vld ,
							Client cl) {
        framep = p;
    	labelp = l;
    	adresse = adr;
    	nomtf = ntf;
    	telephonetf = tf;
    	adressetf = adrtf;
    	ajouterclt = ajtcl;
    	valider = vld;
        c = cl;
	}

		@Override
		public void actionPerformed(ActionEvent e) {

			if(((JButton)e.getSource()).getText().equals("Retour")) {
	    		framep.dispose();
	    		c.ajoutCommande(null);
	            GUI_Commande v1 = new GUI_Commande(new Commande(0,"taille","nomPizza",new SimpleDateFormat().format(new Date())));
	            v1.setVisible(true);
	    		}
			
			
			
			if(e.getSource() == ajouterclt) {
				adresse.setVisible(true);
				adressetf.setVisible(true);
			}
			
			if(e.getSource() == valider) {
				
		
			
				if( (nomtf.getText().equals("")|| telephonetf.getText().equals(""))&& adressetf.getText().equalsIgnoreCase(adressetf.getText())) {
					JOptionPane.showMessageDialog(null, " Merci de completer tous les champs demandes.","ERREUR",JOptionPane.ERROR_MESSAGE);
				
				}else if(!(telephonetf.getText().startsWith("01")) && !(telephonetf.getText().startsWith("06")) && !(telephonetf.getText().startsWith("07")) && !(telephonetf.getText().startsWith("+33"))) {
					JOptionPane.showMessageDialog(null, " Merci de donner un numero valide.","ERREUR",JOptionPane.ERROR_MESSAGE);
				}else{
			        ImageIcon icon = new ImageIcon(new ImageIcon("pizza1.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
					JOptionPane.showOptionDialog(null,"Votre Commande est saisie. \n "+"A bientôt chez Rapizza !" , "MERCI !", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, icon,null, 0);
					framep.dispose();
				
		
				}
			
			}
		}
	}

