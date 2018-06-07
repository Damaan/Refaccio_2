import java.util.Collection;
import java.util.Iterator;

public class Matricula {

    public long id = 0;
    private Estudiant estudiant;
    private Collection assignatures;
    private static final float PREU_CREDIT = 15;

    public Matricula() {
    }

    public Matricula(long id, String nom, String cognoms, String dni, Collection assignatures) {
        this.id = id;
        Estudiant x = new Estudiant(nom, cognoms, dni);
        this.estudiant = x;
        this.assignatures = assignatures;
    }

    public float costMatricula() {

        float cost = 0;
        int credits = 0;

        for (Iterator iter = assignatures.iterator(); iter.hasNext(); ) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.credits;
        }

        cost = credits * PREU_CREDIT;
        return cost;
    }

}