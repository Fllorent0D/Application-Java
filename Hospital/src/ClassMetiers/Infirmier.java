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
public class Infirmier extends PersonnelHopital{
    private String specialite;
    private String service;
    
    public Infirmier(String spec, String ser)
    {
        setSpecialite(spec);
        setService(ser);
    }
    
    public void setSpecialite(String s)
    {
        specialite = s;
    }
    
    public void setService(String s)
    {
        service = s;
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
