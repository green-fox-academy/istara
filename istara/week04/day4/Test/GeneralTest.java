import apples.Apples;
import sum.Sum;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GeneralTest {

    @Test
    public void getNameTest() {
        Apples apple = new Apples("Testname");
        assertEquals("Testname", apple.getName());
    }

    @Test
    public void sumMethodTest() {
        List<Integer> numberTest = new ArrayList(Arrays.asList(new Integer[]{5, 6, 7}));
        Sum sum1 = new Sum();
        assertEquals(18, sum1.sum(numberTest));
    }
}