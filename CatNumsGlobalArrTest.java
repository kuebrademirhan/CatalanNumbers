import org.junit.Test;

import static org.junit.Assert.*;

public class CatNumsGlobalArrTest {

    @Test
    public void cnmem() {
        long result=CatNumsGlobalArr.cnmem(10) ;
        assertEquals(16796,result);


    }
}