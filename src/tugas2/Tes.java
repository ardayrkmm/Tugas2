/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Tes {
    public static void main(String[] args) {
        DataKomputer data = new DataKomputer();
        do{
            int p = data.pilihanMenu();
            switch (p) {
                case AppInterface.ADD_DATA_KOMPUTER -> {
                    data.add();
                }
                case AppInterface.SEARCH_BY_BRAND -> {
                     String[] keywords = {"Lenobo","leno", "eno", "ovo"};
                     String key = data.keyword(keywords);
                     
                   Komputer k = data.searchByBrand(key);
                   data.viewData(k);
                }
                case AppInterface.SEARCH_BY_MODEL -> {
                    String[] keywords = {"48", "b4", "B4"};
                                         String key = data.keyword(keywords);
                   Komputer k = data.searchByModel(key);
                   data.viewData(k);
                }
                case AppInterface.EXIT ->{
                    data.Exit();
                }   
                default -> {
                    JOptionPane.showMessageDialog(null, "Pilihan salah:");
                }
              
            }
        }while(true);
    }
}
