/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicAccueil;

import javax.swing.JTextField;

/**
 *
 * @author florentcardoen
 */
public class Medecin extends PersonnelMedical{
    public String specialite;
    public String service;
    
    public Medecin(String nom, String prenom, String telephone, String adresse, String INAMI, String specialite, String service, String matricule) throws DoctorMissingException
    {
        if(nom.length() != 0)
           this.nom = nom;
        else
            throw new DoctorMissingException("Vous devez rentrer un nom au nouveau médecin");
        
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.INAMI = INAMI;
        this.specialite = specialite;
        this.service = service;
        this.matricule = matricule;
    }
    @Override
    public String toString()
    {
        return "Dr. " + this.nom;
    }

}
