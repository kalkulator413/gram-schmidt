import gramSchmidt.Basis;
import gramSchmidt.GramSchmidt;
import gramSchmidt.Vector;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class Main {

    @Test
    public void test() {
        Vector v1 = new Vector(1, 0, 0, 0);
        Vector v2 = new Vector(1, 1, 0, 0);
        Vector v3 = new Vector(1, 0, 3, 4);
        Basis U = GramSchmidt.gramSchmidt(v1, v2, v3);

        Set<Vector> T = new HashSet<>();
        for (Vector v : U) {
            T.add(v);
        }

        Vector u1 = new Vector(1, 0, 0, 0);
        Vector u2 = new Vector(0, 1, 0, 0);
        Vector u3 = new Vector(0, 0, 0.6, 0.8);
        Set<Vector> T2 = new HashSet<>();
        T2.add(u1);
        T2.add(u2);
        T2.add(u3);

        assertEquals(T, T2);
    }

}