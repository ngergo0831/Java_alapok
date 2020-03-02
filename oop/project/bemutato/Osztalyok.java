package oop.project.bemutato;

public class Osztalyok{
  public static void main(String[] args) {
    /**
     * Hasonló a működése a struktúrához, annyi különbséggel,
     * hogy a struktúra minden adattagja publikus.
     * Javaban osztályokat használunk helyette (Class).
     * Egy osztályt 2 részre bonthatunk:
     * Adattagok, függvények.
     * Speciális tagfüggvény a konstruktor, ami egy
     * példány létrehozásánál hívódik meg. (Példa lent).
     */
    Ember ember1 = new Ember();
    Ember ember2 = new Ember("Józsi",180);
  }

  public static class Ember {
    private String nev;
    private int magassag;

    Ember() {
       // üres konstruktor. Ember ember1 = new Ember() <--- itt hívódik meg
    }

    Ember(String nev, int magassag) {
      this.nev = nev;
      this.magassag = magassag;
      /*
       * Ember ember2 = new Ember("Bela",180) <--- paraméteres konstruktor hívódik
       * meg. Mivel ugyanazt a nevet adtuk a függvény paraméterének, és az osztály
       * adattagjainak is, ezért a this kulcsszóval tudunk hivatkozni az osztály
       * adattagjára. Ha a függvény paraméterének más lenne a neve, akkor nem
       * szükséges a this. Átláthatóság szempontjából szokták ugyanazt a nevet adni a
       * két változónak.
       */
    }
        /*
     * Setter-Getter Mivel privátok az adattagjaink (nev,magassag), ezért kell egy
     * függvény amivel az értéküket kérdezhetjük le , és kell egy amivel az értékét
     * tudjuk beállítani. setVáltozónév és getVáltozónév szokott a nevük lenni.
     */

    public String getNev() {
      return this.nev;
    } // visszatér a `nev` aktuális értékével

    public void setNev(String nev) {
      this.nev = nev;
    } // a paraméterként megadott értéket állítja be értékül.

    // tagfüggvény, kiír ezt-azt
    public void printValues() {
      System.out.println("Név: " + this.nev + " magasság: " + this.magassag);
    }
  } // Ember osztály vége
}