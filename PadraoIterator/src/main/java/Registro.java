import java.util.Iterator;

public class Registro {

    public static Integer contarGatosVivosClinica(Clinica clinica) {
        int quantidade = 0;
        for (Gato gato : clinica) {
            if (gato.isVivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalGatosClinica(Clinica clinica) {
        int quantidade = 0;
        for (Iterator a = clinica.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
