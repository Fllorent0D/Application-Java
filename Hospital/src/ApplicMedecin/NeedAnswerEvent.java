/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicMedecin;

import java.util.EventObject;

/**
 *
 * @author florentcardoen
 */
public class NeedAnswerEvent extends EventObject {
    public String Medecin;
    public String Patient;
    

    public NeedAnswerEvent(Object s , String m, String p)
    {
        super(s);
        Medecin = m;
        Patient = p;   
    }
    
}
