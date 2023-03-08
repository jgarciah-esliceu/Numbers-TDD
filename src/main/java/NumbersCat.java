public class NumbersCat {
    private static final String[] UNITATS = {"Zero", "Un", "Dos", "Tres", "Quatre", "Cinc", "Sis", "Set", "Vuit", "Nou"};
    private static final String[] DECENES = {"Deu", "Vint", "Trenta", "Quaranta", "Cinquanta", "Seixanta", "Setanta", "Vuitanta", "Noranta"};
    private static final String[] MENORSQUEVINT = {"Onze", "Dotze", "Tretze", "Catorze", "Quinze", "Setze", "Disset", "Divuit", "Dinou"};


    public static String say(long n) {

        if (n < 0) {
            return "Menys " + say(-n).toLowerCase();
        }

        if (n < 10) {
            return UNITATS[(int) n];
        }

        if (n < 20 && n != 10) {
            return MENORSQUEVINT[(int) n - 11];
        }

        if (n < 100) {
    º       int unitat = (int) n % 10;
            int desena = (int) n / 10;
            if (unitat == 0) {
                return  DECENES[desena - 1];
            }

        }



        return null;
    }


    private static String calculaNombre(long n, int divisor, String xifra, String xifres) {
        String nombre = "";
        int centena = (int) (n / divisor);
        int resto = (int) (n % divisor);
        String espai = " ";

        if (centena == 1) {
            nombre = xifra;
        } else {
            nombre = say(centena) + xifres;
        }
        if (resto != 0) {
            nombre += espai + say(resto).toLowerCase();
        }
        return nombre;
    }

}