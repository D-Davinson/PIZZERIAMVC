package model;
import java.util.*;

/**
 * 
 */
public class Pizzeria {

    /**
     * Default constructor
     */
	
    public Pizzeria(String np) {
    	
    nom=np;
    }
    public String nom;

    public Vector<Pizza> pizza = new Vector<Pizza>();

    public Vector<Employer> salarie = new Vector<Employer>();
    
    // public Vector<Client> listeClient = new Vector<Client>();
    
    // Methods
    
    public Pizza getPizza(String n){
    	for(Pizza p : pizza) {
    		if(p.nPizza.equals(n)) {
    			return p;
    		}
    	} 
    	return null;
    }
    
    
    public void addPizza(Pizza p){
    	pizza.add(p);
    }
    public void deletePizza ( Pizza p ) {
    	pizza.remove(p);
    	
    }
    
    
    public Employer getEmployer(int i){
    	for(Employer e : salarie) {
    		if (e.id==i) {
    			return e;
    		}
    	}
    	return null;
    	}
    	
    	
    	
 
    	
    	
    
}

















