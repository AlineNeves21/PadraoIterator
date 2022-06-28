import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Clinica implements Iterable<Gato>{

    private List<Gato> gatos = new ArrayList<Gato>();

    public Clinica(Gato... gatos) {
        this.gatos = Arrays.asList(gatos);
    }

    @Override
    public Iterator<Gato> iterator() {
        return gatos.iterator();
    }
}
