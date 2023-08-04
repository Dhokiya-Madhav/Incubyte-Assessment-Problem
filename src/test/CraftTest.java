package test;

import static org.junit.Assert.assertNotNull;
import org.junit.*;
import code.Chandrayaan;

public class CraftTest {
    private Chandrayaan craft;

    @Before
    public void Layout(){
        craft = new Chandrayaan(0,0,0,'n');
    }

    @Test
    public void isCraftInitialized(){
        assertNotNull(craft);
    }

    @Test
    public void testCraftForwardBackwardOnAxisY(){
        craft.movespacecraft('f');
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(1, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);

        craft.movespacecraft('b');
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);
    }
    
}
