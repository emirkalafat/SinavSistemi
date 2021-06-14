/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2donemprojesi;

import java.util.ArrayList;

/**
 *
 * @author emirk
 */
public class Ders {
    private String adı;
    private int AKTS,not;
    private ArrayList<Sınav> sınavlar;
    private Ogretmen dersOgretmeni;

    public Ders(String adı, int AKTS, Ogretmen ogretmen, Bolum bolüm) {
        this.adı = adı;
        this.AKTS = AKTS;
        this.dersOgretmeni = ogretmen;
        dersOgretmeni.DersAl(this);
        bolüm.DersEkle(this);
    }

    public void sınavEkle(String ad,int soruSayısı){
        
    }
    
    public Ogretmen getDersOgretmeni() {
        return dersOgretmeni;
    }

    public void setDersOgretmeni(Ogretmen dersOgretmeni) {
        this.dersOgretmeni = dersOgretmeni;
    }

    public ArrayList<Sınav> getSınavlar() {
        return sınavlar;
    }

    public void setSınavlar(ArrayList<Sınav> sınavlar) {
        this.sınavlar = sınavlar;
    }
    
    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public int getAKTS() {
        return AKTS;
    }

    public void setAKTS(int AKTS) {
        this.AKTS = AKTS;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

  
            
            
            
}
