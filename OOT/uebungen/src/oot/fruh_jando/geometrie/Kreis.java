package oot.fruh_jando.geometrie;

/**
 * Klasse, welche einen Kreis im Sinne einer geometrischen Figur implementiert.
 * Ein Kreis ist eine Vollwertige Figur, da sie einen Umfang besitzt.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Kreis extends VollwertigeFigur {
    /**
     * <p>
     * Der Radius ist ein spezifisches geometrisches Element und wird
     * deshalb nicht vererbt
     * </p>
     */
    protected double radius;

    /**
     * Konstruktor um einen Kreis zu spezifizieren
     *
     * @param radius Gibt des Radius des Kreises an
     */
    Kreis(double radius) {
        this.radius = radius;
        this.berechneFlaeche();
        this.berechneUmfang();
    }

    //Keine Vererbung, da die Kreis-Fläche spezifisch ist.
    private void berechneFlaeche() {
        this.flaeche = Math.pow(this.radius, 2) * Math.PI;
    }

    //Keine Vererbung, da der Kreis-Umfang spezifisch ist.
    private void berechneUmfang() {
        this.umfang = 2 * this.radius * Math.PI;
    }

}
