package org.projekt;

public class Osoba {


    private String meno;
    private String priezvisko;
    private int vek;
    private String telCislo;

    public Osoba(String meno, String priezvisko, int vek, String telCislo) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
        this.telCislo = telCislo;
    }


    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }


    @Override
    public String toString() {
        return meno + " " + priezvisko + " " + vek + " " + telCislo;
    }

}
