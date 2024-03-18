/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import javax.swing.*;

public class Quiz {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        GUI g = new GUI();
    }
    
}
 class GUI extends JFrame{
     JLabel kendaraan = new JLabel("Jenis Kelamin : ");
     JRadioButton motor = new JRadioButton("motor");
     JRadioButton mobil = new JRadioButton("mobil");
     
     
     public GUI() {
         setTitle("Pilihan kendaraan");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(350, 200);
         
         ButtonGroup group = new ButtonGroup();
         group.add(motor);
         group.add(mobil);
         
         setLayout(null);
         
         add(motor);
         add(mobil);
         add(kendaraan);
         
         motor.setBounds(130, 35, 100, 20);
         mobil.setBounds(230, 35, 100, 20);
         kendaraan.setBounds(10, 35, 150, 20);
         
         setVisible(true);
         setLocationRelativeTo(null);
     }
 }
