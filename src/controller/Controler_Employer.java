package controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

import model.*;
import view.*;

public class Controler_Employer implements ActionListener{
	private JFrame fp;
	private JLabel labele,mdp,id;
	private JPanel cls,pos1,pos2,option;
	private JTextArea text;
	private JTextField idtf;
	private JPasswordField mdptf;
	private JButton reset,login,ok;
	private Employer emp;
	
	public Controler_Employer(	JFrame f,
								JLabel l, JLabel mdpc , JLabel idc,
								JPanel clsc , JPanel pos1c , JPanel pos2c, JPanel optionc,
								JTextArea textc,
								JTextField idtfc,
								JPasswordField mdptfc,
								JButton resetc , JButton loginc , JButton okc,
								Employer e ) {
		fp = f;
		labele = l;
		mdp = mdpc;
		id = idc;
		cls = clsc;
		pos1 = pos1c;
		pos2 = pos2c;
		option = optionc;
		text = textc;
		mdptf = mdptfc;
		idtf = idtfc;
		reset = resetc;
		login = loginc;
		ok = okc;
		emp = e;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(((JButton)e.getSource()).getText().equals("Ok")) {
		       fp.dispose();
				Pizzeria piz = new Pizzeria("BIENVENU CHEZ RAPIZZA ! ");
		       GUI_Pizzeria v1 = new GUI_Pizzeria(piz);
		       v1.setVisible(true);
		       }
		
		if(((JButton)e.getSource()).getText().equals("Retour")) {
			fp.dispose();
			Pizzeria piz = new Pizzeria("BIENVENU CHEZ RAPIZZA ! ");
		       GUI_Pizzeria v1 = new GUI_Pizzeria(piz);
		       v1.setVisible(true);
		       
		}
		
		if(e.getSource()== reset) {
			
    		mdptf.setText("");
    		idtf.setText("");

    		}
		
		else if(e.getSource()== login) {
			
            	String mdpd = String.valueOf(mdptf.getPassword());
    			String idf = idtf.getText();
    			String mdpe = String.valueOf(mdptf.getPassword());
    			String idfe = idtf.getText();
    			
    			if (idf.equals("Davinson") && mdpd.equals("0000")) {
    				ImageIcon icon = new ImageIcon(new ImageIcon("valider.png").getImage().getScaledInstance(40, 30, Image.SCALE_DEFAULT));
    				JOptionPane.showOptionDialog(null,"Connexion reussite" , "SUCCES", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, icon,null, 0);
    				
    				
    				
    				pos2.setVisible(false);
    				pos1.setVisible(false);
    				option.setVisible(false);
    				cls.setVisible(false);
    				mdptf.setVisible(false);
    				idtf.setVisible(false);
    				mdp.setVisible(false);
    				id.setVisible(false);
    				reset.setVisible(false);
    				login.setVisible(false);
    				
    				// Text menu employer Davinson
    		        
    		        JPanel textbox = new JPanel(new FlowLayout());
    		        textbox.add(text);
    		        
    		        text.setPreferredSize(new Dimension(800, 500));
                    text.setFont(new Font ("Calibri",Font.PLAIN,15));
                   
                    
                    JPanel post = new JPanel ();
                    
                    post.add(BorderLayout.CENTER,textbox);
                    post.setBackground(new Color (0x404040));
                    fp.getContentPane().add(BorderLayout.CENTER,post);
                    
    	        	
    	            text.setText("--- IDENTIFICATION --- \n" +
    	                    "NOM : DOGLAS PRINCE \n" +
    	                    "PRENOM : DAVINSON \n" +
    	                    "POSTE : DIRECTEUR GÉNERAL \n" +
    	                    "SALAIRE : 5845 € \n " +
    	                    "LANGUE 1 : FRANÇAIS \n" +
    	                    "LANGUE 2 : ANGLAIS \n \n" +
    	                    "--- DATES --- \n"+
    	                    "DATE DE NAISSANCE : 24-12-2000 \n"+
    	                    "ANCIENNETÉ : 03-09-2012 \n \n"+
    	                    "--- ADRESSE --- \n" +
    	                    "ADRESSE : 174 RUE DUFONT \n" +
    	                    "VILLE : PARIS \n" +
    	                    "CODE POSTAL : 75123 \n \n" +
    	                    "--- COMMUNICATIONS --- \n" +
    	                    "TELEPHONE : +33 6 22 24 78 99 \n" +
    	                    "E-MAIL : doglas.rapiza@gmail.fr \n");
    	            
    		        text.setEditable(false);
    		        
    		        // OK JButton
    		        JPanel o = new JPanel();
    		         o.setLayout(new GridLayout(1,1));
    		         o.setBackground(new Color (0x404040));
    		         o.add(ok);
    		       
    		        JPanel poso = new JPanel();
    			     	poso.add(BorderLayout.SOUTH,o);
    			        poso.setBackground(new Color (0x404040));
    			        poso.setPreferredSize(new Dimension(0,70));
    			        fp.getContentPane().add(BorderLayout.SOUTH,poso);
    			        
    			        ok.setFocusable(false);
    			        ok.setFont(new Font ("Cooper Black",Font.PLAIN,18));
    			        ok.setForeground(Color.black);
    			        ok.setBackground(Color.WHITE);
    		     	
    		        
    			}
        			
        			else if (idfe.equals("Exauce") && mdpe.equals("1111")) {
        				ImageIcon icon = new ImageIcon(new ImageIcon("valider.png").getImage().getScaledInstance(40, 30, Image.SCALE_DEFAULT));
        				JOptionPane.showOptionDialog(null,"Connexion reussite" , "SUCCES", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, icon,null, 0);
        			
        				
        				
        				pos2.setVisible(false);
        				pos1.setVisible(false);
        				option.setVisible(false);
        				cls.setVisible(false);
        				mdptf.setVisible(false);
        				idtf.setVisible(false);
        				mdp.setVisible(false);
        				id.setVisible(false);
        				reset.setVisible(false);
        				login.setVisible(false);
        				
        				// Text menu employer Davinson
        		        
        		        JPanel textbox = new JPanel(new FlowLayout());
        		        textbox.add(text);
        		        
        		        text.setPreferredSize(new Dimension(800, 500));
                        text.setFont(new Font ("Calibri",Font.PLAIN,15));
                       
                        
                        JPanel post = new JPanel ();
                        
                        post.add(BorderLayout.CENTER,textbox);
                        post.setBackground(new Color (0x404040));
                        fp.getContentPane().add(BorderLayout.CENTER,post);
                        
        	        	
        	            text.setText("--- IDENTIFICATION --- \n" +
        	                    "NOM : MAKELE \n" +
        	                    "PRENOM : EXAUCE \n" +
        	                    "POSTE : RESPONSABLE MARKETING \n" +
        	                    "SALAIRE : 4845 € \n " +
        	                    "LANGUE 1 : FRANÇAIS \n" +
        	                    "LANGUE 2 : ANGLAIS \n \n" +
        	                    "--- DATES --- \n"+
        	                    "DATE DE NAISSANCE : 17-02-2002 \n"+
        	                    "ANCIENNETE : 11-11-2014 \n \n"+
        	                    "--- ADRESSE --- \n" +
        	                    "ADRESSE : 23 RUE MARCEL BERTHELOT \n" +
        	                    "VILLE : PARIS \n" +
        	                    "CODE POSTAL : 75023 \n \n" +
        	                    "--- COMMUNICATIONS --- \n" +
        	                    "TELEPHONE : +33 7 45 55 63 20 \n" +
        	                    "E-MAIL : exauce.rapiza@gmail.fr \n");
        	            
        		        text.setEditable(false);
        		        
        		        // OK JButton
        		        JPanel a = new JPanel();
        		         a.setLayout(new GridLayout(1,1));
        		         a.setBackground(new Color (0x404040));
        		         a.add(ok);
        		       
        		        JPanel posa = new JPanel();
        			     	posa.add(BorderLayout.SOUTH,a);
        			        posa.setBackground(new Color (0x404040));
        			        posa.setPreferredSize(new Dimension(0,70));
        			        fp.getContentPane().add(BorderLayout.SOUTH,posa);
        			        
        			        ok.setFocusable(false);
        			        ok.setFont(new Font ("Cooper Black",Font.PLAIN,18));
        			        ok.setForeground(Color.black);
        			        ok.setBackground(Color.WHITE);
        		     	
        		        
        			}
    			else {
    				JOptionPane.showMessageDialog(null, " ID ou mot de passe érroné","ERREUR",JOptionPane.ERROR_MESSAGE);
        		
    			}
    		}
		
	}
	}
