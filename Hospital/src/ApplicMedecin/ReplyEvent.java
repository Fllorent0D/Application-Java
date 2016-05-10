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
public class ReplyEvent extends EventObject {
    public String message ;
    public ReplyEvent(Object s, String m)
    {
        super(s);
        message = m;
    }
}
