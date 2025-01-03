package fr.demo.graphic;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DemoGrid {
    public static void main(String[] args) {
        // Creer une fenetre
        JFrame frame = new JFrame("Demo Graphic");

        // Taille de la fenêtre
        frame.setSize(800, 600);

        // Le bouton fermer
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        List<String> products = new ArrayList<>();
        int nombreLigne = (int) Math.ceil(products.size() /6f);
        JPanel panel = new JPanel(new GridLayout(nombreLigne, 6));

        for (int i = 0; i < 30; i++) {
            products.add("Produit " + i);
        }

        for (String product : products) {
            panel.add(new JButton(product));
        }

        frame.add(panel);

        // Afficher la fenetre
        frame.setVisible(true);
    }
}
