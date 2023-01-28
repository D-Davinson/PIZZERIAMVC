package model;
import java.util.*;

/**
 * 
 */
public class Livraison {

    /**
     * Default constructor
     */
	
	 public int distance;
     public Livraison(int d) {

    	 
    	 d = distance;
    	
    	   
    }
     public Vector<Transport> transport = new Vector<Transport>();
   
    public Commande commande;
    public Transport moyenTransport;
    public Livreur livreur;
    
    // methods
    
    public void ajoutmoyenTransport(Transport t){
    	moyenTransport = t;
    }
    
    public void ajoutCommande (Commande c) {
    	commande = c;
    }
    
    public void ajoutLivreur (Livreur l) {
    	livreur = l;
    }
    
 public int getDureeLivraison () {
    	
    	 int duree=0;
    	for (Transport lc : transport ) {
    		duree = (distance/lc.vitesse);
    	}
    	
    	return duree;
    	
    }
 
 public double freePizza () {
	 
	 

	if (getDureeLivraison()>30) {
		getPrice()=0;
		
	}
		 
}

 
		}
		 



