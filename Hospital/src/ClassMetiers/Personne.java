package ClassMetiers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author florentcardoen
 */
public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String datenaissance;
    
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
    
    public void setNom(String n)
    {
        nom = n;
    }
    
    public void setPrenom(String p)
    {
        prenom = p;
    }
    public void setAdresse(String a)
    {
        adresse = a;
    }
    
    public void setTelephone(String t)
    {
        telephone = t;
    }
    public void setDateNaissance(String dn)
    {
        datenaissance = dn;
    }
    
}
