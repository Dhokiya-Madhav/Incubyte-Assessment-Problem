package test;

import org.junit.Assert;
import org.junit.Test;

import code.Chandrayaan;
public class CraftTest {
    @Test
    public void check(){
        Chandrayaan c = new Chandrayaan(0,0,0,'n');
        Assert.assertEquals("Hi", c.showMsg());   
    }
}
