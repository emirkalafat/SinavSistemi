/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2donemprojesi;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author emirk
 */
public class Bolum {

    private ArrayList<Ders> dersler = new ArrayList<>();
    private String bölümAdı;
    private boolean[][] sınavTarihiMüsaitDegil = new boolean[7][6];

    public Bolum(String bölümAdı) {
        this.bölümAdı = bölümAdı;
    }

    public void dersleriListele() {
        for (int i = 0; i < dersler.size(); i++) {
            System.out.println(dersler.get(i) + "");
        }
    }

    public String sınavTarihiAyarla(Sınav sınav, int tarihIndex, int saatIndex, JComboBox gün, JComboBox saat) {
        if (saat.getSelectedIndex() != 0) {
            if (!sınavTarihiMüsaitDegil[tarihIndex][saatIndex - 1]) {
                sınav.setTarih(gün.getSelectedItem().toString());
                sınav.setSaat(saat.getSelectedItem().toString());
                sınavTarihiMüsaitDegil[tarihIndex][saatIndex - 1]=true;
                System.out.println(sınav.getSaat());
                return "Sınav eklendi.";
            } else {
                return "Sınav tarihi dolu.";
            }
        } else {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 6; j++) {
                    if(!sınavTarihiMüsaitDegil[i][j]){
                        sınav.setTarih(gün.getItemAt(i).toString());
                        sınav.setSaat(saat.getItemAt(j+1).toString());
                        sınavTarihiMüsaitDegil[i][j]=true;
                        System.out.println(sınav.getSaat());
                        return "Sınav eklendi.";
                    }
                }
            }
            return "Sınav eklenemedi";
        }

    }



    @Override
    public String toString() {
        return "Bolum{" + "dersler=" + dersler + ", b\u00f6l\u00fcmAd\u0131=" + bölümAdı + '}';
    }

    public void DersEkle(Ders ders) {
        dersler.add(ders);
    }

    public ArrayList<Ders> getDersler() {
        return dersler;
    }

    public void setDersler(ArrayList<Ders> dersler) {
        this.dersler = dersler;
    }

    public String getBölümAdı() {
        return bölümAdı;
    }

    public void setBölümAdı(String bölümAdı) {
        this.bölümAdı = bölümAdı;
    }


    public boolean[][] getSınavTarihiMüsaitDegil() {
        return sınavTarihiMüsaitDegil;
    }

    public void setSınavTarihiMüsaitDegil(boolean[][] sınavTarihiMüsaitDegil) {
        this.sınavTarihiMüsaitDegil = sınavTarihiMüsaitDegil;
    }

}
