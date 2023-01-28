package model;
import java.util.*;

/**
 * 
 */
public class Client {

    /**
     * Default constructor
     */
	
	    public int telephone ;
	    public float solde ;
	    public String adresse ;

    public Client(int t , float s , String a) {
    	t = telephone;
    	s = solde;
    	a = adresse;
    }
 
    public Vector<Commande> listComm = new Vector<Commande>();
    
    // Methods
    
    public void ajoutCommande(Commande c){
    	listComm.add(c);
    }
   
    public int getCommande(Date d){
    	for ( Commande p : listComm) {
    		if( p.dateCommande.equals(d)) {
    			return p.numCommande;
    		}
    	}
    	return 0;
    } 
    
    
    public void adListClient (int a) {
    	ArrayList<Integer> tab = new ArrayList<Integer>();
    	
    	if( a == telephone) {
    		
    		telephone =a; 		
    	}
    	tab.add(a);
		
    	
    }
    
}


