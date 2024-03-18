/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;


import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;

public class Penyewaan {
    
public class DetailPenyewaan extends JFrame {

  private HashMap<String, Integer> hargaKendaraan;

  public DetailPenyewaan() {
   
    setLayout(new BorderLayout());
  
    JPanel inputPanel = new JPanel();
    JLabel namaLabel = new JLabel("Nama Penyewa:");
    JTextField namaTextField = new JTextField();
    JLabel nomorTeleponLabel = new JLabel("Nomor Telepon:");
    JTextField nomorTeleponTextField = new JTextField();
    
    inputPanel.add(namaLabel);
    inputPanel.add(namaTextField);
    inputPanel.add(nomorTeleponLabel);
    inputPanel.add(nomorTeleponTextField);
    
    add(inputPanel, BorderLayout.NORTH);
    
    JPanel PilihanKendaraanPanel = new JPanel();
    PilihanKendaraanPanel.setBorder(BorderFactory.createTitledBorder("Pilihan Kendaraan"));
    
    hargaKendaraan.put("Matic", 100000);
    hargaKendaraan.put("Manual", 300000);
    
    ButtonGroup PilihanKendaraanButtonGroup = new ButtonGroup();
    for (String PilihanKendaraan : hargaKendaraan.keySet()) {
      JRadioButton PilihanKendaraanRadioButton = new JRadioButton(PilihanKendaraan);
      PilihanKendaraanRadioButton.setActionCommand(PilihanKendaraan);
      PilihanKendaraanButtonGroup.add(PilihanKendaraanRadioButton);
      PilihanKendaraanPanel.add(PilihanKendaraanRadioButton);
    }
    
    add(PilihanKendaraanPanel, BorderLayout.CENTER);

    JPanel bawahPanel = new JPanel();
    
    JLabel lamaSewaLabel = new JLabel("Lama Sewa (hari):");
    JTextField lamaSewaTextField = new JTextField();
   
    JButton btnSimpan = new JButton("Simpan");
    
    bawahPanel.add(lamaSewaLabel);
    bawahPanel.add(lamaSewaTextField);
    bawahPanel.add(btnSimpan);
    
    add(bawahPanel, BorderLayout.SOUTH);
    
    btnSimpan.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        
        String namaPenyewa = namaTextField.getText();
        String nomorTelepon = nomorTeleponTextField.getText();
        String PilihanKendaraan = PilihanKendaraanButtonGroup.getSelection().getActionCommand();
        int lamaSewa = Integer.parseInt(lamaSewaTextField.getText());
        int hargaTotal = hargaKendaraan.get(PilihanKendaraan) * lamaSewa;
       
        JOptionPane.showMessageDialog(null, 
          "Detail Penyewaan:\n" +
          "Nama Penyewa: " + namaPenyewa + "\n" +
          "Nomor Telepon: " + nomorTelepon + "\n" +
          "Pilihan Kendaraan: " + PilihanKendaraan + "\n" +
          "Lama Sewa: " + lamaSewa + " hari\n" +
          "Harga Total: Rp" + hargaTotal);
      }
    });
   
    setSize(400, 300);
    setLocationRelativeTo(null);
  }
