/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicMedecin;

import java.beans.*;
import java.util.Vector;

/**
 *
 * @author florentcardoen
 */
public class RecordBean implements PropertyChangeListener {
    
    protected Vector listListeners;
    public RecordBean()
    {
        listListeners = new Vector();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("PropertyChanged");
        
        notifyAlertDetected((String) evt.getNewValue());
    }
    protected void notifyAlertDetected(String patientmedecin)
    {
        System.out.println("NotifyAlertDetected");
     
        String [] messagePart = patientmedecin.split("/");

        NeedAnswerEvent e = new NeedAnswerEvent (this, messagePart[0], messagePart[1]);
        int n = listListeners.size();
        for (int i=0; i<n; i++)
        {
            NeedAnswerListener obj = (NeedAnswerListener) listListeners.elementAt(i); 
            obj.needAnswerDetected(e);
        }
    }
    public void addAlertListener (NeedAnswerListener al) 
    {
        if (!listListeners.contains(al)) 
            listListeners.addElement(al); 
    
    }

}   
