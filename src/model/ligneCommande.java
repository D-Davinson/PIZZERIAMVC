package model;
import java.util.*;

/**
 * 
 */
public class ligneCommande {

    /**
     * Default constructor
     */
	
	 public int quantite;
     public ligneCommande(int q) {
    	
    	quantite = q;
    }
     public Commande commande;
     
	 public Pizza pizza;
	 
     // method
     
	  public void ajoutCommande (Commande c){
	    	commande = c;
	    }
	  
	  public void ajoutPizza (Pizza p){
	    	pizza = p;
	    }
	  
}