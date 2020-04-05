package adventuregame.view;

import javax.swing.*;
import java.awt.*;

public class HeroPanel extends JPanel {

    private JLabel hpLabel, hpLabelNumber, hpMaxLabel, hpMaxLabelNumber, weaponLabel, weaponLabelName, weaponLabelDamageMax, weaponLabelDamageMaxNumber,
            abilityLabel, strengthLabel, mpLabel, mpLabelNumber, mpMaxLabel, mpMaxLabelNumber, strengthLabelNumber, abilityLabelNumber, strengthMaxLabel, strengthMaxLabelNumber, abilityMaxLabel, abilityMaxLabelNumber,
            weaponLabelWear, weaponLabelWearNumber, weaponLabelWearMaxLabel, weaponLabelWearMaxLabelNumber;

    private Font heroPanelFont = new Font("Times New Roman", Font.PLAIN, 22);

    public HeroPanel() {
        super();
        setBounds(850, 260, 400, 320);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(12, 2));
        hpLabel = new JLabel("HP : ");
        hpLabel.setFont(heroPanelFont);
        hpLabel.setForeground(Color.white);
        add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(heroPanelFont);
        hpLabelNumber.setForeground(Color.white);
        add(hpLabelNumber);
        hpMaxLabel = new JLabel("HP max : ");
        hpMaxLabel.setFont(heroPanelFont);
        hpMaxLabel.setForeground(Color.yellow);
        add(hpMaxLabel);
        hpMaxLabelNumber = new JLabel();
        hpMaxLabelNumber.setFont(heroPanelFont);
        hpMaxLabelNumber.setForeground(Color.yellow);
        add(hpMaxLabelNumber);
        mpLabel = new JLabel("MP : ");
        mpLabel.setFont(heroPanelFont);
        mpLabel.setForeground(Color.lightGray);
        add(mpLabel);
        mpLabelNumber = new JLabel();
        mpLabelNumber.setFont(heroPanelFont);
        mpLabelNumber.setForeground(Color.lightGray);
        add(mpLabelNumber);
        mpMaxLabel = new JLabel("MP max : ");
        mpMaxLabel.setFont(heroPanelFont);
        mpMaxLabel.setForeground(Color.darkGray);
        add(mpMaxLabel);
        mpMaxLabelNumber = new JLabel();
        mpMaxLabelNumber.setFont(heroPanelFont);
        mpMaxLabelNumber.setForeground(Color.darkGray);
        add(mpMaxLabelNumber);
        weaponLabel = new JLabel("Arme : ");
        weaponLabel.setFont(heroPanelFont);
        weaponLabel.setForeground(Color.white);
        add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(heroPanelFont);
        weaponLabelName.setForeground(Color.white);
        add(weaponLabelName);
        weaponLabelDamageMax = new JLabel("Dommage Max : ");
        weaponLabelDamageMax.setFont(heroPanelFont);
        weaponLabelDamageMax.setForeground(Color.orange);
        add(weaponLabelDamageMax);
        weaponLabelDamageMaxNumber = new JLabel();
        weaponLabelDamageMaxNumber.setFont(heroPanelFont);
        weaponLabelDamageMaxNumber.setForeground(Color.orange);
        add(weaponLabelDamageMaxNumber);
        weaponLabelWear = new JLabel("Usure : ");
        weaponLabelWear.setFont(heroPanelFont);
        weaponLabelWear.setForeground(Color.white);
        add(weaponLabelWear);
        weaponLabelWearNumber = new JLabel();
        weaponLabelWearNumber.setFont(heroPanelFont);
        weaponLabelWearNumber.setForeground(Color.white);
        add(weaponLabelWearNumber);
        weaponLabelWearMaxLabel = new JLabel("Usure max : ");
        weaponLabelWearMaxLabel.setFont(heroPanelFont);
        weaponLabelWearMaxLabel.setForeground(Color.white);
        add(weaponLabelWearMaxLabel);
        weaponLabelWearMaxLabelNumber = new JLabel();
        weaponLabelWearMaxLabelNumber.setFont(heroPanelFont);
        weaponLabelWearMaxLabelNumber.setForeground(Color.white);
        add(weaponLabelWearMaxLabelNumber);
        strengthLabel = new JLabel("Force : ");
        strengthLabel.setFont(heroPanelFont);
        strengthLabel.setForeground(Color.white);
        add(strengthLabel);
        strengthLabelNumber = new JLabel();
        strengthLabelNumber.setFont(heroPanelFont);
        strengthLabelNumber.setForeground(Color.white);
        add(strengthLabelNumber);
        strengthMaxLabel = new JLabel("Force Max: ");
        strengthMaxLabel.setFont(heroPanelFont);
        strengthMaxLabel.setForeground(Color.yellow);
        add(strengthMaxLabel);
        strengthMaxLabelNumber = new JLabel();
        strengthMaxLabelNumber.setFont(heroPanelFont);
        strengthMaxLabelNumber.setForeground(Color.yellow);
        add(strengthMaxLabelNumber);
        abilityLabel = new JLabel("Habileté : ");
        abilityLabel.setFont(heroPanelFont);
        abilityLabel.setForeground(Color.white);
        add(abilityLabel);
        abilityLabelNumber = new JLabel();
        abilityLabelNumber.setFont(heroPanelFont);
        abilityLabelNumber.setForeground(Color.white);
        add(abilityLabelNumber);
        abilityMaxLabel = new JLabel("Habileté Max: ");
        abilityMaxLabel.setFont(heroPanelFont);
        abilityMaxLabel.setForeground(Color.yellow);
        add(abilityMaxLabel);
        abilityMaxLabelNumber = new JLabel();
        abilityMaxLabelNumber.setFont(heroPanelFont);
        abilityMaxLabelNumber.setForeground(Color.yellow);
        add(abilityMaxLabelNumber);
    }
}
