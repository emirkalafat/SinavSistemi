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
public class Ogretmen extends Kullanıcı {

    private ArrayList<Ders> dersler = new ArrayList<>();

    public Ogretmen(String ad, String soyad, String sifre, Bolum bolum) {
        super(ad, soyad, sifre, bolum);
    }

    public void DersAl(Ders ders) {
        dersler.add(ders);
    }

    

}
