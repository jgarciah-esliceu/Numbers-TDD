public class NumbersCat {
    private static final String[] UNITATS = {"Zero", "Un", "Dos", "Tres", "Quatre", "Cinc", "Sis", "Set", "Vuit", "Nou"};
    private static final String[] DECENES = {"Deu", "Vint", "Trenta", "Quaranta", "Cinquanta", "Seixanta", "Setanta", "Vuitanta", "Noranta"};
    private static final String[] MENORSQUEVINT = {"Onze", "Dotze", "Tretze", "Catorze", "Quinze", "Setze", "Disset", "Divuit", "Dinou"};


    public static String say(long n) {

        if (n < 0) {
            return "Menys " + say(-n).toLowerCase();
        }

        int unitat = 0;
        int decena = 0;
        int divisor = 0;
        String xifra = "";
        String xifres = "";

        if (n > 20 && n < 100) {
            unitat = (int) n % 10;
            decena = 10 * ((int) n / 10);
            if (n < 30) {
                return say(decena) + "-i-" + say(unitat).toLowerCase();
            }
            return say(decena) + "-" + say(unitat).toLowerCase();
        }

        if (n >= 100 && n < 1000) {
            divisor = 100;
            xifra = "Cent";
            xifres = "-cents";
            String nombre = calculaNombre(n, divisor, xifra, xifres);
            return nombre;
        }
        if (n >= 1000 && n < 1000000) {
            divisor = 1000;
            xifra = "Mil";
            xifres = " mil";
            String nombre = calculaNombre(n, divisor, xifra, xifres);
            return nombre;
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
