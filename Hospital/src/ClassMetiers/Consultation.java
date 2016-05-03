package ClassMetiers;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author florentcardoen
 */
public final class Consultation implements Serializable {
    private String date;
    private String medecin;
    private String patient;
    
    public Consultation(Medecin med, Patient pat, String date)
    {
        setDate(date);
        setMedecin(med.getINAMI());
        setPatient(pat.getONSS());
    }
    public String stringMessage()
    {
        return this.toString() + '/'+ getMedecin() + '/'+ getPatient()  ;
    }
    
    @Override
    public String toString()
    {
        return "Consultation de " + patient + " avec " + medecin + "\n"; 
    }
    public String getMedecin()
    {
        return medecin;
    }
    public String getPatient()
    {
        return patient;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String d)
    {
        date = d;
    }
    public void setMedecin(String m)
    {
        medecin = m;
    }
    
    public void setPatient(String p)
    {
        patient = p;
    }
    
    
}
