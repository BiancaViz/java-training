
package clean.code.design_patterns.requirements;

public abstract class Camin {
    /**
     * This is the template method we are discussing. This method should be
     * final so that other class can't re-implement and change the order of the
     * steps.
     */
    public final void buildcamin() {
        constructie1();
        constructie2();
        constructieEtaje();
        constructieBai();
        constructieCamere();
        mobilier();
        securitate();
        System.out.println("-----Camin gata de folosire-----");
    }

    public abstract void securitate();

    public abstract void mobilier();

    public abstract void constructieCamere();

    public abstract void constructieBai();

    public abstract void constructieEtaje();

    //final pentru ca toate caminele incep la fel
    private final void constructie1() {
        System.out.println("Obtinem toate aprobarile pentru planul de constructie");
    }


    private final void constructie2() {
        System.out.println("Construim fundatia");
    }
}
