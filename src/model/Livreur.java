package model;
import java.util.*;

/**
 * 
 */
public class Livreur extends Employer {

    /**
     * Default constructor
     */
    public Livreur() {
    	
    	
    	 
    }

    /**
     * 
     */
    public Vector<Livraison> listelivraison = new Vector<Livraison>();
    
    // method
    
    public void ajoutLivraison(Livraison l){
    	listelivraison.add(l);
    }
    
	
		 
		 
	 
    
}