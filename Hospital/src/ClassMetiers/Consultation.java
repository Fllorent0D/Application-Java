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
public final class Consultation {
    private String date;
    private Medecin medecin;
    private Patient patient;
    
    public Consultation(Medecin med, Patient pat, String date)
    {
        setDate(date);
        setMedecin(med);
        setPatient(pat);
    }
    @Override
    public String toString()
    {
        return "Consultation de " + patient + " avec " + medecin;
    }
    public Medecin getMedecin()
    {
        return medecin;
    }
    public Patient getPatient()
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
    public void setMedecin(Medecin m)
    {
        medecin = m;
    }
    
    public void setPatient(Patient p)
    {
        patient = p;
    }
    
    
}
