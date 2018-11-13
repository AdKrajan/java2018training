package krajan.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by adamk on 13.11.2018
 **/
public class RectangleTest {

    @Test
    public void testArea(){
        Rectangle r = new Rectangle(10, 20);
        Assert.assertEquals(r.areapr(), 200.0); // kom
    }
}
