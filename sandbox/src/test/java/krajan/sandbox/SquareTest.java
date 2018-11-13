package krajan.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by adamk on 13.11.2018
 **/
public class SquareTest {

    @Test
    public void testArea(){
        Square s = new Square(5);
        Assert.assertEquals(s.areakw(), 25.0);
    }
}
