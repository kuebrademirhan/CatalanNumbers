import org.junit.Assert;

import static org.junit.Assert.*;

public class CatalanNumNaiveMemoisationTest {

    @org.junit.Test(timeout = 1000)
    public void cnNaiveMem() {

        long result=CatalanNumNaiveMemoisation.cnNaiveMem(10);
        assertEquals(16796,result);


    }

}