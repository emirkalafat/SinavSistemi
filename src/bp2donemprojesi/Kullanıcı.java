/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2donemprojesi;

/**
 *
 * @author emirk
 */
public abstract class Kullanıcı implements Giris {

    private String ad;
    private String soyad, sifre;
    private Bolum bölüm;

    protected Kullanıcı(String ad, String soyad, String sifre, Bolum bolum) {
        this.ad = ad;
        this.soyad = soyad;
        this.sifre = sifre;
        this.bölüm = bolum;
    }

    @Override
    public String toString() {
        return "Kullan\u0131c\u0131{" + "ad=" + ad + ", soyad=" + soyad + ", bol\u00fcm=" + bölüm + '}';
    }

    @Override
    public boolean GirisIslemi(String girdi, String kullanıcıAdı) {
        return girdi.equals(this.getSifre()) && kullanıcıAdı.equals(this.tamAd());
    }

    @Override
    public String tamAd() {
        return this.ad + " " + this.soyad;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Bolum getBölüm() {
        return bölüm;
    }

    public void setBölüm(Bolum bölüm) {
        this.bölüm = bölüm;
    }

}
