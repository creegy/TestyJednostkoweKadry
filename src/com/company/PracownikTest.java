package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracownikTest {

    @Test
    void poprawneObliczaniePodstawy() {
        Pracownik pracownik = new Pracownik("Nowak", "Jan", 50, 80, 20);
        Assertions.assertEquals(4000, pracownik.obliczPodstawe());
    }

    @Test
    void poprawneObliczanieDodatku() {
        Pracownik pracownik = new Pracownik("Nowak", "Jan", 50, 80, 20);
        Assertions.assertEquals(4000 * 20 * 0.05, pracownik.obliczDodatek());
    }

    @Test
    void poprawneObliczenieWynagrodzenia() {
        Pracownik pracownik = new Pracownik("Nowak", "Jan", 50, 80, 20);
        Assertions.assertEquals(8000, pracownik.obliczWynagrodzenie());
    }

    @Test
    void poprawneUstawianiaNazwiska() {
        Pracownik pracownik = new Pracownik("01234567890123456789012345678901234567890123456789Nowak", "Jan", 50, 80, 20);
        Assertions.assertEquals("01234567890123456789012345678901234567890123456789", pracownik.getNazwisko());
    }

    @Test
    void poprawneUstawienieImienia() {
        Pracownik pracownik = new Pracownik("Nowak", "01234567890123456789Jan", 50, 80, 20);
        Assertions.assertEquals("01234567890123456789", pracownik.getImie());
    }

    @Test
    void poprawneUstawienieGodzin() {
        Pracownik pracownik = new Pracownik("Nowak", "Jan", 50, 350, 20);
        Assertions.assertEquals(320, pracownik.getGodziny());
    }

    @Test
    void poprawneUstawienieStazu() {
        Pracownik pracownik = new Pracownik("Nowak", "Jan", 50, 320, 57);
        Assertions.assertEquals(55, pracownik.getStaz());
    }

    @Test
    void czyPoprawnyKonstruktor() {
        Pracownik pracownik = new Pracownik("01234567890123456789012345678901234567890123456789Nowak", "01234567890123456789Jan", 50, 350, 57);
        Assertions.assertEquals("01234567890123456789012345678901234567890123456789", pracownik.getNazwisko());
        Assertions.assertEquals("01234567890123456789", pracownik.getImie());
        Assertions.assertEquals(320, pracownik.getGodziny());
        Assertions.assertEquals(55, pracownik.getStaz());
    }

    @Test
    void poprawnyToString() {
        Pracownik pracownik = new Pracownik("Nowak", "Jan", 50, 40, 20);
        Assertions.assertEquals("Pracownik Nowak Jan podstawa: 2000.0 dodatek: 2000.0 wynagrodzenie: 4000.0", pracownik.toString());
    }
}