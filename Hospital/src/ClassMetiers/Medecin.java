package ClassMetiers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author florentcardoen
 */
public class Medecin extends PersonnelMedical implements Serializable {
    private String specialite;
    private String service;
    
    public Medecin(String nom, String prenom, String telephone, String adresse, String INAMI, String specialite, String service, String matricule) throws DoctorMissingException
    {
        if(nom.length() != 0)
           setNom(nom);
        else
            throw new DoctorMissingException("Vous devez rentrer un nom au nouveau médecin");
        
        setPrenom(prenom);
        setTelephone(telephone);
        setAdresse(adresse);
        setINAMI(INAMI);
        setSpecialite(specialite);
        setService(service);
        setMatricule(matricule);

    }
    @Override
    public String toString()
    {
        return "Dr. " + getNom();
    }
    public String getId()
    {
        return getINAMI() + getNom();
    }
    
    public String getService()
    {
        return service;
    }
    public String getSpecialite()
    {
        return specialite;
    }
    public void setSpecialite(String s)
    {
        specialite = s;
    }
    public void setService(String s)
    {
        service = s;
    }
}
