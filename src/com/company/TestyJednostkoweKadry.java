package com.company;
import java.util.Scanner;

public class TestyJednostkoweKadry {
    public static String nazwisko;
    public static String imie;
    public static float stawka;
    public static float godziny;
    public static float staz;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwisko pracownika: ");
        nazwisko = scanner.nextLine();
        System.out.print("Podaj imię pracownika: ");
        imie = scanner.nextLine();
        System.out.print("Podaj stawkę godzinową pracownika: ");
        stawka = scanner.nextFloat();
        System.out.print("Podaj godziny pracownika: ");
        godziny = scanner.nextFloat();
        System.out.print("Podaj staż pracownika: ");
        staz = scanner.nextFloat();

        Pracownik pracownik = new Pracownik(nazwisko, imie, stawka, godziny, staz);

    }
}