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
abstract public class PersonnelHopital extends Personne implements Utilisateur {
    protected String matricule;
    String getMatricule()
    {
        return matricule;
    }
}
