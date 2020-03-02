package oop.project.bemutato;

/**
 * Egyszerűen megfogalmazva, a package olyan mint a project, logikailag
 * összetartozó fileokat tudunk általa átláthatóan kezelni. Külön file-ba
 * rendezhetjük a függvényeinket, és a package felel azért, hogy ezt másik
 * file-ból is elérjük. Tegyük fel, hogy a file a D:\\OOP\Project\Bemutato\
 * mappában van ha csak a *\bemutato mappában szeretnénk dolgozni, azaz csak
 * ottani java file-okat használunk, akkor elég a 'package bemutato'. Ha több
 * mappában vannak a fileok, akkor szükséges így megadni
 */

public class PackageClass {
  public int a;
  private int b;
  protected int c;

  /**
   * Az 'a' változó értékét bárhol elérjük, módosíthatjuk. A 'b' változót csak a
   * PackageClass osztályunkon belül érjük el. A 'c' változót a package-en belül
   * bárhol elérjük.
   * 
   * Ha a 'b' változó értékét szeretnénk lekérdezni, vagy módosítani másik
   * osztályon belül, akkor az előző részben használt setter-getter-re lesz majd
   * szükségünk.
   */
}
