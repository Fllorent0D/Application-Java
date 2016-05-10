
package ApplicMedecin;

import java.beans.Beans;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author florentcardoen
 */
public class ApplicMedecin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReceivingBean Receive = null;
        try {
            Receive = (ReceivingBean) Beans.instantiate(null,"ApplicMedecin.ReceivingBean");
        } catch (IOException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }
        RecordBean Record = null;
        try {
            Record = (RecordBean) Beans.instantiate(null,"ApplicMedecin.RecordBean");
        } catch (IOException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }
        ChooseAnswerBean ChooseAnswer = null;
        try {
            ChooseAnswer = (ChooseAnswerBean) Beans.instantiate(null,"ApplicMedecin.ChooseAnswerBean");
        } catch (IOException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Connecter les beans
        Receive.addPropertyChangeListener(Record);
        Record.addAlertListener(ChooseAnswer);
        ChooseAnswer.addAlertListener(Receive);
        
        
        //Receive.setMedecinPatient("Florent/test");
        //Démarre la réception de messages
        Receive.init();
        Receive.run();
    }
    
}
