/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ApplicMedecin;

import java.beans.*;
import java.util.*; 
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import network.NetworkBasicServer;

/**
 *
 * @author florentcardoen
 */
public class ReceivingBean implements ReplyListener {
    protected PropertyChangeSupport GestProp = new PropertyChangeSupport(this);
    private String MedecinPatient;
    private NetworkBasicServer server;
    
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

    @Override
    public void replyDetected(ReplyEvent ev) {
        server.sendMessage(ev.message);
        
    }
    public void init()
    {
        server = new NetworkBasicServer(5000, null);
        
    }
    public void run()
    {
        while(true)
        {
            try {
                Thread.sleep(1000);
                String messageRecu = server.getMessage();
                if(!messageRecu.equals("RIEN"))
                {
                    setMedecinPatient(messageRecu);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(ReceivingBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
