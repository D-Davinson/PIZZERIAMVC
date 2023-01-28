package model;
import java.util.*;

/**
 * 
 */
public class Employer {

	/**
     * Default constructor
     */
 
    public String nom ;
    public String prenom ;
    public Date dateAnniv ;
    public int salaire ;
    public Pizzeria employeur;
    public int id;
    
    public Employer( String n, String p, Date a, int s, int i) {
    	
    	n=nom;
    	p=prenom;
    	a=dateAnniv;
    	s=salaire;
    	i=id;
    	
    }
    

}