
package clean.code.design_patterns.requirements;

public class CaminPrivat extends Camin {
    @Override
    public void securitate() {
        System.out.println("angajam paza, montam sistem de interfon, camere video si bariera.");
    }

    @Override
    public void mobilier() {
        System.out.println("Mobilam: King Size Bed, dulap, birou, scaun ergonomic, masa cu 4 scaune, canapea, fotolii.");
    }

    @Override
    public void constructieCamere() {
        System.out.println("Am construit camere de 25 mp .");
    }

    @Override
    public void constructieBai() {
        System.out.println("Am instalat spatii sanitare in fiecare camera.");
    }

    @Override
    public void constructieEtaje() {
        System.out.println("Am construit 10 etaje si amplasam liftul.");
    }
}