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
abstract public class PersonnelHopital extends Personne implements Utilisateur {
    private String matricule;
    public String getMatricule()
    {
        return matricule;
    }
    public void setMatricule(String m)
    {
        matricule = m;
    }
}
