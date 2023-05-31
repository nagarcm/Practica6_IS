package ejercicio2;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class NotasTest {
    @Test
    void calculaNotaValid() {
        Notas n = new Notas();
        assertAll(
                () -> assertEquals(0,n.calculaNota('O',0,0,10,0),Double.MIN_VALUE),
                () -> assertEquals(4,n.calculaNota('O',10,10,0,4),Double.MIN_VALUE),
                () -> assertEquals(6,n.calculaNota('O',10,0,10,5),Double.MIN_VALUE),
                () -> assertEquals(3.95,n.calculaNota('I',0,0,10,3.95),Double.MIN_VALUE),
                () -> assertEquals(4.485,n.calculaNota('I',10,10,0,4.95),Double.MIN_VALUE),
                () -> assertEquals(8.5,n.calculaNota('I',10,0,10,10),Double.MIN_VALUE)
        );
    }
}