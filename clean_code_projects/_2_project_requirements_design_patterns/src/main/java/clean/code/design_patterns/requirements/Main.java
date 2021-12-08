package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        //Template

        Camin P22 = new CaminRegie();
        P22.buildcamin();

        Camin Arca = new CaminPrivat();
        Arca.buildcamin();


        //Builder
        CameraCamin camera1 = new CameraCamin.UserBuilder("150mp/200ft",300 )
                .orientare("Nord-Est")
                .izolat(true)
                .anexa("Debara depozitare instrumente")
                .build();

        System.out.println(camera1);

        CameraCamin camera2 = new CameraCamin.UserBuilder("125mp/175ft", 250)
                .orientare("SUD")
                .anexa("Camera obscura - fotografie")
                .build();

        System.out.println(camera2);

        CameraCamin camera3 = new CameraCamin.UserBuilder("115mp/150ft", 150)
                .build();

        System.out.println(camera3);
    }
}
