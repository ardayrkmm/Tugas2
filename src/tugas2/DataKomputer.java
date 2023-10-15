/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class DataKomputer implements AppInterface{
private final Komputer[] komputer;
public DataKomputer(){
    
    komputer = new Komputer[1000];
}
    @Override
    public int pilihanMenu() {
        String p = JOptionPane.showInputDialog(null, ""
+"<html>" +
                
"============pilihan=<br>"+

"1 &arr: Tambah Data Komputer<br>" +



"2 &arr: Cari berdasarkan Brand Komputer<br>"+ "3 &arr; Cazi berdasarkan Model Komputer<br>"+

"4 &arr : Keluar aplikasi <br>"+

                "=============================<br>"+
                "<b>Ketik pilihan anda :<b/>"+ "</html>",

"Menu Pilihan",

JOptionPane.QUESTION_MESSAGE);

int pilihan = Integer.parseInt(p); // casting

return pilihan;
    }

    @Override
    public void add() {
       Komputer kom = new Komputer();
       String brand = JOptionPane.showInputDialog(null, "Ketik Brand : ", "" + "Brand", JOptionPane.QUESTION_MESSAGE);
       kom.setBrand(brand);
       String model = JOptionPane.showInputDialog(null, "Ketik Model : ", "" + "Brand", JOptionPane.QUESTION_MESSAGE);
       kom.setModel(model);
            String disk = JOptionPane.showInputDialog(null, "Ketik disk type : ", "" + "Brand", JOptionPane.QUESTION_MESSAGE);
       kom.setDisk(model);
            String size = JOptionPane.showInputDialog(null, "Ketik disk size : ", "" + "Brand", JOptionPane.QUESTION_MESSAGE);
      int diskSize = Integer.parseInt(size);
      kom.setDiskSize(diskSize);
         String ram = JOptionPane.showInputDialog(null, "Ketik ram : ", "" + "Brand", JOptionPane.QUESTION_MESSAGE);
      int ramSize = Integer.parseInt(ram);
      kom.setDiskSize(ramSize);
      
      for (int i = 0; i< komputer.length; i++){
          if(komputer[i] == null){
              komputer[i] = kom;
              break;
          }
      }
        viewData(kom);
    }

    @Override
    public String keyword(String[] type) {
        String key = JOptionPane.showInputDialog(null, "Ketik " +Arrays.toString(type)+ " komputer", Arrays.toString(type),JOptionPane.QUESTION_MESSAGE);
        return key;
    }

    @Override
    public Komputer searchByBrand(String brand) {
        Komputer kom = null;
        for (Komputer k : komputer){
            if(k != null && brand.equalsIgnoreCase(k.getBrand())){
                
                kom = k;
                break;
            }
        }
        return kom;
    }

    @Override
    public Komputer searchByModel(String model) {
            Komputer kom = null;
        for (Komputer k : komputer){
            if(k != null && model.equalsIgnoreCase(k.getModel())){
                kom = k;
                break;
            }
        }
        return kom;
    }

    @Override
    public void viewData(Komputer K) {
        if(K == null){
            JOptionPane.showMessageDialog(null, "Data tidak di temukan");
        }else{
            JOptionPane.showMessageDialog(null, "Brand\t\t: " + K.getBrand() + 
                    "\nModel\t\t: " + K.getModel() +
                    "\nDisk Type\t\t: " + K.getDisk() + 
                    "\nDisk Size\t\t: " + K.getDiskSize() + 
                    "\nRam \t\t: " + K.getRam(),
                    "Data Komputer" , JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void Exit() {
        System.exit(0);
    }
    
}
