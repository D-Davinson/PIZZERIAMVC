package model;
import java.util.*;

/**
 * 
 */
public class Transport {

    /**
     * Default constructor
     */
	
	 public String nom ;
	 public int id;
	 public int vitesse;
	 
    public Transport(String n, int i, int v) {
    	
    	n = nom;
    	i = id;
    	v = vitesse;
    }

   
    public Vector<Livraison> listelivraison = new Vector<Livraison>();
    
    // methods
    
    public void ajoutLivraison(Livraison l){
    	listelivraison.add(l);
    }

}