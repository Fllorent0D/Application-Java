/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMetiers;

/**
 *
 * @author florentcardoen
 */
public class PatientAlreadyRegistered extends Exception {
    public PatientAlreadyRegistered(String s)
    {
        super(s);
    }
}
