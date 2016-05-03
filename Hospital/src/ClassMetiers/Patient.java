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
public class Patient extends Public implements Identifiable{
    private String ONSS;
    
    public Patient(String nom, String prenom, String adresse, String telephone, String ONSS, String datenaissance) throws PatientMissingException
    {
        if(nom.length() == 0)
            throw new PatientMissingException("Veuillez rentrer le nom du patient");
        else
            setNom(nom);
        
        setPrenom(prenom);
        setAdresse(adresse);
        setTelephone(telephone);
        setONSS(ONSS);
        setDateNaissance(datenaissance);
       
    }
    public String getONSS()
    {
        return ONSS;
    }
    public void setONSS(String o)
    {
        ONSS = o;
    }
    
    public String getId()
    {
        return ONSS;
    }
    @Override
    public String toString()
    {
        
        return getNom() + " " + getPrenom();
    }

    public boolean equals(Patient o) 
    {
        return (getNom().equals(o.getNom()) && 
                getPrenom().equals(o.getPrenom()) &&
                getAdresse().equals(o.getAdresse()) && 
                getDateNaissance().equals(o.getDateNaissance()) &&
                getTelephone().equals(o.getTelephone()) && 
                getONSS().equals(o.getONSS())
                );
    }
}
