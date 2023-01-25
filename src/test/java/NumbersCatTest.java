import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersCatTest {
    /*
    1. Zero
    2. Unitats
    3. Negatius
    4. Decenes
        4.1 30 - 99
        4.2 20 - 29
        4.3 10 - 19
     */

    @Test
    public void donat_0_retorna_Zero() {
        Assertions.assertEquals("Zero", NumbersCat.say(0l));
    }

    @Test
    public void donat_1_retorna_Un() {
        Assertions.assertEquals("Un", NumbersCat.say(1l));
    }

    @Test
    public void donat_2_retorna_Dos(){
        Assertions.assertEquals("Dos", NumbersCat.say(2l));
    }

    @Test
    public void donat_9_retorna_Nou(){
        Assertions.assertEquals("Nou", NumbersCat.say(9l));
    }

    @Test
    public void donat_menys_5_retorna_Menys_cinc(){
        Assertions.assertEquals("Menys cinc", NumbersCat.say(-5l));
    }

    @Test
    public void donat_30_retorna_Trenta(){
        Assertions.assertEquals("Trenta", NumbersCat.say(30l));
    }

    @Test
    public void donat_31_retorna_Trenta_un(){
        Assertions.assertEquals("Trenta-un", NumbersCat.say(31l));
    }

    @Test
    public void donat_41_retorna_Quaranta_un(){
        Assertions.assertEquals("Quaranta-un", NumbersCat.say(41l));
    }

    @Test
    public void donat_99_retorna_Noranta_nou(){
        Assertions.assertEquals("Noranta-nou", NumbersCat.say(99l));
    }

    @Test
    public void donat_20_retorna_Vint(){
        Assertions.assertEquals("Vint", NumbersCat.say(20l));
    }
    @Test
    public void donat_21_retorna_Vint_i_un(){
        Assertions.assertEquals("Vint-i-un", NumbersCat.say(21l));
    }

    @Test
    public void donat_100_retorna_Cent(){
        Assertions.assertEquals("Cent", NumbersCat.say(100l));
    }

    @Test
    public void donat_999_retorna_Nou_cents_noranta_nou(){
        Assertions.assertEquals("Nou-cents noranta-nou", NumbersCat.say(999l));
    }

    @Test
    public void donat_1000_retorna_Mil(){
        Assertions.assertEquals("Mil", NumbersCat.say(1000l));
    }

    @Test
    public void donat_1057_retorna_Mil_cinquanta_set(){
        Assertions.assertEquals("Mil cinquanta-set", NumbersCat.say(1057l));
    }

    @Test
    public void donat_9999(){
        Assertions.assertEquals("Nou mil nou-cents noranta-nou", NumbersCat.say(9999l));
    }

    @Test
    public void donat_10000(){
        Assertions.assertEquals("Deu mil", NumbersCat.say(10000l));
    }

    @Test
    public void donat_10001(){
        Assertions.assertEquals("Deu mil un", NumbersCat.say(10001l));
    }

    @Test
    public void donat_99999(){
        Assertions.assertEquals("Noranta-nou mil nou-cents noranta-nou", NumbersCat.say(99999l));
    }

    @Test
    public void donat_100000(){
        Assertions.assertEquals("Cent mil", NumbersCat.say(100000l));
    }

    @Test
    public void donat_999999(){
        Assertions.assertEquals("Nou-cents noranta-nou mil nou-cents noranta-nou", NumbersCat.say(999999l));
    }

    @Test
    public void donat_1_000_000(){
        Assertions.assertEquals("Un milió", NumbersCat.say(1_000_000l));
    }
}
