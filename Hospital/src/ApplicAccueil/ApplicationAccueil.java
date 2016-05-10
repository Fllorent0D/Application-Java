/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicAccueil;
import ClassMetiers.DoctorMissingException;
import ClassMetiers.Medecin;
import ClassMetiers.Patient;
import ClassMetiers.PatientMissingException;
import ClassMetiers.Consultation;
import Login.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import network.NetworkBasicClient;
import ClassMetiers.*;
import static java.lang.System.out;
import java.util.Iterator;
/**
 *
 * @author florentcardoen
 */
public class ApplicationAccueil extends javax.swing.JFrame implements Runnable {
    private NetworkBasicClient client = new NetworkBasicClient("localhost", 4800);
    private Thread threadClock = null;
    private DefaultComboBoxModel MedecinsModel = new DefaultComboBoxModel();
    private ArrayList<Medecin> MedecinListe;
    private ArrayList<Consultation> ConsultationListe = new ArrayList<>();
    private ArrayList<Patient> PatientListe;
    private int port;
    private String FichierMedecins;
    private String FichierPatient;
    private String FichierConsultation;
    private String DirectoryPath;
    private Properties paramCo;
    
    
    
    public ApplicationAccueil() {
      
        DialLogin login = new DialLogin(this, true);
        login.setVisible(true);
        
        initComponents();
        initContainers();
        
        
        GenreGroup.add(MeRadio);
        GenreGroup.add(MrRadio);
        ObjetGroup.add(DocumentRadio);
        ObjetGroup.add(ConsultationRadio);
        ObjetGroup.add(HospitalisationRadio);

        MedecinsCombo.setModel(MedecinsModel);
        MedecinsModel.insertElementAt("<aucun>", 0);
        MedecinsCombo.setSelectedIndex(0);
        
        heureLabel.setText("");
        if (threadClock == null) 
        {
            threadClock = new Thread(this, "Clock");
            threadClock.start();
        }
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
        heureLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuPatientLister = new javax.swing.JMenuItem();
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

        heureLabel.setText("jLabel10");

        jMenu1.setText("Patients");

        menuPatientLister.setText("Lister");
        menuPatientLister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPatientListerActionPerformed(evt);
            }
        });
        jMenu1.add(menuPatientLister);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                        .addComponent(MeRadio))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pAdresseTextfield)
                                        .addComponent(pNaissanceTextfield)
                                        .addComponent(pPrenomTextfield)
                                        .addComponent(pNomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(MedecinsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(heureLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(heureLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pNomTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initContainers()
    {
        DirectoryPath = System.getProperty("user.dir");
        String pathProperties;

        File dossier = new File(DirectoryPath + System.getProperty("file.separator")+"HospitalInpres");
        System.out.print(dossier);
        if(!dossier.exists())
        {
            try
            {
                dossier.mkdir();
            }
            catch(SecurityException e)
            {
                System.err.println("Impossible de créer le répertoire de l'application : "+ e.getMessage());
                System.exit(0);
            }                   
        }
        
        DirectoryPath = DirectoryPath + System.getProperty("file.separator") + "HospitalInpres";
        
        /*Fichier properties*/
        pathProperties = DirectoryPath + System.getProperty("file.separator") + "Hospital.properties";
        paramCo = new Properties();
        
        try
        {
            FileInputStream Oread = new FileInputStream(pathProperties);
            paramCo.load(Oread);
        }
        catch(FileNotFoundException ex)
        {
            try 
            {
                FileOutputStream Oflux = new FileOutputStream(pathProperties);
                
                paramCo.setProperty("FichierPatient", "patients.dat");
                paramCo.setProperty("FichierMedecin", "medecins.dat");
                paramCo.setProperty("FichierConsultation", "consultations.dat");

                paramCo.setProperty("FichierUser", "users.csv");
                paramCo.setProperty("Port", "50010");
                paramCo.setProperty("Log", "log.txt");
            
                try {
                    paramCo.store(Oflux, null);
                }
                catch (IOException ex1) {
                    JOptionPane.showMessageDialog(this, "Erreur:"+ex1.getMessage());
                    System.exit(0);
                }
            } 
            catch (FileNotFoundException ex1) 
            {
                JOptionPane.showMessageDialog(this, "Erreur:"+ex1.getMessage());
                System.exit(0);
            }
            
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(this, "Erreur:"+ex.getMessage());
            System.exit(0);
        }
        
        port = Integer.parseInt(paramCo.getProperty("Port"));
        
        /*Lecture des médecins*/
        FichierMedecins = DirectoryPath + System.getProperty("file.separator") + paramCo.getProperty("FichierMedecin");
        try 
        {
            FileInputStream fis = new FileInputStream(FichierMedecins);
            ObjectInputStream LectureMedecin = new ObjectInputStream(fis);
            
            MedecinListe = (ArrayList<Medecin>)LectureMedecin.readObject();
        } 
        catch (FileNotFoundException ex) 
        {
            MedecinListe = new ArrayList<>();
            updateFile("Medecin");
        }
        catch(IOException | ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(this, "Erreur:"+e.getMessage());
            System.exit(0);
        }
        
        for(Iterator<Medecin> iter = MedecinListe.iterator(); iter.hasNext(); )
        {
            Medecin med = iter.next();
            MedecinsModel.addElement(med);
        }
        
        /* Patients */
        FichierPatient = DirectoryPath + System.getProperty("file.separator") + paramCo.getProperty("FichierPatient");
        try 
        {
            FileInputStream fis = new FileInputStream(FichierPatient);
            ObjectInputStream LecturePatient = new ObjectInputStream(fis);
            
            PatientListe = (ArrayList<Patient>)LecturePatient.readObject();
        } 
        catch (FileNotFoundException ex) 
        {
            PatientListe = new ArrayList<>();
            updateFile("Patient");
        }
        catch(IOException | ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(this, "Erreur:"+e.getMessage());
            System.exit(0);
        }
       
        
        FichierConsultation = DirectoryPath + System.getProperty("file.separator") + paramCo.getProperty("FichierConsultation");
        try 
        {
            FileInputStream fis = new FileInputStream(FichierConsultation);
            ObjectInputStream LectureConsultation = new ObjectInputStream(fis);
            
            ConsultationListe = (ArrayList<Consultation>)LectureConsultation.readObject();
        } 
        catch (FileNotFoundException ex) 
        {
            ConsultationListe = new ArrayList<>();
            updateFile("Consultation");
        }
        catch(IOException | ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(this, "Erreur:"+e.getMessage());
            System.exit(0);
        }
        
        
          
    }
    private void updateFile(String fichier)
    {
        String Fichier = FichierPatient;
        switch(fichier)
        {
            case "Patient":
                Fichier = FichierPatient;
                break;
            case "Medecin":
                Fichier = FichierMedecins;
                break;
            case "Consultation":
                Fichier = FichierConsultation;
                break;
        }
        
        try 
        {
            FileOutputStream fos = new FileOutputStream(Fichier);
            ObjectOutputStream EcritureFichier = new ObjectOutputStream(fos);
            
            switch(fichier)
            {
                case "Patient":
                    EcritureFichier.writeObject(PatientListe);
                    break;
                case "Medecin":
                    EcritureFichier.writeObject(MedecinListe);
                    break;
                case "Consultation":
                    EcritureFichier.writeObject(ConsultationListe);
                    break;
            }
            EcritureFichier.flush();

        } 
        catch (FileNotFoundException ex1) 
        {
            JOptionPane.showMessageDialog(this, "Erreur:"+ex1.getMessage());
            System.exit(0);
        }
        catch (IOException ex1)
        {
            JOptionPane.showMessageDialog(this, "Erreur:"+ex1.getMessage());
            System.exit(0);
        }
    }
    
    private void AddMedecinMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMedecinMenuActionPerformed
        
        MedecinsAjouter nouvMedecinDialog = new MedecinsAjouter(this, true);
        nouvMedecinDialog.setVisible(true);
        MedecinListe.add(nouvMedecinDialog.getNouveauMedecin());
        MedecinsModel.addElement(nouvMedecinDialog.getNouveauMedecin());
        updateFile("Medecin");
    }//GEN-LAST:event_AddMedecinMenuActionPerformed

    private void SauverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SauverButtonActionPerformed
        
        Medecin med;
        try {
            Patient newPatient = new Patient(pNomTextfield.getText(), pPrenomTextfield.getText(), pAdresseTextfield.getText(), "0787" ,"ONSS" ,pNaissanceTextfield.getText()); 
            if(MedecinListe.contains(MedecinsModel.getSelectedItem()))
            {
                med = MedecinListe.get(MedecinListe.indexOf(MedecinsModel.getSelectedItem()));
            }
            else
            {
                throw new DoctorMissingException("Le nom du médecin est manquant");
            }
            
            for(Iterator<Patient> iter = PatientListe.iterator(); iter.hasNext(); )
            {
                Patient pat = iter.next();
                if(pat.equals(newPatient))
                    throw new PatientAlreadyRegistered("Le patient est déjà encodé");
            }
            Consultation newConsult = new Consultation(med, newPatient, "Test");    
            
            PatientListe.add(newPatient);
            updateFile("Patient");
            
            ConsultationListe.add(newConsult);
            updateFile("Consultation");
            
            
            StyledDocument document = (StyledDocument) ActionsRealisees.getDocument();
            document.insertString(document.getLength(), "Consultation de " + newPatient.getNom() + " chez " + med.toString(), null);
            
            client.sendStringWithoutWaiting(newConsult.stringMessage());
        
            
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
        } catch (PatientAlreadyRegistered ex) {
            JOptionPane.showMessageDialog(this,
                ex.getMessage(),
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
            } catch (BadLocationException ex) {
            Logger.getLogger(ApplicationAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
      
    }//GEN-LAST:event_SauverButtonActionPerformed



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
        MedecinsLister listerMedecinDialog = new MedecinsLister(this, true);
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

    private void menuPatientListerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPatientListerActionPerformed
        PatientsLister dial = new PatientsLister(this, false);
        dial.setVisible(true);
    }//GEN-LAST:event_menuPatientListerActionPerformed
    public ArrayList<Medecin> getMedecins()
    {
        return MedecinListe;
    }
    public ArrayList<Patient> getPatients()
    {
        return PatientListe;
    }     
    /**
     * 
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
    private javax.swing.JMenuItem menuPatientLister;
    private javax.swing.JTextField pAdresseTextfield;
    private javax.swing.JTextField pNaissanceTextfield;
    private javax.swing.JTextField pNomTextfield;
    private javax.swing.JTextField pPrenomTextfield;
    private javax.swing.JMenuItem pourDebutantBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() 
    {
        Thread myThread = Thread.currentThread();
        while (threadClock == myThread) {
            Date mnt = new Date();
            heureLabel.setText(DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.KOREAN).format(mnt));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
            }
        }
    }
}
