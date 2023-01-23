import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

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
        assertEquals("Zero", NumbersCat.say(0l));
    }

    @Test
    public void donat_1_retorna_Un() {
        assertEquals("Un", NumbersCat.say(1l));
    }

    @Test
    public void donat_2_retorna_Dos(){
        assertEquals("Dos", NumbersCat.say(2l));
    }

    @Test
    public void donat_9_retorna_Nou(){
        assertEquals("Nou", NumbersCat.say(9l));
    }

    @Test
    public void donat_menys_5_retorna_Menys_cinc(){
        assertEquals("Menys cinc", NumbersCat.say(-5l));
    }

    @Test
    public void donat_30_retorna_Trenta(){
        assertEquals("Trenta", NumbersCat.say(30l));
    }

    @Test
    public void donat_31_retorna_Trenta_un(){
        assertEquals("Trenta-un", NumbersCat.say(31l));
    }

    @Test
    public void donat_41_retorna_Quaranta_un(){
        assertEquals("Quaranta-un", NumbersCat.say(41l));
    }

    @Test
    public void donat_99_retorna_Noranta_nou(){
        assertEquals("Noranta-nou", NumbersCat.say(99l));
    }

    @Test
    public void donat_20_retorna_Vint(){
        assertEquals("Vint", NumbersCat.say(20l));
    }
    @Test
    public void donat_21_retorna_Vint_i_un(){
        assertEquals("Vint-i-un", NumbersCat.say(21l));
    }

    @Test
    public void donat_100_retorna_Cent(){
        assertEquals("Cent", NumbersCat.say(100l));
    }

    @Test
    public void donat_999_retorna_Nou_cents_noranta_nou(){
        assertEquals("Nou-cents noranta-nou", NumbersCat.say(999l));
    }

    @Test
    public void donat_1000_retorna_Mil(){
        assertEquals("Mil", NumbersCat.say(1000l));
    }

    @Test
    public void donat_1057_retorna_Mil_cinquanta_set(){
        assertEquals("Mil cinquanta-set", NumbersCat.say(1057l));
    }
}
