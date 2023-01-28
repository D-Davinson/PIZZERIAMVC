package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.Controler_Employer;
import model.Employer;
public class GUI_Employer extends JFrame{
	
	
	
	model.Employer emp ;
	private JPanel cls;
	private JPanel option;
	private JPanel pos1;
	private JPanel pos2;
	private JLabel labele ;
	private JButton login = new JButton("Connexion");
	private JButton  reset = new JButton("Annuler");
	private JButton  retour = new JButton("Retour");
	private JButton ok = new JButton ("Ok");
	
	
	private JLabel id = new JLabel("ID :");
	private JLabel mdp = new JLabel("Mot de passe :");
	private JTextField idtf=new JTextField("", 20) ;
	private JPasswordField mdptf=new JPasswordField("", 20) ;
	private JTextArea text = new JTextArea();
	
		public GUI_Employer(Employer a) {
			emp = a ;
			
			//JLabel
			labele = new JLabel();
			ImageIcon imageIcon = new ImageIcon(new ImageIcon("neon5.png").getImage().getScaledInstance(100, 100,Image.SCALE_AREA_AVERAGING));
			labele.setText("ESPACE EMPLOYER");
			labele.setIcon(imageIcon);
	        labele.setForeground(Color.white);
	        labele.setFont(new Font ("Cooper Black",Font.ITALIC,30));
	        labele.setBackground(new Color (0x404040));
	        labele.setOpaque(true);
	        labele.setPreferredSize(new Dimension(200,200));
	        labele.setVerticalAlignment(JLabel.CENTER);
	        labele.setHorizontalAlignment(JLabel.CENTER);
	        this.getContentPane().add(BorderLayout.NORTH,labele);
	        
	        
	     // JFrame
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         this.setTitle("EMPLOYER");
	         ImageIcon image = new ImageIcon("pizza1.png");
	         this.setIconImage(image.getImage());
	         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	         
	         // JPanel    
	         cls = new JPanel();
	         cls.setLayout(new GridLayout(3,1,-190,50));
	         cls.setBackground(new Color (0x404040));
	         cls.add(id);
	         cls.add(idtf);
	         cls.add(mdp);
	         cls.add(mdptf);
	         
	         
	         option = new JPanel();
	         option.setLayout(new GridLayout(1,3,20,30));
	         option.setBackground(new Color (0x404040));
	         option.add(login);
	         option.add(reset);
	         option.add(retour);

	         
	         
	         pos1 = new JPanel();
	        

	     		pos1.add(BorderLayout.NORTH,cls);
		        pos1.setBackground(new Color (0x404040));

		        this.getContentPane().add(BorderLayout.CENTER,pos1);
		        
		        pos2 = new JPanel();
		     	pos2.add(BorderLayout.SOUTH,option);
		        pos2.setBackground(new Color (0x404040));
		        pos2.setPreferredSize(new Dimension(0,250));
		        this.getContentPane().add(BorderLayout.SOUTH,pos2);

		        

		  //Font
		        id.setFont(new Font ("Cooper Black",Font.ITALIC,25));
		        id.setForeground(Color.white);
		        idtf.setFont(new Font ("Cooper Black",Font.PLAIN,20));
		        mdp.setFont(new Font ("Cooper Black",Font.ITALIC,25));
		        mdp.setForeground(Color.white);
		        mdptf.setFont(new Font ("Cooper Black",Font.PLAIN,20));
		        login.setFocusable(false);
		        login.setFont(new Font ("Cooper Black",Font.ITALIC,20));
		        login.setForeground(Color.black);
		        login.setBackground(Color.WHITE);
		        reset.setFocusable(false);
		        reset.setFont(new Font ("Cooper Black",Font.ITALIC,20));
		        reset.setForeground(Color.black);
		        reset.setBackground(Color.WHITE);
		        retour.setFocusable(false);
		        retour.setFont(new Font ("Cooper Black",Font.ITALIC,20));
		        retour.setForeground(Color.black);
		        retour.setBackground(Color.WHITE);

		
		        
		        Controler_Employer ctr=new Controler_Employer(	this,
		        												labele,mdp,id,
		        												cls,pos1,pos2,option,
		        												text,
		        												idtf,
		        												mdptf,
		        												reset,login,ok,
		        												emp);
		        
	            reset.addActionListener(ctr);
	            login.addActionListener(ctr);
	            ok.addActionListener(ctr);
	            retour.addActionListener(ctr);
		
				}
	
	    	}
		
			
			
		
		
