import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistroTest {
    @Test
    void deveContarGatosVivosClinica() {
        Clinica clinica = new Clinica(
                new Gato("Baldur", true),
                new Gato("Osíris", true),
                new Gato("Herminone", false),
                new Gato("Salém", true)
        );
        assertEquals(3, Registro.contarGatosVivosClinica(clinica));
    }

    @Test
    void deveContarTotalGatosClinica() {
        Clinica clinica = new Clinica(
                new Gato("Baldur", true),
                new Gato("Osíris", true),
                new Gato("Herminone", false),
                new Gato("Salém", true)
        );
        assertEquals(4, Registro.contarTotalGatosClinica(clinica));
    }
}
