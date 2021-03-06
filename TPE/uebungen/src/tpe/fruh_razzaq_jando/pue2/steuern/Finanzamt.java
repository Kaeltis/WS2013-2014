package tpe.fruh_razzaq_jando.pue2.steuern;

import java.util.LinkedList;

/**
 * Klasse, welche ein Finanzamt implementiert.
 *
 * @author TPE_UIB_01
 */
public final class Finanzamt {

    /**
     * Einmalige Instanz des Finzanzamtes.
     */
    public static final Finanzamt INSTANZ = new Finanzamt();

    /**
     * Statische Liste um die Einkommensteuer zu verwalten.
     */
    private static final LinkedList<Einkommensteuer>
            EINKOMMENSTEUERLIST = new LinkedList<Einkommensteuer>();
    /**
     * Statische Liste um die Koerperschaftssteuer zu verwalten.
     */
    private static final LinkedList<Koerperschaftsteuer>
            KOERPERSCHAFTSTEUERLIST = new LinkedList<Koerperschaftsteuer>();
    /**
     * Statische Liste um die Gewerbesteuer zu verwalten.
     */
    private static final LinkedList<Gewerbesteuer>
            GEWERBESTEUERLIST = new LinkedList<Gewerbesteuer>();

    /**
     * Private Konstruktor der Klasse Finzamt,
     * um weitere Objektreferenzen der Klasse
     * zu vermeiden.
     */
    private Finanzamt() {

    }

    /**
     * Getter der Finanzamt-Instanz, welche angelegt wurde.
     *
     * @return Die angelegte Finanzamt Instanz.
     */
    public static Finanzamt getInstance() {
        return INSTANZ;
    }

    /**
     * Statische Methode, um einen Verwender des Interfaces
     * Einkommenssteuer durch Polymorphie in die Liste hinzuzufügen.
     *
     * @param e Durch Polymorhpie übergebene Klassenreferenz,
     *          des Verwenders(Interface)
     */
    public static void addEinkommensteuerpflichtig(Einkommensteuer e) {
        EINKOMMENSTEUERLIST.add(e);
    }

    /**
     * Statische Methode, um einen Verwender des
     * Interfaces Koerperschaftssteuer durch Polymorphie
     * in die Liste hinzuzufügen.
     *
     * @param k Durch Polymorhpie übergebene Klassenreferenz,
     *          des Verwenders(Interface)
     */
    public static void addKoerperschaftsteuerpflichtig(Koerperschaftsteuer k) {
        KOERPERSCHAFTSTEUERLIST.add(k);
    }

    /**
     * Statische Methode, um einen Verwender des Interfaces Gewerbesteuer durch
     * Polymorphie in die Liste hinzuzufügen.
     *
     * @param g Durch Polymorhpie übergebene Klassenreferenz,
     *          des Verwenders(Interface)
     */
    public static void addGewerbesteuerpflichtig(Gewerbesteuer g) {
        GEWERBESTEUERLIST.add(g);
    }

    /**
     * Methode, welche alle Steuern zusammen rechnet.
     *
     * @return Die gesamten Steuern
     */
    public static int berecheSteuer() {
        return berechneEinkommensteuer()
                + berechneGewerbesteuer()
                + berechneKoerperschaftsteuer();
    }

    /**
     * Methode, welche die gesamte Einkommensteuer berechnet.
     *
     * @return Die gesamte Einkommensteuer
     */
    public static int berechneEinkommensteuer() {
        int summe = 0;

        /**
         * Es wird die dynamische Liste der Einkommenssteuer durchlaufen
         * @param e Ist hierbei ein Verwender des Interfaces Einkommensteuer
         */
        for (Einkommensteuer e : EINKOMMENSTEUERLIST) {
            summe += e.berechneEinkommensteuer();
        }
        return summe;
    }

    /**
     * Methode, welche die gesamte Koerperschaftsteuer berechnet.
     *
     * @return Die gesamte Koerperschaftsteuer
     */
    public static int berechneKoerperschaftsteuer() {
        int summe = 0;
        /**
         * Es wird die dynamische Liste der Koerperschaftsteuer durchlaufen
         * @param k Ist hierbei ein Verwender des
         *          Interfaces Koerperschaftsteuer
         */
        for (Koerperschaftsteuer k : KOERPERSCHAFTSTEUERLIST) {
            summe += k.berechneKoerperschaftsteuer();
        }
        return summe;
    }

    /**
     * Methode, welche die gesamte Gewerbesteuer berechnet.
     *
     * @return Die gesamte Gewerbesteuer
     */
    public static int berechneGewerbesteuer() {
        int summe = 0;

        /**
         * Es wird die dynamische Liste der Gewerbesteuer durchlaufen
         * @param g Ist hierbei ein Verwender des Interfaces Gewerbesteuer
         */
        for (Gewerbesteuer g : GEWERBESTEUERLIST) {
            summe += g.berechneGewerbesteuer();
        }
        return summe;
    }
}
