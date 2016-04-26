/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicAccueil;
import Login.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import network.NetworkBasicClient;
/**
 *
 * @author florentcardoen
 */
public class ApplicationAccueil extends javax.swing.JFrame {
    private NetworkBasicClient client = new NetworkBasicClient("localhost", 4800);
    
    private DefaultComboBoxModel MedecinsModel = new DefaultComboBoxModel();
    private ArrayList<Medecin> MedecinsListe = new ArrayList<>();
    private ArrayList<Consultation> ConsultationListe = new ArrayList<>();
    
    public ApplicationAccueil() {
        DialLogin login = new DialLogin(this, true);
        login.setVisible(true);
        
        initComponents();
        
        GenreGroup.add(MeRadio);
        GenreGroup.add(MrRadio);
        ObjetGroup.add(DocumentRadio);
        ObjetGroup.add(ConsultationRadio);
        ObjetGroup.add(HospitalisationRadio);

        MedecinsCombo.setModel(MedecinsModel);
        MedecinsModel.insertElementAt("<aucun>", 0);
        MedecinsCombo.setSelectedIndex(0);
        
        heureLabel.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenreGroup = new javax.swing.ButtonGroup();
        ObjetGroup = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MeRadio = new javax.swing.JRadioButton();
        MrRadio = new javax.swing.JRadioButton();
        pNomTextfield = new javax.swing.JTextField();
        pPrenomTextfield = new javax.swing.JTextField();
        pNaissanceTextfield = new javax.swing.JTextField();
        pAdresseTextfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ConsultationRadio = new javax.swing.JRadioButton();
        DocumentRadio = new javax.swing.JRadioButton();
        HospitalisationRadio = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ActionsRealisees = new javax.swing.JTextPane();
        MedecinsCombo = new javax.swing.JComboBox<>();
        SauverButton = new javax.swing.JButton();
        heureBtn = new javax.swing.JButton();
        heureLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        AddMedecinMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        pourDebutantBtn = new javax.swing.JMenuItem();
        InfoSystemBtn = new javax.swing.JMenuItem();
        AboutBtn = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Patient");

        jLabel2.setText("Nom");

        jLabel3.setText("Prenom");

        jLabel4.setText("Date de naissance");

        jLabel5.setText("Adresse");

        MeRadio.setText("Me");

        MrRadio.setSelected(true);
        MrRadio.setText("Mr");

        jLabel6.setText("Genre");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Objet");

        ConsultationRadio.setSelected(true);
        ConsultationRadio.setText("Consultation");
        ConsultationRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultationRadioActionPerformed(evt);
            }
        });

        DocumentRadio.setText("Document");
        DocumentRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentRadioActionPerformed(evt);
            }
        });

        HospitalisationRadio.setText("Hospitalisation");
        HospitalisationRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalisationRadioActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Assurance médicale");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Médecin");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Actions réalisées");

        ActionsRealisees.setEditable(false);
        jScrollPane2.setViewportView(ActionsRealisees);

        jScrollPane3.setViewportView(jScrollPane2);

        SauverButton.setText("Sauver");
        SauverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SauverButtonActionPerformed(evt);
            }
        });

        heureBtn.setText("Quelle heure?");
        heureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heureBtnActionPerformed(evt);
            }
        });

        heureLabel.setText("jLabel10");

        jMenu1.setText("Patients");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Médecins");

        AddMedecinMenu.setText("Nouveau");
        AddMedecinMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMedecinMenuActionPerformed(evt);
            }
        });
        jMenu2.add(AddMedecinMenu);

        jMenuItem2.setText("Lister");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Lister par spécialité");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("A propos");

        pourDebutantBtn.setText("Pour débutant");
        pourDebutantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pourDebutantBtnActionPerformed(evt);
            }
        });
        jMenu3.add(pourDebutantBtn);

        InfoSystemBtn.setText("Infos système");
        InfoSystemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoSystemBtnActionPerformed(evt);
            }
        });
        jMenu3.add(InfoSystemBtn);

        AboutBtn.setText("A propos");
        AboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutBtnActionPerformed(evt);
            }
        });
        jMenu3.add(AboutBtn);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SauverButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ConsultationRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DocumentRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HospitalisationRadio))
                    .addComponent(jLabel8)
                    .addComponent(jCheckBox1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MrRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MeRadio)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pAdresseTextfield)
                                            .addComponent(pNaissanceTextfield)
                                            .addComponent(pPrenomTextfield)
                                            .addComponent(pNomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(heureLabel))))
                            .addComponent(MedecinsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(heureBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(heureBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heureLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(pNomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pPrenomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pNaissanceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pAdresseTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MrRadio)
                    .addComponent(MeRadio))
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultationRadio)
                    .addComponent(DocumentRadio)
                    .addComponent(HospitalisationRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MedecinsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SauverButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMedecinMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMedecinMenuActionPerformed
        
        MedecinsAjouter nouvMedecinDialog = new MedecinsAjouter(this, true);
        nouvMedecinDialog.setVisible(true);
        MedecinsListe.add(nouvMedecinDialog.getNouveauMedecin());
        MedecinsModel.addElement(nouvMedecinDialog.getNouveauMedecin());
    }//GEN-LAST:event_AddMedecinMenuActionPerformed

    private void SauverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SauverButtonActionPerformed
        Consultation nouvelleConsultation = null;
        try {
            nouvelleConsultation = addConsultation();
        } catch (PatientMissingException ex) {
            Object[] possibilities = {"Simple oubli", "Pas de carte d'identité"};
            String erreur = (String)JOptionPane.showInputDialog(
                    this,
                    "Veuillez choisir le nom du patient",
                    "Hospital erreur",
                    JOptionPane.ERROR_MESSAGE,
                    null,
                    possibilities,
                    "ok");
            System.out.println("Cause de l'erreur : " + erreur);
            return;
        } catch (DoctorMissingException ex) {
            Object[] possibilities = {"Simple oubli", "Pas de médecins disponible", "Symptomes imprécis", "Autre"};
            String erreur = (String)JOptionPane.showInputDialog(
                    this,
                    "Veuillez choisir le nom du médecin",
                    "Hospital erreur",
                    JOptionPane.ERROR_MESSAGE,
                    null,
                    possibilities,
                    "ok");
            System.out.println("Il s'agit d'une consultation de "+ pNomTextfield.getText() +"\nCause de l'erreur : " + erreur);
            return;
        }
         
        StyledDocument document = (StyledDocument) ActionsRealisees.getDocument();
        try {
            document.insertString(document.getLength(), nouvelleConsultation.toString(), null);
        } catch (BadLocationException ex) {
            Logger.getLogger(ApplicationAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        client.sendStringWithoutWaiting(nouvelleConsultation.toString());
        
      
    }//GEN-LAST:event_SauverButtonActionPerformed
    private Consultation addConsultation() throws PatientMissingException, DoctorMissingException
    {
        if(pNomTextfield.getText().length() == 0)
        {
            throw new PatientMissingException("Le nom du patient est manquant");
        }
        
        Patient newPatient = new Patient(pNomTextfield.getText(), pPrenomTextfield.getText(), pAdresseTextfield.getText(), "0787" ,"ONSS" ,pNaissanceTextfield.getText()); 
        if(MedecinsListe.contains(MedecinsModel.getSelectedItem()))
        {
            Medecin med = MedecinsListe.get(MedecinsListe.indexOf(MedecinsModel.getSelectedItem()));
            Consultation newConsult = new Consultation(med, newPatient, "Test");
            return newConsult;
            
        }
        else
        {
            throw new DoctorMissingException("Le nom du médecin est manquant");
        }
    }


/**
 * Radio Buttons
 */
    private void DocumentRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentRadioActionPerformed
        MedecinsCombo.setEnabled(false);
    }//GEN-LAST:event_DocumentRadioActionPerformed
    private void HospitalisationRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalisationRadioActionPerformed
        MedecinsCombo.setEnabled(false);
    }//GEN-LAST:event_HospitalisationRadioActionPerformed
    private void ConsultationRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultationRadioActionPerformed
        MedecinsCombo.setEnabled(true);
    }//GEN-LAST:event_ConsultationRadioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        MedecinsLister listerMedecinDialog = new MedecinsLister(this, true, MedecinsListe);
        listerMedecinDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void pourDebutantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pourDebutantBtnActionPerformed
        debutantDialog dialog = new debutantDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_pourDebutantBtnActionPerformed

    private void InfoSystemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoSystemBtnActionPerformed
        infosSystemeDialog infos = new infosSystemeDialog(this, true);
        infos.setVisible(true);
    }//GEN-LAST:event_InfoSystemBtnActionPerformed

    private void AboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutBtnActionPerformed
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(null,"Cette application est réalisée par Florent Cardoen."); 

    }//GEN-LAST:event_AboutBtnActionPerformed

    private void heureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heureBtnActionPerformed
        // TODO add your handling code here:
        Date mnt = new Date();
        heureLabel.setText(DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.FRANCE).format(mnt));
    }//GEN-LAST:event_heureBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApplicationAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationAccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutBtn;
    private javax.swing.JTextPane ActionsRealisees;
    private javax.swing.JMenuItem AddMedecinMenu;
    private javax.swing.JRadioButton ConsultationRadio;
    private javax.swing.JRadioButton DocumentRadio;
    private javax.swing.ButtonGroup GenreGroup;
    private javax.swing.JRadioButton HospitalisationRadio;
    private javax.swing.JMenuItem InfoSystemBtn;
    private javax.swing.JRadioButton MeRadio;
    private javax.swing.JComboBox<String> MedecinsCombo;
    private javax.swing.JRadioButton MrRadio;
    private javax.swing.ButtonGroup ObjetGroup;
    private javax.swing.JButton SauverButton;
    private javax.swing.JButton heureBtn;
    private javax.swing.JLabel heureLabel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pAdresseTextfield;
    private javax.swing.JTextField pNaissanceTextfield;
    private javax.swing.JTextField pNomTextfield;
    private javax.swing.JTextField pPrenomTextfield;
    private javax.swing.JMenuItem pourDebutantBtn;
    // End of variables declaration//GEN-END:variables
}
