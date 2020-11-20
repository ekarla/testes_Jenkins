import org.junit.Test;
import static org.junit.Assert.*;

public class CalculaTest extends Calcula {

    @Test
    public void testFat() {

        assertEquals(120, Calcula.fat(5));
    }
}