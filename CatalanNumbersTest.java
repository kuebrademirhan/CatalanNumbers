import org.junit.Test;

import static org.junit.Assert.*;

public class CatalanNumbersTest {

    @Test
    public void cn() {
        long result=CatalanNumbers.cn(10);
        assertEquals(16796,result);
    }
}