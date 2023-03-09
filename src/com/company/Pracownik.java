package com.company;
public class Pracownik {
    public String toString;
    private String nazwisko;
    private String imie;
    private float stawka;
    private float godziny;
    private float staz;

    public Pracownik(String nazwisko, String imie, float stawka, float godziny, float staz) {
        this.setNazwisko(nazwisko);
        this.setImie(imie);
        this.setStawka(stawka);
        this.setGodziny(godziny);
        this.setStaz(staz);
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko.length()>50){
            this.nazwisko = nazwisko.substring(0, 50);
        } else {
            this.nazwisko = nazwisko;
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie.length()>20){
            this.imie = imie.substring(0, 20);
        }
        else {
            this.imie = imie;
        }
    }

    public float getStawka() {
        return stawka;
    }

    public void setStawka(float stawka) {
        this.stawka = stawka;
    }

    public float getGodziny() {
        return godziny;
    }

    public void setGodziny(float godziny) {
        if(godziny<0) {
            this.godziny = 0F;
        }
        else if(godziny > 320){
            this.godziny = 320F;
        } else {
            this.godziny = godziny;
        }
    }

    public float getStaz() {
        return staz;
    }

    public void setStaz(float staz) {
        if(staz < 0){
            this.staz = 0F;
        }
        else if(staz > 55){
            this.staz = 55F;
        } else {
            this.staz = staz;
        }
    }

    public float obliczPodstawe(){
        return this.stawka * this.godziny;
    }

    public float obliczDodatek(){
        return this.staz * 0.05F * obliczPodstawe();
    }

    public float obliczWynagrodzenie(){
        return obliczPodstawe() + obliczDodatek();
    }


    @Override
    public String toString() {
        return "Pracownik " + nazwisko + " " + imie + " podstawa: " + obliczPodstawe() +
                " dodatek: " + obliczDodatek() + " wynagrodzenie: " + obliczWynagrodzenie();
    }
}