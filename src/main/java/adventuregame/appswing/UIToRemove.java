package adventuregame.appswing;
//
//import adventuregame.model.utils.Stats;
//import adventuregame.model.utils.StatsListener;
//import adventuregame.model.utils.Words;
//import adventuregame.model.utils.WordsListener;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class UI implements StatsListener, WordsListener {
//
//    public JFrame window;
//    public JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, heroPanel, imagePanelMain, imagePanelHeroPicture;
//    public JLabel titleNameLabel, hpLabel, hpLabelNumber, hpMaxLabel, hpMaxLabelNumber, weaponLabel, weaponLabelName, weaponLabelDamageMax, weaponLabelDamageMaxNumber, imageLabelPrincipal, imageLabelPicture,
//            abilityLabel, strengthLabel, mpLabel, mpLabelNumber, mpMaxLabel, mpMaxLabelNumber, strengthLabelNumber, abilityLabelNumber, strengthMaxLabel, strengthMaxLabelNumber, abilityMaxLabel, abilityMaxLabelNumber,
//            weaponLabelWear, weaponLabelWearNumber, weaponLabelWearMaxLabel, weaponLabelWearMaxLabelNumber;
//    public Font titleFont = new Font("Times New Roman", Font.BOLD, 52);
//    public Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
//    public Font heroPanelFont = new Font("Times New Roman", Font.PLAIN, 22);
//    public JButton startButton, choice1, choice2, choice3, choice4;
//    public JTextArea mainTextArea;
//    public ImageIcon image;
//
//    public void createUI(Game.ChoiceHandler choiceHandler) {
//
//        createTitleScreen(choiceHandler);
//        createImagePanelMain();
//        createImagePanelHeroPicture();
//        createMainTextPanel();
//        createChoiceButtonPanel(choiceHandler);
//        CreateHeroPanel();
//        createWindow();
//
//    }
//
//    public void CreateHeroPanel() {
//        heroPanel = new JPanel();
//        heroPanel.setBounds(850, 260, 400, 320);
//        heroPanel.setBackground(Color.black);
//        heroPanel.setLayout(new GridLayout(12, 2));
//
//        hpLabel = new JLabel("HP : ");
//        hpLabel.setFont(heroPanelFont);
//        hpLabel.setForeground(Color.white);
//        heroPanel.add(hpLabel);
//        hpLabelNumber = new JLabel();
//        hpLabelNumber.setFont(heroPanelFont);
//        hpLabelNumber.setForeground(Color.white);
//        heroPanel.add(hpLabelNumber);
//        hpMaxLabel = new JLabel("HP max : ");
//        hpMaxLabel.setFont(heroPanelFont);
//        hpMaxLabel.setForeground(Color.yellow);
//        heroPanel.add(hpMaxLabel);
//        hpMaxLabelNumber = new JLabel();
//        hpMaxLabelNumber.setFont(heroPanelFont);
//        hpMaxLabelNumber.setForeground(Color.yellow);
//        heroPanel.add(hpMaxLabelNumber);
//        mpLabel = new JLabel("MP : ");
//        mpLabel.setFont(heroPanelFont);
//        mpLabel.setForeground(Color.lightGray);
//        heroPanel.add(mpLabel);
//        mpLabelNumber = new JLabel();
//        mpLabelNumber.setFont(heroPanelFont);
//        mpLabelNumber.setForeground(Color.lightGray);
//        heroPanel.add(mpLabelNumber);
//        mpMaxLabel = new JLabel("MP max : ");
//        mpMaxLabel.setFont(heroPanelFont);
//        mpMaxLabel.setForeground(Color.darkGray);
//        heroPanel.add(mpMaxLabel);
//        mpMaxLabelNumber = new JLabel();
//        mpMaxLabelNumber.setFont(heroPanelFont);
//        mpMaxLabelNumber.setForeground(Color.darkGray);
//        heroPanel.add(mpMaxLabelNumber);
//        weaponLabel = new JLabel("Arme : ");
//        weaponLabel.setFont(heroPanelFont);
//        weaponLabel.setForeground(Color.white);
//        heroPanel.add(weaponLabel);
//        weaponLabelName = new JLabel();
//        weaponLabelName.setFont(heroPanelFont);
//        weaponLabelName.setForeground(Color.white);
//        heroPanel.add(weaponLabelName);
//        weaponLabelDamageMax = new JLabel("Dommage Max : ");
//        weaponLabelDamageMax.setFont(heroPanelFont);
//        weaponLabelDamageMax.setForeground(Color.orange);
//        heroPanel.add(weaponLabelDamageMax);
//        weaponLabelDamageMaxNumber = new JLabel();
//        weaponLabelDamageMaxNumber.setFont(heroPanelFont);
//        weaponLabelDamageMaxNumber.setForeground(Color.orange);
//        heroPanel.add(weaponLabelDamageMaxNumber);
//        weaponLabelWear = new JLabel("Usure : ");
//        weaponLabelWear.setFont(heroPanelFont);
//        weaponLabelWear.setForeground(Color.white);
//        heroPanel.add(weaponLabelWear);
//        weaponLabelWearNumber = new JLabel();
//        weaponLabelWearNumber.setFont(heroPanelFont);
//        weaponLabelWearNumber.setForeground(Color.white);
//        heroPanel.add(weaponLabelWearNumber);
//        weaponLabelWearMaxLabel = new JLabel("Usure max : ");
//        weaponLabelWearMaxLabel.setFont(heroPanelFont);
//        weaponLabelWearMaxLabel.setForeground(Color.white);
//        heroPanel.add(weaponLabelWearMaxLabel);
//        weaponLabelWearMaxLabelNumber = new JLabel();
//        weaponLabelWearMaxLabelNumber.setFont(heroPanelFont);
//        weaponLabelWearMaxLabelNumber.setForeground(Color.white);
//        heroPanel.add(weaponLabelWearMaxLabelNumber);
//        strengthLabel = new JLabel("Force : ");
//        strengthLabel.setFont(heroPanelFont);
//        strengthLabel.setForeground(Color.white);
//        heroPanel.add(strengthLabel);
//        strengthLabelNumber = new JLabel();
//        strengthLabelNumber.setFont(heroPanelFont);
//        strengthLabelNumber.setForeground(Color.white);
//        heroPanel.add(strengthLabelNumber);
//        strengthMaxLabel = new JLabel("Force Max: ");
//        strengthMaxLabel.setFont(heroPanelFont);
//        strengthMaxLabel.setForeground(Color.yellow);
//        heroPanel.add(strengthMaxLabel);
//        strengthMaxLabelNumber = new JLabel();
//        strengthMaxLabelNumber.setFont(heroPanelFont);
//        strengthMaxLabelNumber.setForeground(Color.yellow);
//        heroPanel.add(strengthMaxLabelNumber);
//        abilityLabel = new JLabel("Habileté : ");
//        abilityLabel.setFont(heroPanelFont);
//        abilityLabel.setForeground(Color.white);
//        heroPanel.add(abilityLabel);
//        abilityLabelNumber = new JLabel();
//        abilityLabelNumber.setFont(heroPanelFont);
//        abilityLabelNumber.setForeground(Color.white);
//        heroPanel.add(abilityLabelNumber);
//        abilityMaxLabel = new JLabel("Habileté Max: ");
//        abilityMaxLabel.setFont(heroPanelFont);
//        abilityMaxLabel.setForeground(Color.yellow);
//        heroPanel.add(abilityMaxLabel);
//        abilityMaxLabelNumber = new JLabel();
//        abilityMaxLabelNumber.setFont(heroPanelFont);
//        abilityMaxLabelNumber.setForeground(Color.yellow);
//        heroPanel.add(abilityMaxLabelNumber);
//    }
//
//    public void createChoiceButtonPanel(Game.ChoiceHandler choiceHandler) {
//        choiceButtonPanel = new JPanel();
//        choiceButtonPanel.setBounds(850, 650, 400, 200);
//        choiceButtonPanel.setBackground(Color.black);
//        choiceButtonPanel.setLayout(new GridLayout(4, 1));
//
//
//        choice1 = new JButton("choix 1");
//        choice1.setBackground(Color.black);
//        choice1.setForeground(Color.white);
//        choice1.setFont(normalFont);
//        choice1.setFocusPainted(false);
//        choice1.addActionListener(choiceHandler);
//        choice1.setActionCommand("c1");
//        choiceButtonPanel.add(choice1);
//        choice2 = new JButton("choix 2");
//        choice2.setBackground(Color.black);
//        choice2.setForeground(Color.white);
//        choice2.setFont(normalFont);
//        choice2.setFocusPainted(false);
//        choice2.addActionListener(choiceHandler);
//        choice2.setActionCommand("c2");
//        choiceButtonPanel.add(choice2);
//        choice3 = new JButton("choix 3");
//        choice3.setBackground(Color.black);
//        choice3.setForeground(Color.white);
//        choice3.setFont(normalFont);
//        choice3.setFocusPainted(false);
//        choice3.addActionListener(choiceHandler);
//        choice3.setActionCommand("c3");
//        choiceButtonPanel.add(choice3);
//        choice4 = new JButton("choix 4");
//        choice4.setBackground(Color.black);
//        choice4.setForeground(Color.white);
//        choice4.setFont(normalFont);
//        choice4.setFocusPainted(false);
//        choice4.addActionListener(choiceHandler);
//        choice4.setActionCommand("c4");
//        choiceButtonPanel.add(choice4);
//    }
//
//    public void createMainTextPanel() {
//        mainTextPanel = new JPanel();
//        mainTextPanel.setBounds(40, 650, 750, 550);
//        mainTextPanel.setBackground(Color.black);
//        mainTextArea = new JTextArea("Yo");
//        mainTextArea.setBounds(40, 650, 750, 350);
//        mainTextArea.setBackground(Color.black);
//        mainTextArea.setForeground(Color.white);
//        mainTextArea.setFont(normalFont);
//        mainTextArea.setLineWrap(true);
//        mainTextArea.setWrapStyleWord(true);
//        mainTextArea.setEditable(false);
//        mainTextPanel.add(mainTextArea);
//    }
//
//    public void createImagePanelHeroPicture() {
//        imagePanelHeroPicture = new JPanel();
//        imagePanelHeroPicture.setBounds(960, 70, 140, 175);
//        imagePanelHeroPicture.setBackground(Color.black);
//        imageLabelPicture = new JLabel("");
//        imagePanelHeroPicture.add(imageLabelPicture);
//    }
//
//    public void createImagePanelMain() {
//        imagePanelMain = new JPanel();
//        imagePanelMain.setBounds(40, 70, 750, 550);
//        imagePanelMain.setBackground(Color.black);
//        imageLabelPrincipal = new JLabel("");
//        imagePanelMain.add(imageLabelPrincipal);
//    }
//
//    public void createTitleScreen(Game.ChoiceHandler choiceHandler) {
//        titleNamePanel = new JPanel();
//        titleNamePanel.setBounds(250, 250, 800, 150);
//        titleNamePanel.setBackground(Color.black);
//        titleNameLabel = new JLabel("L'AVENTURE N'ATTEND PAS");
//        titleNameLabel.setForeground(Color.white);
//        titleNameLabel.setFont(titleFont);
//        titleNamePanel.add(titleNameLabel);
//
//        startButtonPanel = new JPanel();
//        startButtonPanel.setBounds(500, 600, 250, 120);
//        startButtonPanel.setBackground(Color.black);
//
//        startButton = new JButton("C'EST PARTI !");
//        startButton.setBackground(Color.black);
//        startButton.setForeground(Color.white);
//        startButton.setFont(normalFont);
//        startButton.setFocusPainted(false);
//        startButton.addActionListener(choiceHandler);
//        startButton.setActionCommand("start");
//        startButtonPanel.add(startButton);
//
//
//    }
//
//    public void createWindow() {
//        window = new JFrame();
//        window.setSize(1280, 960);
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.getContentPane().setBackground(Color.black);
//        window.setLayout(null);
//        window.add(titleNamePanel);
//        window.add(startButtonPanel);
//        window.add(mainTextPanel);
//        window.add(imagePanelMain);
//        window.add(imagePanelHeroPicture);
//        window.add(choiceButtonPanel);
//        window.add(heroPanel);
//        window.setVisible(true);
//    }
//
//    public void setImage(JLabel imageLabelToDefine, String filename) {
//        image = new ImageIcon(".//src//main//resources//pix//" + filename);
//        imageLabelToDefine.
//    }
//
//    @Override
//    public void onStatsChange(Stats stat, int newValue) {
//        switch (stat) {
//            case HP:
//                hpLabelNumber.setText(String.valueOf(newValue));
//                break;
//        }
//
//    }
//
//    @Override
//    public void onStatsChange(Words word, String newValue) {
//
//    }
//}
