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
public class Infirmier extends PersonnelHopital{
    private String specialite;
    private String service;
    
    public Infirmier(String spec, String ser)
    {
        specialite = spec;
        service = ser;
    }
    
    public String getSpecialite()
    {
        return specialite;
    }
    
    public String getService()
    {
        return service;
    }
}
