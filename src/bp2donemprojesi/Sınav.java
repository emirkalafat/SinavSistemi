/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2donemprojesi;

import java.util.Date;

/**
 *
 * @author emirk
 */
public class Sınav {
    private int soruSayısı,not;
    private boolean yapıldıMı,sonuçlandıMı;
    private String sınavAdı,gün,saat;
    private Ders hangiDersinSınavı;
    public Sınav(Ders ders) {
        this.hangiDersinSınavı = ders;
        this.sonuçlandıMı = false;
        this.yapıldıMı = false;
    }

    @Override
    public String toString() {
        return "S\u0131nav{" + "soruSay\u0131s\u0131=" + soruSayısı + ", not=" + not + ", yap\u0131ld\u0131M\u0131=" + yapıldıMı + ", sonu\u00e7land\u0131M\u0131=" + sonuçlandıMı +  ", s\u0131navAd\u0131=" + sınavAdı + ", hangiDersinS\u0131nav\u0131=" + hangiDersinSınavı + '}';
    }
    public void tamTarihAyarla(String saat,String gün){
        this.setTarih(gün);
        this.setSaat(saat);
    }
        
    
    public Ders getHangiDersinSınavı() {
        return hangiDersinSınavı;
    }

    public void setHangiDersinSınavı(Ders hangiDersinSınavı) {
        this.hangiDersinSınavı = hangiDersinSınavı;
    }

    public String getSınavAdı() {
        return sınavAdı;
    }

    public void setSınavAdı(String sınavAdı) {
        this.sınavAdı = sınavAdı;
    }

    public int getSoruSayısı() {
        return soruSayısı;
    }

    public void setSoruSayısı(int soruSayısı) {
        this.soruSayısı = soruSayısı;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public boolean isYapıldıMı() {
        return yapıldıMı;
    }

    public void setYapıldıMı(boolean yapıldıMı) {
        this.yapıldıMı = yapıldıMı;
    }

    public boolean isSonuçlandıMı() {
        return sonuçlandıMı;
    }

    public void setSonuçlandıMı(boolean sonuçlandıMı) {
        this.sonuçlandıMı = sonuçlandıMı;
    }

    public String getTarih() {
        return gün;
    }

    public void setTarih(String tarih) {
        this.gün = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }
    
}
