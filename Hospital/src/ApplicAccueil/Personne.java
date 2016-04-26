/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicAccueil;

/**
 *
 * @author florentcardoen
 */
public class Personne {
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String telephone;
    protected String datenaissance;
    
    public String getNom()
    {
        return nom;
    }
    
    public String getPrenom()
    {
        return prenom;
    }
    
    public String getAdresse()
    {
        return adresse;
    }
    
    public String getTelephone()
    {
        return telephone;
    }
    
    public String getDateNaissance()
    {
        return datenaissance;
    }
}
