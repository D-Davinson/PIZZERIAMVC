package model;
import java.util.*;

/**
 * 
 */
public class Commande {

    /**
     * Default constructor
     */
	
	    public int numCommande;
	    public String taille;
	    public String nomPizza;
	    public String dateCommande ;
	    
    public Commande(int n , String t , String np, String c) {
    n = numCommande;
    t = taille;
    np = nomPizza;
    c = dateCommande;
    }


    public Vector<ligneCommande> listelignedecommande = new Vector<ligneCommande>();


    public Livraison livraison;

    public Client clt;
    public double price = 0;
   

    // Methods
    
    public void ajoutligneCommande(ligneCommande l){
    	listelignedecommande.add(l);
    }
    
    public void ajoutClient(Client i){
    	clt = i;
    }
    
    public void ajoutLivraison (Livraison i) {
    	livraison =i;
    }
    
    public double getPrice(double p) {
        price = p;
        for(ligneCommande lc : listelignedecommande) {
            price =  (lc.quantite*lc.pizza.prix)+price;
        }
        return price;
    }
    
  /*  public int getnumCommande () {
    	
    	int numCommande=0;
    	
    	int [] zero =new int[500];
    	int low = 0;
    	int high = 1000;
    	ArrayList<Integer> dispo = new ArrayList<Integer>();
    	
    	for(int i= low;i<high;i++){
    	  dispo.add(i);
    	}
    	for(int i=1;i<zero.length;i++){
    	int random = (int)(Math.random() * dispo.size()) ;
    	zero[i] =dispo.remove(random);
    	}
    	return zero [numCommande];
    } */
    
    
    	
    	
    
    
}