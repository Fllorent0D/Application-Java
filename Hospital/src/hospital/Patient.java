/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author florentcardoen
 */
public class Patient extends Public implements Identifiable{
    private String ONSS;
    public Patient(String nom, String prenom, String adresse, String telephone, String ONSS, String datenaissance)
    {
        this.nom = nom;;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.ONSS = ONSS;
        this.datenaissance = datenaissance;
    }
    public String getId()
    {
        return "a";
    }
    @Override
    public String toString()
    {
        return nom + " " + prenom;
    }
}
