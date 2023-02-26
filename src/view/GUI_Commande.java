package view;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import controller.Controler_Commande;
import javax.swing.*;
import model.*;


public class GUI_Commande extends JFrame implements ActionListener {
	
	private JLabel labelp;
	model.Commande c;
	 String [] nosProduits = {"Capricciosa","Ortolana ","Diavola","El Piquente","Sardenara"};
	 private JComboBox comboBox1 = new JComboBox(nosProduits);
	 
	 Integer[] quantitep = {1,2,3,4,5,6,7,8,9,10};
	 private JComboBox comboBox2 = new JComboBox(quantitep);
	 
	    
	 private JRadioButton naine = new JRadioButton ("Naine");
	 private JRadioButton humaine = new JRadioButton ("Humaine");
	 private JRadioButton ogresse = new JRadioButton ("Ogresse");
	 
	 ButtonGroup group = new ButtonGroup();
	  
	 private JButton valider = new JButton(" Valider  ");
	 private JButton confirmer = new JButton("Confirmer");
	 private JButton retour = new JButton("Retour");
	 
	 
	 private JTextArea text = new JTextArea();
	 
	
	  public GUI_Commande (Commande a) {
		  
		  c =a;
		  
		  
		  
		  
		  
		// JLabel
	    	 
		  group.add(naine);
		  group.add(humaine);
		  group.add(ogresse);
			 
			 
	    	
	    	labelp = new JLabel();
			ImageIcon imageIcon = new ImageIcon(new ImageIcon("neon1.png").getImage().getScaledInstance(150, 150,Image.SCALE_AREA_AVERAGING));

	    	labelp.setText("FAITES VOUS PLAISIR !");
	    	labelp.setIcon(imageIcon);
	        labelp.setForeground(Color.white);
	        labelp.setFont(new Font ("Cooper Black",Font.ITALIC,30));
	        labelp.setBackground(new Color (0x404040));
	        labelp.setOpaque(true);
	        labelp.setVerticalAlignment(JLabel.CENTER);
	        labelp.setHorizontalAlignment(JLabel.CENTER);
	        labelp.setPreferredSize(new Dimension(0,200));
	        this.getContentPane().add(BorderLayout.NORTH,labelp);

	        
	     // JFrame
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         this.setTitle("COMMANDE");
	         ImageIcon image = new ImageIcon("pizza1.png");
	         this.setIconImage(image.getImage());
	         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	        
	        
	        
	       
	    
	    JPanel option = new JPanel();
	    option.setLayout(new FlowLayout(FlowLayout.CENTER,50,0));
	            option.setBackground(new Color (0x404040));
	            option.add(comboBox1);
	            option.add(comboBox2);
		        
		       
		        
		     // JComboBox
		        comboBox1.setFocusable(false); // retire le carr� 
		        comboBox2.setFocusable(false);
		        comboBox1.setForeground(Color.black); // couleur �criture boutton
		        comboBox1.setFont(new Font ("Cooper Black",Font.ITALIC,18));
		        comboBox1.setBackground(Color.WHITE);// couleur boutton
		        comboBox2.setForeground(Color.black);
		        comboBox2.setFont(new Font ("Cooper Black",Font.ITALIC,18));
		        comboBox2.setBackground(Color.WHITE);
		       
		        
		        
		    // JPanel for JRadio Button
		       
			    JPanel option1 = new JPanel();
			    option1.setLayout(new FlowLayout(FlowLayout.CENTER,0,60));
			            option1.setBackground(new Color (0x404040));
			            option1.add(naine);
			            option1.add(humaine);
			            option1.add(ogresse);
			   
			            
			
		
			    	     
			    	     
				        // Text menu
				        JPanel textbox = new JPanel(new FlowLayout());
				        text.setPreferredSize(new Dimension(325, 300));
				        textbox.setBackground(new Color (0x404040));
				        textbox.add(text);
				       
					    
				
				        
				        // JPanel premi�re grille
				        
				JPanel grillep = new JPanel(new GridLayout(3, 1));
					    
					    grillep.setBackground(new Color (0x404040));
			            grillep.add(option);
			            grillep.add(option1);
			          
			    JPanel posgrille = new JPanel();
				        posgrille.add(BorderLayout.CENTER,grillep);
				        posgrille.setBackground(new Color (0x404040));
				        
				                
				     
				        
				        // JPanel JButton valider
				        
					    JPanel option2 = new JPanel();
					    option2.setLayout(new FlowLayout(FlowLayout.CENTER,30,0));
					            option2.setBackground(new Color (0x404040));
					            option2.add(valider);
					            option2.add(confirmer);
					            option2.add(retour);
					    JPanel pos2 = new JPanel();
						        pos2.add(BorderLayout.SOUTH,option2);
						        pos2.setBackground(new Color (0x404040));
						   

						        this.getContentPane().add(BorderLayout.SOUTH,pos2);
						        pos2.setPreferredSize(new Dimension(0,200));
						        
						        // Grande fen�tre
						        
						        
				 JPanel biggest = new JPanel(new GridLayout(1, 3));
						 
						 biggest.setBackground(new Color (0x404040));
						 biggest.add(grillep);
						biggest.add(textbox);
				 JPanel posBigest = new JPanel();
				 posgrille.add(BorderLayout.CENTER,biggest);
				 posgrille.setBackground(new Color (0x404040));
				 
				 
				 //JPanel neon = new JPanel();
				// neon.add(labelneon);				 
					        

			        this.getContentPane().add(BorderLayout.CENTER,posgrille);
			      // this.getContentPane().add(BorderLayout.EAST,labelneon);
					        
						        
						        
				        
				      //Ajouter action ActionL
				        valider.addActionListener(this);
				        retour.addActionListener(this);
				        
				        
				        // JButton
				        
				        valider.addActionListener(this);
				        valider.setFocusable(false); 
				        valider.setForeground(Color.black);
				        valider.setBackground(Color.WHITE);
				        valider.setFont(new Font ("Cooper Black",Font.ITALIC,18));
				        
				        confirmer.addActionListener(this);
				        confirmer.setFocusable(false); 
				        confirmer.setForeground(Color.black);
				        confirmer.setBackground(Color.WHITE);
				        confirmer.setFont(new Font ("Cooper Black",Font.ITALIC,18));
				        
				        retour.addActionListener(this);
				        retour.setFocusable(false); 
				        retour.setForeground(Color.black);
				        retour.setBackground(Color.WHITE);
				        retour.setFont(new Font ("Cooper Black",Font.ITALIC,18));
				        
				        
		   //JRadioButton
		           
			    naine.setFocusable(false);        
			    humaine.setFocusable(false);  
			    ogresse.setFocusable(false);
		        naine.setForeground(Color.black); // couleur �criture boutton
		        naine.setFont(new Font ("Cooper Black",Font.ITALIC,18));
		        naine.setBackground(Color.WHITE);// couleur boutton
		        humaine.setForeground(Color.black);
		        humaine.setFont(new Font ("Cooper Black",Font.ITALIC,18));
		        humaine.setBackground(Color.WHITE);
		        ogresse.setForeground(Color.black);
		        ogresse.setFont(new Font ("Cooper Black",Font.ITALIC,18));
		        ogresse.setBackground(Color.WHITE);
		        
		        // grille principale
		        grillep.add(option);
		        grillep.add(option1);
		        
		        
		        Controler_Commande ctr=new Controler_Commande(this,labelp,c);
		        confirmer.addActionListener(ctr);
		        retour.addActionListener(ctr);

		        confirmer.setVisible(false);
		        
		        
		        
		   
		       
	  }
	  
