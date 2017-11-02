import org.junit.Test;
import static org.junit.Assert.*;

public class RecursiveTest {
    @Test
    public void testPrintEveryOther() throws Exception {
       int[] pa = new int[]{15,42,33,26,94,11,13,75,51,44};
       int k = 3;
      // Recursive ra = new Recursive().printEveryOther(pa, k);
    }


    @Test

    public void testPrintStars() throws Exception {
        String s1 = new Recursive().printStars("q");
        String s2 = null;
        String s3 = new Recursive().printStars("Harry had 555 otters and apples");

        assertEquals(s2, null);
        assertEquals(s3, "Har*ry had 5*5*5 ot*ters and ap*ples");
        assertEquals(s1, "q");

    }
}