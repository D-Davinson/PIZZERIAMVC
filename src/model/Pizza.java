package model;
import java.util.*;


public class Pizza {

	/**
     * Default constructor
     */
	
	 public String nPizza;
	 public double prix;

    
    public Pizza(  double p, String n) {
    	
    	
    	prix = p;
    	nPizza = n;
    	
    }

   
  
    public Vector<ligneCommande> listelignedecommande  = new Vector<ligneCommande>();

    public Vector<Pizzeria> listepizza = new Vector<Pizzeria>();

// methods
    
    public void ajoutligneCommande(ligneCommande l){
    	listelignedecommande.add(l);
    }
    
    public void ajoutPizzeria (Pizzeria p) {
    	listepizza.add(p);
    }
    
   // Faire une fonction liste ingredient
    
}







