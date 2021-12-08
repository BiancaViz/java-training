
package clean.code.design_patterns.requirements;

public class CaminRegie extends Camin {
    @Override
    public void securitate() {
        System.out.println("Punem usa la camera.");
    }
    @Override
    public void mobilier() {
        System.out.println("Adaugam 2 paturi, 2 mese si un dulap.");
    }
    @Override
    public void constructieCamere() {
        System.out.println("Am construit camere de 10 mp. ");
    }
    @Override
    public void constructieBai() {
        System.out.println("Am realizat un spatiu sanitar comun pentru fiecare etaj.");
    }
    @Override
    public void constructieEtaje() {
        System.out.println("Am construit 5 etaje.");
    }
}
