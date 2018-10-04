import java.util.Random;

public class Terning {

    private Random random = new Random();

    private int sideantal = 6;

    private int slag=0;

    private boolean aktiv = true;

    // vores default konstruktør der kalder når vi skriver Terning terning = new Terning();
    // laver en terning med 6 sider.
    public Terning() {
        this.sideantal = 6;
    }

    // her overloader vi konstruktøren så kan kan lave terninger med et
    // vilkårligt antal sider som f.eks. Terninger terninger = new Terninger(997);
    public Terning(int sideantal) {
        this.sideantal = sideantal;
    }




    // fordi variablen eller feldtet er erklæret privat kan vi ikke tilgår det
    // direkte, men må gå via en getter som er erklæret public.
    public int getSlag() {
        return slag;
    }


    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public boolean isAktiv() {
        return aktiv;
    }



    public void kastTerning() {

        slag = random.nextInt(sideantal)+1;

    }



    public String tegnTerning() {


        if(aktiv == true) {

            switch (slag) {

                case 1:
                    return "************\n" +
                            "*          *\n" +
                            "*          *\n" +
                            "*     *    *\n" +
                            "*          *\n" +
                            "*          *\n" +
                            "************\n";
                case 2:

                    return "************\n" +
                            "*     *    *\n" +
                            "*          *\n" +
                            "*          *\n" +
                            "*          *\n" +
                            "*     *    *\n" +
                            "************\n";
                case 3:

                    return "************\n" +
                            "*     *    *\n" +
                            "*          *\n" +
                            "*     *    *\n" +
                            "*          *\n" +
                            "*     *    *\n" +
                            "************\n";

                case 4:

                    return "************\n" +
                            "* *      * *\n" +
                            "*          *\n" +
                            "*          *\n" +
                            "*          *\n" +
                            "* *      * *\n" +
                            "************\n";

                case 5:

                    return "************\n" +
                            "* *      * *\n" +
                            "*          *\n" +
                            "*     *    *\n" +
                            "*          *\n" +
                            "* *      * *\n" +
                            "************\n";

                case 6:

                    return "************\n" +
                            "* *      * *\n" +
                            "*          *\n" +
                            "* *      * *\n" +
                            "*          *\n" +
                            "* *      * *\n" +
                            "************\n";


                default:
                    return "Terningen kan ikke tegnes";


            }
        }

        return "";



    }
}

