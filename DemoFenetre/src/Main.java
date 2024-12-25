import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Créer une fenetre
        JFrame frame = new JFrame("Demo Graphic");
        //Taille de la fenetre
        frame.setSize(800,600);
        //Bouton pour fermer la fenetre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Créer un panneau en grille
        JPanel panel = new JPanel(new GridLayout(2, 1, 5, 5));

        //Contenu
        JButton button = new JButton("Je veux devenir riche");

        //Pour ajouter des elements dans la fenetre
        //Il faut que la fenetre ai au moins un layout
        //Layout = pour gérer les dispositions des éléments


        //Ajouter le panneau dans la fenetre
        frame.add(panel);
        //Ajoute le bouton dans le Grid de la fenetre
        panel.add(button);

        //Créer et ajouter dans le Layout de la fenetre
        JLabel label = new JLabel("Je suis pauvre = Je suis étudiant");
        panel.add(label);


        //Afficher la fenetre
        frame.setVisible(true);
    }
}