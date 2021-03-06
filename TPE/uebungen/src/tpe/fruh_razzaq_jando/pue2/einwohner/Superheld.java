package tpe.fruh_razzaq_jando.pue2.einwohner;

import tpe.fruh_razzaq_jando.pue2.helper.Superkraft;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Klasse zur Implemntierung eines Superhelden.
 *
 * @author TPE_UIB_01
 */
public class Superheld extends Mutant {

    /**
     * Membervariable zur Beschreibung der Superkräfte.
     */
    private LinkedList<Superkraft> superkraefte = new LinkedList<Superkraft>();

    /**
     * Konstruktor des Superhelden.
     *
     * @param name              Name des Helden
     * @param einkommen         Einkommen des Helden
     * @param mutation          Mutation des Helden
     * @param pflichtSuperkraft Pflichtsuperkraft des Helden
     * @param superkraefte      Weitere Superkräfte des Helden
     */
    public Superheld(String name, int einkommen, String mutation,
                     Superkraft pflichtSuperkraft, Superkraft... superkraefte) {

        super(name, einkommen, mutation);
        this.superkraefte.add(pflichtSuperkraft);
        Collections.addAll(this.superkraefte, superkraefte);
    }

    /**
     * Getter der Membervariable Superkräfte.
     *
     * @return Dynamische Liste der Superkräfte
     */
    public LinkedList<Superkraft> getSuperkraefte() {
        return superkraefte;
    }

    /**
     * Methode, um zwei Mutanten gegeneinander kämpfen zu lassen.
     *
     * @param m Ein Gegner(Mutant) zum Kämpfen
     * @return Den Ausgang des Kampfes(true, false)
     */
    @Override
    public boolean kaempfe(Mutant m) {
        if (m instanceof Schurke) {
            /*
            Aufruf von Schurke.kaempfe(), da der Ausgang des Kampfes,
            bei gleichen Objekten, in jeder Richtung gleich ausgehen muss,
            das Ergebnis muss nur negiert sein.
            */
            return !m.kaempfe(this);
        } else {
            throw new IllegalArgumentException(
                    "Superheld darf nicht gegen einen "
                            + "anderen Superhelden kämpfen!");
        }
    }

    /**
     * Methode um bei der Ausgabe eines Objektes
     * einen sinnvollen Wert auszugeben.
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Superheld{"
                + "superkraefte="
                + superkraefte
                + "} "
                + super.toString();
    }
}