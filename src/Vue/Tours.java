package Vue;

import Modele.cartes.JeuDeCartes;
import Modele.cartes.Props;
import Modele.cartes.Tricks;
import Modele.jeu.PartieDeCartes;
import Modele.joueur.Bot;
import Modele.joueur.Joueur;
import Modele.strategie.DifficileStrategie;
import Modele.strategie.FacileStrategie;
import java.awt.GridBagConstraints;
import java.util.LinkedList;

/**
 *
 * @author nurizzatibintiabdharis_nadwahazizahbintimohdkamalazhari
 */
public class Tours extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LinkedList <Tricks> tricksDeck; //dect
    public LinkedList <Tricks> tricksPile;
    public JeuDeCartes jdc;    
    public PartieDeCartes pdc;
    public Joueur joueurEnCours;
    public LinkedList<Joueur> joueursAdversaire;
    public String niveauDifficulte;
    public Tricks trickEnCours;
    public Props prop7;
    GridBagConstraints c = new GridBagConstraints();
    private int nbJoueur=0;
    String niveau;
    private int cpt=0;
    
    /**
     * Constructeur de Tour
     * @param niveauDifficulte le niveau de difficulté de jeu
     * @param pdc l'objet de la classe de PartieDeCarte qui contient la liste des joueurs
     * @param jdc l'objet de la classe de JeuDeCarte qui contient la liste des tricks
     */
    public Tours(String niveauDifficulte, PartieDeCartes pdc, JeuDeCartes jdc) {
        initComponents();
        this.niveau=niveauDifficulte;
        this.jdc=jdc;
        this.pdc=pdc;
		tricksDeck = this.jdc.tasDeTricks;
		tricksPile = new LinkedList<Tricks>();
        prop7=pdc.getSeptiemeProp();
        int Joueur=this.nbJoueur;
        JouerTour(Joueur);
    }
 
    /**
     * Cette méthode est appelée depuis le constructeur pour initialiser le formulaire.
     * Le contenu de cette méthode est toujours généré par l'éditeur de l'interface graphique.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelJoueurEnCours = new javax.swing.JLabel();
        labelProp1 = new javax.swing.JLabel();
        labelProp2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        prop2 = new javax.swing.JRadioButton();
        prop1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        labelPoint = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelTrickEnCours = new javax.swing.JLabel();
        labelTrickApresEnCours = new javax.swing.JLabel();
        btnRealiserTrick = new javax.swing.JButton();
        btnNextTrick = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        apresRealise1 = new javax.swing.JRadioButton();
        propApresRealise1 = new javax.swing.JLabel();
        apresRealise2 = new javax.swing.JRadioButton();
        propApresRealise2 = new javax.swing.JLabel();
        apresRealise3 = new javax.swing.JRadioButton();
        propApresRealise3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nomJoueur2 = new javax.swing.JLabel();
        prop1_J2 = new javax.swing.JLabel();
        prop2_J2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        nomJoueur3 = new javax.swing.JLabel();
        prop1_J3 = new javax.swing.JLabel();
        prop2_J3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        prop1J3 = new javax.swing.JRadioButton();
        prop2J3 = new javax.swing.JRadioButton();
        prop1J2 = new javax.swing.JRadioButton();
        prop2J2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn7Prop = new javax.swing.JButton();
        choisiUnPropRevele = new javax.swing.JButton();
        lblBotTour = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        finJeu = new javax.swing.JLabel();

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Joueur en Cours :");

        labelJoueurEnCours.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelJoueurEnCours.setText("joueur");

        labelProp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N

        labelProp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N

        buttonGroup2.add(prop2);

        buttonGroup2.add(prop1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prop1)
                    .addComponent(prop2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prop1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(prop2)
                .addGap(87, 87, 87))
        );

        jLabel3.setText("Votre point:");

        labelPoint.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(labelJoueurEnCours))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelProp1)
                                    .addComponent(labelProp2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPoint)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelJoueurEnCours)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProp2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelPoint))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTrickEnCours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/backHorizontale.png"))); // NOI18N

        labelTrickApresEnCours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/backHorizontale.png"))); // NOI18N

        btnRealiserTrick.setBackground(new java.awt.Color(153, 255, 153));
        btnRealiserTrick.setText("Realiser ce Trick");
        btnRealiserTrick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealiserTrickActionPerformed(evt);
            }
        });

        btnNextTrick.setBackground(new java.awt.Color(255, 153, 153));

        btnNextTrick.setText("Passer au prohain Trick");
        btnNextTrick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextTrickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelTrickApresEnCours)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addComponent(labelTrickEnCours)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNextTrick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRealiserTrick)
                        .addGap(91, 91, 91))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTrickApresEnCours)
                    .addComponent(labelTrickEnCours))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealiserTrick)
                    .addComponent(btnNextTrick))
                .addGap(30, 30, 30))
        );

        jPanel8.setVisible(false);

        buttonGroup3.add(apresRealise1);

        propApresRealise1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N

        buttonGroup3.add(apresRealise2);

        propApresRealise2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N

        buttonGroup3.add(apresRealise3);

        propApresRealise3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(apresRealise1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(propApresRealise1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(apresRealise2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(propApresRealise2)
                .addGap(110, 110, 110)
                .addComponent(apresRealise3)
                .addGap(18, 18, 18)
                .addComponent(propApresRealise3)
                .addGap(80, 80, 80))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apresRealise1)
                    .addComponent(apresRealise3)
                    .addComponent(propApresRealise3)
                    .addComponent(apresRealise2)
                    .addComponent(propApresRealise2)
                    .addComponent(propApresRealise1))
                .addGap(33, 33, 33))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomJoueur2.setText("joueurs 2");

        prop1_J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N

        prop2_J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(prop1_J2)
                .addGap(66, 66, 66)
                .addComponent(prop2_J2)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(nomJoueur2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomJoueur2)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prop1_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(prop2_J2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomJoueur3.setText("joueurs 3");

        prop1_J3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N

        prop2_J3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(prop1_J3)
                .addGap(84, 84, 84)
                .addComponent(prop2_J3)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomJoueur3)
                .addGap(123, 123, 123))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomJoueur3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(prop1_J3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(prop2_J3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        buttonGroup1.add(prop1J3);

        buttonGroup1.add(prop2J3);

        buttonGroup1.add(prop1J2);

        buttonGroup1.add(prop2J2);

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Confirmez 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Choisissez l'un des props  d'adversaire et l'un des votre props ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(0, 183, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prop1J2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prop2J2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prop1J3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prop2J3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prop1J2)
                    .addComponent(prop2J2)
                    .addComponent(prop1J3)
                    .addComponent(prop2J3))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn7Prop.setText("Confirmez 2");
        btn7Prop.setVisible(false);
        btn7Prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7PropActionPerformed(evt);
            }
        });

        choisiUnPropRevele.setText("Confirmez");
        choisiUnPropRevele.setVisible(false);
        choisiUnPropRevele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choisiUnPropReveleActionPerformed(evt);
            }
        });

        lblBotTour.setVisible(false);
        lblBotTour.setText("jLabel3");

        btnNext.setText("Next");
        btnNext.setVisible(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        finJeu.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        finJeu.setVisible(false);
        finJeu.setText("fin jeu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(choisiUnPropRevele)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finJeu))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBotTour, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7Prop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext)
                        .addGap(173, 173, 173)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choisiUnPropRevele))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finJeu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7Prop)
                    .addComponent(lblBotTour)
                    .addComponent(btnNext))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Méthode appelé à chaque tour de joueur dans l'ordre
     * @param Joueur le nombre de Joueur courant à passer son tour
     */
    public void JouerTour(int Joueur) {
            if(tricksDeck.isEmpty() && tricksPile.get(0).getNom().contains("The Other Hat Trick")){
                cpt++;
                if(cpt == 3) { //tous les joueur ont passes son tour the other hat trick
                    terminerJeu();
                }
                else {
                    btnNextTrick.setVisible(false);
                    CommencerJeu(niveauDifficulte, tricksDeck, tricksPile, pdc, Joueur); 
                }
            } else {
                CommencerJeu(niveauDifficulte, tricksDeck, tricksPile, pdc, Joueur); 
            }    
    }
    
    /**
     * Méthode pour jouer le jeu pendant son tour.
     * @param niveauDifficulte niveau de difficulte de jeu
     * @param tricksDeck la collection de TrickDeck (qui ne sont pas encore passés dans jeu)
     * @param tricksPile la collection de TrickPile (Le tricks en cours qui en train d'afficher)
     * @param pdc l'objet de la classe de PartieDeCarte qui contient la liste des joueurs
     * @param nbJoueur le nombre de joueur courant a passer son tour
     */
    public void CommencerJeu(String niveauDifficulte, LinkedList <Tricks> tricksDeck, LinkedList <Tricks> tricksPile, PartieDeCartes pdc, int nbJoueur) {
            jPanel7.setVisible(false);
            jPanel6.setVisible(false);
            lblBotTour.setVisible(false);
            jPanel8.setVisible(false);
            btnNextTrick.setVisible(true);
            btnRealiserTrick.setVisible(true);
                joueurEnCours = pdc.joueurs.get(nbJoueur);
                joueursAdversaire = new LinkedList<Joueur>();
                for(int numJoueur = 0; numJoueur < 3; numJoueur ++) {
                    if(numJoueur!=nbJoueur)
                    {
                        joueursAdversaire.add(pdc.joueurs.get(numJoueur));
                    }
                }
                
		if(tricksPile.isEmpty()) { //Ajoute tricks dans Pile
                    tricksPile.add(tricksDeck.pop());
		}
                
                if (!joueurEnCours.getNomJoueur().contains("BOT")){ 
                    labelJoueurEnCours.setText(joueurEnCours.getNomJoueur()); //prob dia ambik yg terakhir
                    String prop1 = "/Image/props/"+joueurEnCours.getMain().get(0).getNom()+".png";         
                    labelProp1.setIcon(new javax.swing.ImageIcon(getClass().getResource(prop1)));
                    String prop2 = "/Image/props/"+joueurEnCours.getMain().get(1).getNom()+".png";
                    labelProp2.setIcon(new javax.swing.ImageIcon(getClass().getResource(prop2)));
                    labelPoint.setText(""+joueurEnCours.getPoint());
                    
                    //afficher trick    
                    String nomTrick="/Image/tricks/"+ tricksPile.get(0).getNom() +".png";
                    labelTrickEnCours.setIcon(new javax.swing.ImageIcon(getClass().getResource(nomTrick)));

                    //afficherPropAdversaire
                    afficherPropAdversaires(pdc,joueursAdversaire);
                    trickEnCours = tricksPile.get(0);
                    System.out.println("Tricks en cours : "+ tricksPile.get(0).getNom());
                    System.out.println("Joueur en cours : "+joueurEnCours.getNomJoueur());
                    System.out.println("Votre point : " + joueurEnCours.getPoint());
                    System.out.println("Votre props : \n"+joueurEnCours.afficherProps());

                }else{
                    labelJoueurEnCours.setText(joueurEnCours.getNomJoueur()); //prob dia ambik yg terakhir
                    String prop1 = "/Image/props/"+joueurEnCours.getMain().get(0).getNom()+".png";         
                    labelProp1.setIcon(new javax.swing.ImageIcon(getClass().getResource(prop1)));
                    String prop2 = "/Image/props/"+joueurEnCours.getMain().get(1).getNom()+".png";
                    labelProp2.setIcon(new javax.swing.ImageIcon(getClass().getResource(prop2)));
                    //afficher trick    
                    String nomTrick="/Image/tricks/"+ tricksPile.get(0).getNom() +".png";
                    labelTrickEnCours.setIcon(new javax.swing.ImageIcon(getClass().getResource(nomTrick)));
                    labelPoint.setText(""+joueurEnCours.getPoint());
                    
                    //afficherPropAdversaire
                    afficherPropAdversaires(pdc,joueursAdversaire);
                    trickEnCours = tricksPile.get(0);
                    btnNextTrick.setVisible(false);
                    btnRealiserTrick.setVisible(false);
                    lblBotTour.setVisible(true);
                    btnNext.setVisible(true);
                    
                    if(niveauDifficulte=="Facile"){
                        jLabel2.setText("BOT a prepare son prop");
                        FacileStrategie facileBot = new FacileStrategie((Bot) joueurEnCours);
                        String nomAutreJoueur = facileBot.preparerProp(pdc.joueurs);
                        String result = facileBot.realiserTricks(trickEnCours, pdc, true);
                        lblBotTour.setText("BOT a changÈ son prop avec "+nomAutreJoueur + " et " +result);    
                    }else{
                        DifficileStrategie difficileBot = new DifficileStrategie((Bot) joueurEnCours);
                        String nomAutreJoueur = difficileBot.preparerProp(pdc.joueurs);
                        String result = difficileBot.realiserTricks(trickEnCours, pdc, true);
                        lblBotTour.setText("BOT a changÈ son prop avec "+nomAutreJoueur + " et " +result);
                    }
                    System.out.println("Tricks en cours : "+ tricksPile.get(0));
                    System.out.println("Joueur en cours : "+joueurEnCours.getNomJoueur());
                    System.out.println("Votre props : \n"+joueurEnCours.afficherProps());
                }
    }
    
    /**
     * Ce bouton est utilise apres le joueur choisi l'un de prop d'adversaire et son prop pour etre changer. 
     * @param evt action sur le bouton
     */
    private void btnNextTrickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextTrickActionPerformed
        Tricks e = tricksDeck.pop();
        tricksPile.add(0,e);
        Tricks trickEnCours2 = tricksPile.get(0);
        String nomTrick="/Image/tricks/"+ trickEnCours2.getNom() +".png";
        labelTrickEnCours.setIcon(new javax.swing.ImageIcon(getClass().getResource(nomTrick)));
        
        jLabel2.setText("Choisissez l'un des props  d'adversaire et l'un des votre props ");
        lblBotTour.setVisible(false);        
        jPanel6.setVisible(true);
        jPanel7.setVisible(true);
        btnRealiserTrick.setVisible(false);
        btnNextTrick.setVisible(false);
    }//GEN-LAST:event_btnNextTrickActionPerformed

    /**
     * L'action apres que le joueur reussi a realiser le trick ou non
     * @param evt action sur le bouton
     */
    private void btnRealiserTrickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealiserTrickActionPerformed
        jLabel2.setText("Choisissez l'un des props  d'adversaire et l'un des votre props ");
        lblBotTour.setVisible(false);
        jPanel6.setVisible(true);
        jPanel7.setVisible(true);
        btnRealiserTrick.setVisible(false);
        btnNextTrick.setVisible(false);
    }//GEN-LAST:event_btnRealiserTrickActionPerformed

    /**
     * L'action avant de realiser le trick. lorsque le joueur prepare son carte
     * @param evt action sur le bouton
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!prop1J2.isSelected() && !prop2J2.isSelected() && !prop1J3.isSelected() && !prop2J3.isSelected()){
            jLabel2.setText("--------------------Choisir un prop a changer!-------------------------");
                          //"----------------Choisir l'un de votre prop a changer!-------------------"
            jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        }else{
            if(!prop1.isSelected() && !prop2.isSelected()){
                jLabel2.setText("----------------Choisir l'un de votre prop a changer!-------------------");
                jLabel2.setForeground(new java.awt.Color(255, 51, 51));
            }
            else{
                jPanel6.setVisible(false);
                jPanel7.setVisible(false);
                prop1J2.setActionCommand("12");
                prop2J2.setActionCommand("22");
                prop1J3.setActionCommand("13");
                prop2J3.setActionCommand("23");
               String selectedButtonAdversaire = buttonGroup1.getSelection().getActionCommand();

               prop1.setActionCommand("1");
               prop2.setActionCommand("2");
               String selectedProp=buttonGroup2.getSelection().getActionCommand();
               preparerProp(selectedButtonAdversaire, selectedProp);
               CommencerJeu(niveauDifficulte, tricksDeck, tricksPile,pdc, joueurEnCours.getNumJoueur());
               realiserTrick();
               System.out.println(selectedButtonAdversaire);
            }  
        }                
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Cette methode est utilise pour realiser le trick donnee. Cette methode observe si le joueur a les props necessaires pour realiser
     */
   public void realiserTrick(){
        jPanel6.setVisible(false);
        lblBotTour.setVisible(true);

        if(joueurEnCours.realiserTricks(trickEnCours)){
            lblBotTour.setText("Vous avez réaliser ce Trick! Choississez un prop que vous ne voulez pas");
            Props prop1=joueurEnCours.getMain().get(0);
            Props prop2=joueurEnCours.getMain().get(1);
            String stringProp1 = "/Image/props/" + prop1.getNom() +".png";
            String stringProp2 = "/Image/props/" + prop2.getNom() +".png";
            String stringProp3 = "/Image/props/" + prop7.getNom() +".png";
            propApresRealise1.setIcon(new javax.swing.ImageIcon(getClass().getResource(stringProp1)));
            propApresRealise2.setIcon(new javax.swing.ImageIcon(getClass().getResource(stringProp2)));
            propApresRealise3.setIcon(new javax.swing.ImageIcon(getClass().getResource(stringProp3)));
            jPanel1.setVisible(false);
            jPanel5.setVisible(false);
            jPanel8.setVisible(true);  
            btn7Prop.setVisible(true);
            System.out.println("reussir, point carte: " +trickEnCours.getPoint());
            joueurEnCours.addPoint(trickEnCours.getPoint());
            labelPoint.setText(""+joueurEnCours.getPoint());
            System.out.println("point joueur: " + joueurEnCours.getPoint());
        }else{
            choisiPropRevele();
        }   
    }
    
    /**
     * Cette methode permet de prendre un input de joueur a choisir quel prop va etre revele apres avoir echoue
     */
    public void choisiPropRevele(){
                if(joueurEnCours.getMain().get(0).getEstRevele()==true && joueurEnCours.getMain().get(1).getEstRevele()==true)
		{
                    lblBotTour.setText("Vous n'avez pas réaliser ce Trick. Les deux props sont deja reveles");
                    System.out.println("dua2 revelee");
		}else {
			if(joueurEnCours.getMain().get(0).getEstRevele()==true) {
				joueurEnCours.getMain().get(1).setEstRevele(true);
                                lblBotTour.setText("Vous n'avez pas réaliser ce Trick. '"+ joueurEnCours.getMain().get(1).getNom() +"' est revelé");
                                System.out.println("salah satu1 revelee");
			}
			else
			{
				if(joueurEnCours.getMain().get(1).getEstRevele()==true) {
					joueurEnCours.getMain().get(0).setEstRevele(true);
                                        lblBotTour.setText("Vous n'avez pas réaliser ce Trick. '"+ joueurEnCours.getMain().get(0).getNom() +"' est revelé");
                                        System.out.println("salah satu2 revelee");
				}
				else {
					lblBotTour.setText("Vous n'avez pas réaliser ce Trick. Choisissez l'un de votre prop pour étre revelé");
                                        System.out.println("pilih untuk revelee");
				}
			}			
		}
            choisiUnPropRevele.setVisible(true);
            jPanel7.setVisible(true);
    }
    
    /**
     * apres avoir reussi realiser le trick, le joueur choisi deux props parmis trois. cette methode permet de prendre la choix du joueur
     * @param evt action sur le bouton
     */
    private void btn7PropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7PropActionPerformed
        apresRealise1.setActionCommand("prop0");
        apresRealise2.setActionCommand("prop1");
        apresRealise3.setActionCommand("propSeptieme");
        String selected = buttonGroup3.getSelection().getActionCommand();

        if(selected =="prop0"){
            Props newSeptiemeProp = joueurEnCours.getMain().get(0); 
            joueurEnCours.getMain().remove(0);
            joueurEnCours.getMain().add(prop7);
            pdc.getProps().add(newSeptiemeProp);
            prop7=pdc.getSeptiemeProp();
        }
        
        if(selected =="prop1"){
            Props newSeptiemeProp = joueurEnCours.getMain().get(1); 
            joueurEnCours.getMain().remove(1);
            joueurEnCours.prendreProp(prop7);
            pdc.getProps().add(newSeptiemeProp);
            prop7=pdc.getSeptiemeProp();
        }
        
        pdc.closePropApresRealise(joueurEnCours.getMain());
        tricksPile.remove(trickEnCours);
        this.nbJoueur++;
        lblBotTour.setVisible(false);
        JouerTour(this.nbJoueur);
        jPanel1.setVisible(true);
        jPanel5.setVisible(true);
        btn7Prop.setVisible(false);
    }//GEN-LAST:event_btn7PropActionPerformed

    /**
     * l'action apres que le joueur choisi l'un de ses props d'etre revele
     * @param evt action sur le bouton
     */
    private void choisiUnPropReveleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choisiUnPropReveleActionPerformed
            prop1.setActionCommand("prop0");
            prop2.setActionCommand("prop1");
            String get = buttonGroup2.getSelection().getActionCommand();
            if(get=="prop0"){
                joueurEnCours.getMain().get(0).setEstRevele(true);
            }else{
                joueurEnCours.getMain().get(1).setEstRevele(true);
            }
            this.nbJoueur++;
            lblBotTour.setVisible(false);
            JouerTour(this.nbJoueur);
            choisiUnPropRevele.setVisible(false);
    }//GEN-LAST:event_choisiUnPropReveleActionPerformed

    /**
     * Lorsque on clique sur ce bouton, la méthode JouerTour() du prochain joueur est appelée
     * @param evt action sur le bouton 
     */
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.nbJoueur=0;
        JouerTour(this.nbJoueur);
        btnNext.setVisible(false);
    }//GEN-LAST:event_btnNextActionPerformed
    
    /**
     * Preparer les prop en changeant le prop du joueur courant avec le joueur adversaire
     * @param selectedButtonAdversaire le prop d'adversaire choisi
     * @param selectedProp le prop du joueur choisi
     */
    public void preparerProp(String selectedButtonAdversaire, String selectedProp){
        int numPropAdversaire=0;
        int numAdversaire=0;
        int numProp=0;
        Props propAdversaire;
        Props prop;
        switch(selectedButtonAdversaire){
            case "12":
                numPropAdversaire = 0;
                numAdversaire = joueursAdversaire.get(0).getNumJoueur();
                break;
            case "22":
                numPropAdversaire = 1;
                numAdversaire = joueursAdversaire.get(0).getNumJoueur();
                break;
            case "13":
                numPropAdversaire = 0;
                numAdversaire = joueursAdversaire.get(1).getNumJoueur();
                break;
            case "23":
                numPropAdversaire = 1;
                numAdversaire = joueursAdversaire.get(1).getNumJoueur();
                break;
            default:
                break;
        }
        propAdversaire = pdc.joueurs.get(numAdversaire).getMain().get(numPropAdversaire);
        switch(selectedProp){
            case "1":
                numProp=0;
                break;
            case "2":
                numProp=1;
                break;
            default:
                break;
        }
        prop = joueurEnCours.getMain().get(numProp);
        joueurEnCours.echangeCarte(numProp, propAdversaire);
        pdc.joueurs.get(numAdversaire).echangeCarte(numPropAdversaire, prop);
    }
    
    /**
     * cette methode affiche les props adversaires si il est revele. sinon, on affiche l'arriere du carte
     * @param pdc contient la liste des joueurs
     * @param joueursAdversaire contient le joueur adversaire
     */
    public void afficherPropAdversaires(PartieDeCartes pdc, LinkedList <Joueur>joueursAdversaire){
                    //Props des adversaires
            nomJoueur2.setText(joueursAdversaire.get(0).getNomJoueur());
                if(joueursAdversaire.get(0).getMain().get(0).getEstRevele()==false){
                    prop1_J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/props/back.png")));
                }else{
                    String prop1j2 = "/Image/props/"+joueursAdversaire.get(0).getMain().get(0).getNom()+".png";
                    prop1_J2.setIcon(new javax.swing.ImageIcon(getClass().getResource(prop1j2)));
                }
                if(joueursAdversaire.get(0).getMain().get(1).getEstRevele()==false){
                    prop2_J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/props/back.png")));
                }else{
                    String prop2j2 = "/Image/props/"+joueursAdversaire.get(0).getMain().get(1).getNom()+".png";
                    prop2_J2.setIcon(new javax.swing.ImageIcon(getClass().getResource(prop2j2)));
                }
            nomJoueur3.setText(joueursAdversaire.get(1).getNomJoueur());        
                if(joueursAdversaire.get(1).getMain().get(0).getEstRevele()==false){
                    prop1_J3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/props/back.png")));
                }else{
                    String prop1j3 = "/Image/props/"+joueursAdversaire.get(1).getMain().get(0).getNom()+".png";
                    prop1_J3.setIcon(new javax.swing.ImageIcon(getClass().getResource(prop1j3)));
                } 
                if(joueursAdversaire.get(1).getMain().get(1).getEstRevele()==false){
                    prop2_J3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/props/back.png")));
                }else{
                    String prop2j3 = "/Image/props/"+joueursAdversaire.get(1).getMain().get(1).getNom()+".png";
                    prop2_J3.setIcon(new javax.swing.ImageIcon(getClass().getResource(prop2j3)));
                } 
    }
    
    
    /**
     * Methode appelée lors de la fin de jeu, il va afficher le gagnant de jeu.
     */  
    public void terminerJeu() {
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel6.setVisible(false);
        btnNextTrick.setVisible(false);
        btnRealiserTrick.setVisible(false);
        lblBotTour.setVisible(false);
        finJeu.setText("Jeu terminer!!!!! "+ pdc.quiGagne().getNomJoueur() + " est gagné!!!!!!!!!!!!!");
        finJeu.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton apresRealise1;
    private javax.swing.JRadioButton apresRealise2;
    private javax.swing.JRadioButton apresRealise3;
    private javax.swing.JButton btn7Prop;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextTrick;
    private javax.swing.JButton btnRealiserTrick;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton choisiUnPropRevele;
    private javax.swing.JLabel finJeu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labelJoueurEnCours;
    private javax.swing.JLabel labelPoint;
    private javax.swing.JLabel labelProp1;
    private javax.swing.JLabel labelProp2;
    private javax.swing.JLabel labelTrickApresEnCours;
    private javax.swing.JLabel labelTrickEnCours;
    private javax.swing.JLabel lblBotTour;
    private javax.swing.JLabel nomJoueur2;
    private javax.swing.JLabel nomJoueur3;
    private javax.swing.JRadioButton prop1;
    private javax.swing.JRadioButton prop1J2;
    private javax.swing.JRadioButton prop1J3;
    private javax.swing.JLabel prop1_J2;
    private javax.swing.JLabel prop1_J3;
    private javax.swing.JRadioButton prop2;
    private javax.swing.JRadioButton prop2J2;
    private javax.swing.JRadioButton prop2J3;
    private javax.swing.JLabel prop2_J2;
    private javax.swing.JLabel prop2_J3;
    private javax.swing.JLabel propApresRealise1;
    private javax.swing.JLabel propApresRealise2;
    private javax.swing.JLabel propApresRealise3;
    // End of variables declaration//GEN-END:variables

}
