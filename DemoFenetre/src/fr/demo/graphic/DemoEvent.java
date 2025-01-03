package fr.demo.graphic;

import javax.swing.*;
import java.awt.*;

public class DemoEvent {
    public static void main(String[] args) {
        // Creer une fenetre
        JFrame frame = new JFrame("Demo Graphic");

        // Taille de la fenêtre
        frame.setSize(800, 600);

        // Le bouton fermer
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4,1));
        JButton button = new JButton("Bouton Test");
        button.addActionListener(e -> { System.out.println("Bouton appuyé");

            JButton addedButton = new JButton("Bouton ajouté");
            addedButton.addActionListener(addedButtonEvent -> {
                panel.remove(addedButton);
                panel.revalidate();
                panel.repaint();
            });

            panel.add(addedButton);
            panel.revalidate();
            panel.repaint();
        });
        panel.add(button);
        frame.add(panel);

        // Afficher la fenetre
        frame.setVisible(true);
    }
}
