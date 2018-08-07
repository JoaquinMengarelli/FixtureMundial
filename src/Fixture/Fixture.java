package Fixture;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Fixture {

    public static void main(String[] args) {
       JFrame frame = new JFrame("Fase de Grupos");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,500);
       frame.setLayout(null);
       frame.setResizable(false);
    
       Border borde = BorderFactory.createLineBorder(Color.BLACK);
       
    }  
    
}
