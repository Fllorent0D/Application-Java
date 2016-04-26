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
public class Consultation {
    private String date;
    private Medecin medecin;
    private Patient patient;
    
    public Consultation(Medecin med, Patient pat, String date)
    {
        this.date = date;
        this.medecin = med;
        this.patient = pat; 
    }
    @Override
    public String toString()
    {
        return "Consultation de " + patient + " avec " + medecin;
    }
    
    
}
