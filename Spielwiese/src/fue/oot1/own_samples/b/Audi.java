package fue.oot1.own_samples.b;


public class Audi extends Auto {
    void fahren(int dauer){
        System.out.println("Ich bin die Klasse: " + this.getClass().getSimpleName() +
                " und fahre " +dauer+ " Stunden");
    }
}
