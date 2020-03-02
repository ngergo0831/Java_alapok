package oop.project.bemutato;

public class PeldanyositasOroklodes { // osztály neve -> file neve
  // Hozzuk létre az ember osztályunk példányait.
  // Ezt a részt hívjuk példányosításnak (instantiation).
  public static void main(String[] args) {
    Ember ember1 = new Ember();
    Ember ember2 = new Ember("Józsi", 180);
    Ferfi ffi = new Ferfi("Béla", 190, true);
    ffi.printValues();
  }

  // Ősosztály
  public static class Ember { // a static-ot még csak fogadjuk el
    private String nev;
    private int magassag;

    Ember() {
    }

    Ember(String nev, int magassag) {
      this.nev = nev;
      this.magassag = magassag;
    }

    // tagfüggvény, kiír ezt-azt
    public void printValues() {
      System.out.println("Név: " + this.nev + " magasság: " + this.magassag);
    }
  }

  /*
   * Leszármazott / child létrehozzuk a férfi osztályt, ami az ember osztályból
   * örököl. Ez röviden annyit jelent, hogy az 'ember' összes tulajdonságát
   * (függvényét, stb) örökli a fétfi, viszont ez másokkal is kiegészíthetjük, ami
   * csak a férfire igaz.
   */
  public static class Ferfi extends Ember {
    boolean vanFelesege;

    //Üres konstruktor esetén ugyanaz történik mint az Ember osztályban (semmi)
    public Ferfi() {
      super();
    }

    //A Ferfi példány létrehozásánál egyel több paramétert adunk meg, mint az Ember-nél.
    //A 'nev' és a 'magassag' -ot beállítjuk az Ember osztály alapján. (Átadjuk a super() függvénynek)
    //Mivel a 'vanFelesege' valtozó csak ebben az osztályban létezik, így azt egyszerűen beállítjuk,
    public Ferfi(String nev, int magassag, boolean vanFelesege) {
      super(nev, magassag);
      this.vanFelesege = vanFelesege;
    }

    //Az 'Ember' osztály printValues() függvényét szeretnénk ugyanúgy használni, ezért felülírjuk (@Override)
    //majd az ősosztály printValues() függvényének működését használjuk itt is.
    //Ha szeretnénk, meg tudnánk változtatni hogy mást csináljon a fgv.  ehhez a super-helyére kell írni amit szeretnénk
    @Override
    public void printValues() {
      super.printValues();
    }
  }
  

}