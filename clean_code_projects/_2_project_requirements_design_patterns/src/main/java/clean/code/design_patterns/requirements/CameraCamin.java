
package clean.code.design_patterns.requirements;

public class CameraCamin
{
    //All final attributes
    private final String suprafata; // required
    private final int pret ; // required
    private final String orientare; // optional
    private final boolean izolat; // optional
    private final String anexa; // optional

    private CameraCamin(UserBuilder builder) {
        this.suprafata = builder.suprafata;
        this.orientare = builder.orientare;
        this.pret = builder.pret;
        this.izolat = builder.izolat;
        this.anexa = builder.anexa;
    }

    //All getter, and NO setter to provde immutability
    public String  getSuprafata() {
        return suprafata;
    }
    public String  getOrientare() {
        return orientare;
    }
    public int     getPret()      {
        return pret;
    }
    public boolean getIzolat() { return izolat; }
    public String  getAnexa() {
        return anexa;
    }

    @Override
    public String toString() {
        return "Detalii camera: "
                + "Suprafata:"+this.suprafata+", "
                + "Orientare:"+this.orientare+", "
                + "Chiria pe luna:"+this.pret+", "
                + "Izolatie fonica:"+this.izolat+", "
                + "Anexa:"+this.anexa;
    }

    public static class UserBuilder
    {
        private final String suprafata;
        private final int pret;
        private String orientare;
        private boolean izolat;
        private String anexa;

        public UserBuilder(String suprafata,int pret ) {
            this.suprafata = suprafata;
            this.pret = pret;
        }
        public UserBuilder orientare(String orientare) {
            this.orientare = orientare;
            return this;
        }
        public UserBuilder izolat(boolean izolat) {
            this.izolat = izolat;
            return this;
        }
        public UserBuilder anexa(String anexa) {
            this.anexa = anexa;
            return this;
        }
        //Return the finally consrcuted User object
        public CameraCamin build() {
            CameraCamin user =  new CameraCamin(this);
            validateUserObject(user);
            return user;
        }
        private void validateUserObject(CameraCamin c) {
            boolean b = c.getPret() < 400;
            //if user object does not break any assumption of system
        }
    }
}