	  double p = 0;
	  public void actionPerformed(ActionEvent clicked)
	    {
		  
		  String date;
		  int q = comboBox2.getSelectedIndex()+1;
		ligneCommande l = new ligneCommande (q);
		
		
		  
		p = 9.99;
		
	
		
	        if (clicked.getSource() == valider)
	        	
	        {
	        	text.setFont(new Font ("Calibri",Font.PLAIN,18));
	        	
	            text.setText("  Facture :\n" +
	                    "--------------------\n");
	 
	            //Taille
	            
	            if (naine.isSelected())
	            {
	                text.append("Taille : naine -3,33euros par pizza  \n");
	                p -= (p*(1./3.));
	            }
	            else if (humaine.isSelected())
	            {
	                text.append("Taille : humaine\n");
	            }
	            else if (ogresse.isSelected())
	            {
	                text.append("Taille : ogresse +3,33euros par pizza \n");
	                
	                p +=(p*(1./3.)) ;
	                
	            }
	            
	           
	 
	            //Pizza
	            text.append("Pizza :  " + nosProduits[comboBox1.getSelectedIndex()] + "\n" );
	            text.append("Nombre : " + quantitep[comboBox2.getSelectedIndex()] + "\n");
	            text.append("Prix : " + c.getPrice(p) *q+ " euros \n"  );
	            text.append( date = new SimpleDateFormat("E yyyy-MM-dd HH:mm:ss").format(new Date()));
	            text.setEditable(false);
	            confirmer.setVisible(true);
	           
	            
	            
	    }
	        
	    }
	  
	  

}
