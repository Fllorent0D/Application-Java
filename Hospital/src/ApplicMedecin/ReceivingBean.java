/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ApplicMedecin;

import java.beans.*;
import java.util.*; 
import java.io.*;

/**
 *
 * @author florentcardoen
 */
public class ReceivingBean {
    protected PropertyChangeSupport GestProp = new PropertyChangeSupport(this);
    private String MedecinPatient;

    public ReceivingBean()
    {
        
    }
    public void setMedecinPatient(String mp)
    {
        String ancienMedecinPatient = MedecinPatient;
        MedecinPatient = mp;
        GestProp.firePropertyChange("MedecinPatient", ancienMedecinPatient, MedecinPatient);
    }
    public void addPropertyChangeListener(PropertyChangeListener l) 
    {
        GestProp.addPropertyChangeListener(l);
    }
    public void removePropertyChangeListener(PropertyChangeListener l)
    {
        GestProp.removePropertyChangeListener(l);
    } 
}
