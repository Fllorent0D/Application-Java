/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicMedecin;

import java.util.Vector;

/**
 *
 * @author florentcardoen
 */
public class ChooseAnswerBean implements NeedAnswerListener {
    protected Vector listListeners;
    protected Vector<String> responses;
    public ChooseAnswerBean()
    {
        responses = new Vector();
        responses.add("Oui");
        responses.add("Non");
        responses.add("Jamais");
        responses.add("Plus tard");

        listListeners = new Vector();
    }
    protected void notifyAlertDetected()
    {
     
        ReplyEvent e = new ReplyEvent (this, randResponse());
        int n = listListeners.size();
        for (int i=0; i<n; i++)
        {
            ReplyListener obj = (ReplyListener) listListeners.elementAt(i); 
            obj.replyDetected(e);
        }
    }
    private String randResponse()
    {
        int rand = (int)(Math.random() * responses.size()); 
        return responses.get(rand);
    }
    public void addAlertListener (ReplyListener al) 
    {
        if (!listListeners.contains(al)) 
            listListeners.addElement(al); 
    
    }
    @Override
    public void needAnswerDetected(NeedAnswerEvent ev) {
        System.out.println("Recu "+ev.Medecin + " et " + ev.Patient);
        notifyAlertDetected();
    }
    
}
