import org.junit.Test;
import static org.junit.Assert.*;

public class CalculaTest extends Calcula {

    @Test
    public void testFat() {

        assertEquals(129, Calcula.fat(5));
    }
}