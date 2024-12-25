package fr.demo.graphic;

import javax.swing.*;
import java.awt.*;

public class DemoListPerson {
    public static void main(String[] args) {
        // Creer une fenetre
        JFrame frame = new JFrame("Demo Graphic");

        // Taille de la fenêtre
        frame.setSize(800, 600);

        // Le bouton fermer
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // -------------------------------------------------------
        // CONTENU
        // -------------------------------------------------------
        String[] persons = {
                "Isaac", "Christophe", "Fredo", "Jerezouz", "Master Of Bonk", "Brad Bite"
        };

        //Element graphique qui affiche la liste
        JList<String> list = new JList<String>(persons);
        JScrollPane scrollPane = new JScrollPane(list);

        frame.add(scrollPane);

        // Afficher la fenetre
        frame.setVisible(true);
    }
}
