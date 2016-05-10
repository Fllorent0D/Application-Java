
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
        ReceivingBean BeanRecei = null;
        try {
            BeanRecei = (ReceivingBean) Beans.instantiate(null,"ApplicMedecin.ReceivingBean");
        } catch (IOException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }
        RecordBean BeanRecor = null;
        try {
            BeanRecor = (RecordBean) Beans.instantiate(null,"ApplicMedecin.RecordBean");
        } catch (IOException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }
        ChooseAnswerBean BeanChoose = null;
        try {
            BeanChoose = (ChooseAnswerBean) Beans.instantiate(null,"ApplicMedecin.ChooseAnswerBean");
        } catch (IOException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplicMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }


        BeanRecei.addPropertyChangeListener(BeanRecor);
        BeanRecor.addAlertListener(BeanChoose);
        
        BeanRecei.setMedecinPatient("Florent/test");
        
    }
    
}
