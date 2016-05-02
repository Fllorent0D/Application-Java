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
public class PersonnelMedical extends PersonnelHopital implements Serializable {
    private String INAMI;
   
    public String getINAMI()
    {
        return INAMI;
    }
    public void setINAMI(String i)
    {
        INAMI = i;
    }
}
