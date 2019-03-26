package Vue;

import Modele.cartes.JeuDeCartes;
import Modele.cartes.Tricks;
import Modele.jeu.PartieDeCartes;
import Modele.joueur.Bot;
import Modele.joueur.Date;
import Modele.joueur.Joueur;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author nurizzatibintiabdharis_nadwahazizahbintimohdkamalazhari
 */
public class Partie extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int nbJoueur;
    public LinkedList <Tricks> tricksDeck;
    public LinkedList <Tricks> tricksPile;
    public PartieDeCartes pdc;
    public JeuDeCartes jdc;
    public static boolean presenceBOT = false;
    public static String niveauDifficulte = null;
    public Joueur j1, j2, j3;
    private JLabel mainPic;
    Tours tours;
    GridBagLayout layout;
    GridBagConstraints c;
    JOptionPane jop1;
    
    /**
     * Constructeur de Partie
     * @param nbJoueur le nombre de joueurs qui va jouer le jeu
     * @param mainPic l'image The Other Hatrick
     */
    public Partie(int nbJoueur, JLabel mainPic) {
        initComponents();
        reformatComboBox();
        myInitComponents(nbJoueur);
        
        jdc = new JeuDeCartes();
	jdc.melangerTricks();
        pdc = new PartieDeCartes();
        layout = new GridBagLayout();
        c  = new GridBagConstraints();
        this.mainPic=mainPic;
    }

    /**
     * Cette méthode est appelée depuis le constructeur pour initialiser le formulaire.
     * Le contenu de cette méthode est toujours généré par l'éditeur de l'interface graphique.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomJoueur1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboBoxMoisJ1 = new javax.swing.JComboBox<>();
        comboBoxAnneeJ1 = new javax.swing.JComboBox<>();
        comboBoxJourJ1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomJoueur2 = new javax.swing.JTextField();
        comboBoxJourJ2 = new javax.swing.JComboBox<>();
        comboBoxMoisJ2 = new javax.swing.JComboBox<>();
        comboBoxAnneeJ2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomJoueur3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboBoxJourJ3 = new javax.swing.JComboBox<>();
        comboBoxMoisJ3 = new javax.swing.JComboBox<>();
        comboBoxAnneeJ3 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnChoisiNiveau = new javax.swing.JButton();
        niveauDifficulteChoisi = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setVisible(false);

        jLabel7.setText("Joueur 1 ");

        jLabel3.setText("Nom ");

        jLabel4.setText("Date de Naissance");

        comboBoxMoisJ1.setModel(new DefaultComboBoxModel<>(Mois.values()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboBoxJourJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxMoisJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxAnneeJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBoxMoisJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAnneeJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxJourJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel2.setVisible(false);

        jLabel5.setText("Joueur 2");

        jLabel1.setText("Nom");

        jLabel2.setText("Date de Naissance");

        comboBoxMoisJ2.setModel(new DefaultComboBoxModel<>(Mois.values()));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboBoxJourJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxMoisJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxAnneeJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtNomJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxJourJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMoisJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAnneeJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setVisible(false);

        jLabel6.setText("Joueur 3");

        jLabel8.setText("Nom");

        jLabel9.setText("Date de Naissance");

        comboBoxMoisJ3.setModel(new DefaultComboBoxModel<>(Mois.values()));
        
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomJoueur3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(comboBoxJourJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxMoisJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxAnneeJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNomJoueur3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboBoxJourJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMoisJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAnneeJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setVisible(false);

        btnChoisiNiveau.setText("Commencez!");
        btnChoisiNiveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoisiNiveauActionPerformed(evt);
            }
        });

        niveauDifficulteChoisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facile", "Difficile" }));

        jLabel10.setText("Choisissez niveau du jeu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(niveauDifficulteChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChoisiNiveau)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(niveauDifficulteChoisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChoisiNiveau))
                .addGap(27, 27, 27))
        );

        jButton1.setText("OK");
        jButton1.setVisible(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(148, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * On va redéfinir l'affichage du formulaire correspondre à nombre de joueur saisir par utilisateur
     * @param nbJoueur la nombre de joueur saisi
     * 
     */
    private void myInitComponents(int nbJoueur) {
        if(nbJoueur == 1) {
            jPanel1.setVisible(true);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
        } else if(nbJoueur == 2){
            jPanel1.setVisible(true);
            jPanel2.setVisible(true);
            jPanel3.setVisible(false);
        } else {
            jPanel1.setVisible(true);
            jPanel2.setVisible(true);
            jPanel3.setVisible(true);
        }
        jButton1.setVisible(true);
    } 
    
    /**
     * On va recuperer les information des joueurs et de creer les objets joueurs
     * @param evt action sur le bouton après avoir rempli les formulaires
     * 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Joueur1
        String nom = txtNomJoueur1.getText();
        int jour =  Integer.parseInt(comboBoxJourJ1.getSelectedItem().toString());
        Mois SelMois = (Mois) comboBoxMoisJ1.getSelectedItem();
        int mois = SelMois.getNbMois();
        int annee = Integer.parseInt(comboBoxAnneeJ1.getSelectedItem().toString());
        //Joueur2
        String nom2 = txtNomJoueur2.getText();
        int jour2 =  Integer.parseInt(comboBoxJourJ2.getSelectedItem().toString());
        Mois SelMois2 = (Mois) comboBoxMoisJ2.getSelectedItem();
        int mois2 = SelMois2.getNbMois();
        int annee2 = Integer.parseInt(comboBoxAnneeJ2.getSelectedItem().toString());
        //Joueur3
        String nom3 = txtNomJoueur3.getText();
        int jour3 =  Integer.parseInt(comboBoxJourJ3.getSelectedItem().toString());
        Mois SelMois3 = (Mois) comboBoxMoisJ3.getSelectedItem();
        int mois3 = SelMois3.getNbMois();
        int annee3 = Integer.parseInt(comboBoxAnneeJ3.getSelectedItem().toString());
             
        switch(Integer.toString(Accueil.nbJoueur)){ 
            case "1":
                if (nom.trim().isEmpty()) {
                    jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Erreur nom de Joueur");
                } else {
                    System.out.println("Test");
                    Date dateN = new Date(annee, mois, jour);
                    j1 = new Joueur(nom,dateN);
                    //creer bot1
                    String nomBot = "BOT";
                    j2 = new Bot(nomBot);
                    j3 = new Bot(nomBot);
                    presenceBOT = true;
                    commencerPartie();
                }
                break;
            case "2":
                if (nom.trim().isEmpty() || nom2.trim().isEmpty()) {
                    jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Erreur nom de Joueur");
                } else {
                    //Joueur1
                    Date dateN = new Date(annee, mois, jour);
                    j1 = new Joueur(nom,dateN);
                    //Joueur2
                    Date dateN2 = new Date(annee2, mois2, jour2);
                    j2 = new Joueur(nom2,dateN2);
                    //creer bot1
                    String nomBot = "BOT";
                    j3 = new Bot(nomBot);
                    presenceBOT = true;
                    commencerPartie();
                }
                break;
            case "3":
                if (nom.trim().isEmpty() || nom2.trim().isEmpty() || nom3.trim().isEmpty()) {
                    jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Erreur nom de Joueur");
                } else {
                    //Joueur1
                    Date dateN = new Date(annee, mois, jour);
                    j1 = new Joueur(nom,dateN);
                    //Joueur2
                    Date dateN2 = new Date(annee2, mois2, jour2);
                    j2 = new Joueur(nom2,dateN2);
                    //Joueur3
                    Date dateN3 = new Date(annee3, mois3, jour3);
                    j3 = new Joueur(nom3,dateN3);
                    commencerPartie();
                }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Il faut choisir le niveau de difficulté du jeu pour la patron de conception stratégie
     * @param evt action sur le bouton après avoir choisi le niveau de difficulté du jeu
     *  
     */
    private void btnChoisiNiveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoisiNiveauActionPerformed
        jPanel4.setLayout(layout);
        c.gridx = 0;
        c.gridy = 0;
        jPanel4.removeAll();
        jPanel4.revalidate();
        jPanel4.repaint();
        
        niveauDifficulte = niveauDifficulteChoisi.getSelectedItem().toString(); 
        tours = new Tours(niveauDifficulte, pdc, jdc);
        tours.setVisible(true);
        mainPic.setVisible(false);
        jPanel4.add(tours,c);
    }//GEN-LAST:event_btnChoisiNiveauActionPerformed

    /**
     * 
     * Méthode appelée avant de commencer la partie de jeu pour:
     * définir l'affichage graphique pour le jeu,
     * Ajouter les joueurs dans la collection,
     * Trier les joueurs dans ce collection par leur âge.
     */
    public void commencerPartie() {
            pdc.ajouterJoueur(j1);
            pdc.ajouterJoueur(j2);
            pdc.ajouterJoueur(j3);
            pdc.distribuerCartes();
            pdc.trierJoueur();
            System.out.println(pdc);

            jPanel1.setVisible(false);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jButton1.setVisible(false);
            
            
            if (presenceBOT) { //s'il existe BOT dans jeu
                jPanel4.setVisible(true);
            } else {
                //terus main
                mainPic.setVisible(false);
                jPanel4.setVisible(true);
                jPanel4.setLayout(layout);
                c.gridx = 0;
                c.gridy = 0;
                jPanel4.removeAll();
                jPanel4.revalidate();
                jPanel4.repaint();
                niveauDifficulte = null; 
                tours = new Tours(niveauDifficulte, pdc, jdc);
                tours.setVisible(true);
                jPanel4.add(tours,c);
            }
    }
        
    /**
     * Énumération nom de Mois à remplir dans le comboBox.
     */
    public enum Mois {
	Janvier(1), Février(2), Mars(3), Avril(4), Mai(5), Juin(6), Juillet(7), Août(8), Septembre(9), Octobre(10), Novembre(11), Decembre(12);	
	private int nbMois;
	private Mois(int nbMois) {  
		this.nbMois = nbMois ;  
        } 
	public int getNbMois() {
		return nbMois;
	}
    }
    
    /**
     * Méthode pour redéfinir le contenu de comboBox.
     */
    private void reformatComboBox() {
        comboBoxJourJ1.removeAllItems();
        comboBoxJourJ2.removeAllItems();
        comboBoxJourJ3.removeAllItems();
        for(int i=1;i<=31;i++){
	    comboBoxJourJ1.addItem(""+i);
            comboBoxJourJ2.addItem(""+i);
            comboBoxJourJ3.addItem(""+i);
	}
        
        comboBoxAnneeJ1.removeAllItems();
        comboBoxAnneeJ2.removeAllItems();
        comboBoxAnneeJ3.removeAllItems();
        for(int i=1970;i<=2010;i++){
	    comboBoxAnneeJ1.addItem(""+i);
            comboBoxAnneeJ2.addItem(""+i);
            comboBoxAnneeJ3.addItem(""+i);
        }    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoisiNiveau;
    private javax.swing.JComboBox<String> comboBoxAnneeJ1;
    private javax.swing.JComboBox<String> comboBoxAnneeJ2;
    private javax.swing.JComboBox<String> comboBoxAnneeJ3;
    private javax.swing.JComboBox<String> comboBoxJourJ1;
    private javax.swing.JComboBox<String> comboBoxJourJ2;
    private javax.swing.JComboBox<String> comboBoxJourJ3;
    private javax.swing.JComboBox<Mois> comboBoxMoisJ1;
    private javax.swing.JComboBox<Mois> comboBoxMoisJ2;
    private javax.swing.JComboBox<Mois> comboBoxMoisJ3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> niveauDifficulteChoisi;
    private javax.swing.JTextField txtNomJoueur1;
    private javax.swing.JTextField txtNomJoueur2;
    private javax.swing.JTextField txtNomJoueur3;
    // End of variables declaration//GEN-END:variables
    
}
