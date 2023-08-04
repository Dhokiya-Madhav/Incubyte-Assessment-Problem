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
}
