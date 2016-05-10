/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicMedecin;

/**
 *
 * @author florentcardoen
 */
public class ChooseAnswerBean implements NeedAnswerListener {


    @Override
    public void needAnswerDetected(NeedAnswerEvent ev) {
        System.out.println("Recu "+ev.Medecin + " et " + ev.Patient);
    }
    
}
