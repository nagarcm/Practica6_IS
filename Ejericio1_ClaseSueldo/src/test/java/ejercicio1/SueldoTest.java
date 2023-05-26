package ejercicio1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class SueldoTest {

    @Test
    void calculaBrutoValid() {
        Sueldo s = new Sueldo();
        assertAll(
                () -> assertEquals(1000, s.calculaBruto('F',0) ),
                () -> assertEquals(600.2, s.calculaBruto('E',3001)),
                () -> assertEquals(1250, s.calculaBruto('F',5000) ),
                () -> assertEquals(1250.25, s.calculaBruto('E',5001) )
        );
    }
    @Test
    void calculaBrutoInvalid() {
        Sueldo s = new Sueldo();
        assertAll(
                () -> assertEquals(1000, s.calculaBruto('S',2999) ),
                () -> assertEquals(602, s.calculaBruto('F',-1) )//,
                //() -> assertEquals(1250.25, s.calculaBruto('E',"Si") )
        );
    }

    @Test
    void calculaRetValid() {
        Sueldo s = new Sueldo();
        assertAll(
                () -> assertEquals(120, s.calculaRet('F',1200)),
                () -> assertEquals(180.15, s.calculaRet('F',1201), 0.00000000001 ),
                () -> assertEquals(60.05, s.calculaRet('E',1201), 0.00000000001 )

        );
    }
    @Test
    void calculaRetInvalid() {
        Sueldo s = new Sueldo();
        assertAll(
                () -> assertEquals(1000, s.calculaBruto('F',0) ),
                () -> assertEquals(600.2, s.calculaBruto('E',3001)),
                () -> assertEquals(1250, s.calculaBruto('F',5000) ),
                () -> assertEquals(1250.25, s.calculaBruto('E',5001) )
        );
    }
}