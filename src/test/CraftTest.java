package test;

import static org.junit.Assert.assertNotNull;
import org.junit.*;
import code.Chandrayaan;

public class CraftTest {
    private Chandrayaan craft;

    @Test
    public void testCraftInitialization() {
        craft = new Chandrayaan(0, 0, 0, 'n');
        assertNotNull(craft);
    }

    @Test
    public void testCraftForwardOnAxisY() {
        craft = new Chandrayaan(0, 0, 0, 'n');
        craft.moveSpaceCraft('f');
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(1, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);
    }

    @Test
    public void testCraftBackwardOnAxisY() {
        craft = new Chandrayaan(0, 0, 0, 'n');
        craft.moveSpaceCraft('b');
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(-1, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);
    }

    @Test
    public void testCraftForwardOnAxisX() {
        craft = new Chandrayaan(0, 0, 0, 'e');
        craft.moveSpaceCraft('f');
        Assert.assertEquals(1, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    @Test
    public void testCraftBackwardOnAxisX() {
        craft = new Chandrayaan(0, 0, 0, 'e');
        craft.moveSpaceCraft('b');
        Assert.assertEquals(-1, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    @Test
    public void testCraftForwardOnAxisZ() {
        craft = new Chandrayaan(0, 0, 0, 'u');
        craft.moveSpaceCraft('f');
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(1, craft.z);
        Assert.assertEquals('u', craft.direction);
    }

    @Test
    public void testCraftBackwardOnAxisZ() {
        craft = new Chandrayaan(0, 0, 0, 'u');
        craft.moveSpaceCraft('b');
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(-1, craft.z);
        Assert.assertEquals('u', craft.direction);
    }

    @Test
    public void testRotateLeftFromDirectionN() {
        craft = new Chandrayaan(0, 0, 0, 'n');
        craft.turnLeft(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    @Test
    public void testRotateLeftFromDirectionW() {
        craft = new Chandrayaan(0, 0, 0, 'w');
        craft.turnLeft(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('s', craft.direction);
    }

    @Test
    public void testRotateLeftFromDirectionS() {
        craft = new Chandrayaan(0, 0, 0, 's');
        craft.turnLeft(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    @Test
    public void testRotateLeftFromDirectionE() {
        craft = new Chandrayaan(0, 0, 0, 'e');
        craft.turnLeft(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);
    }

    @Test
    public void testRotateLeftFromDirectionUp() {
        craft = new Chandrayaan(0, 0, 0, 'u');
        craft.turnLeft(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    @Test
    public void testRotateLeftFromDirectionDown() {
        craft = new Chandrayaan(0, 0, 0, 'd');
        craft.turnLeft(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    @Test
    public void testRotateRightFromDirectionN() {
        craft = new Chandrayaan(0, 0, 0, 'n');
        craft.turnRight(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    @Test
    public void testRotateRightFromDirectionE() {
        craft = new Chandrayaan(0, 0, 0, 'e');
        craft.turnRight(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('s', craft.direction);
    }

    @Test
    public void testRotateRightFromDirectionS() {
        craft = new Chandrayaan(0, 0, 0, 's');
        craft.turnRight(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    @Test
    public void testRotateRightFromDirectionW() {
        craft = new Chandrayaan(0, 0, 0, 'w');
        craft.turnRight(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);
    }

    @Test
    public void testRotateRightFromDirectionUp() {
        craft = new Chandrayaan(0, 0, 0, 'u');
        craft.turnRight(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    @Test
    public void testRotateRightFromDirectionDown() {
        craft = new Chandrayaan(0, 0, 0, 'd');
        craft.turnRight(craft.direction);
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    @Test
    public void testCraftControllingTest1() {
        craft = new Chandrayaan(0, 0, 0, 'n');
        char[] commands = { 'f', 'r', 'u', 'b', 'l' };
        craft.craftController(commands);

        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(1, craft.y);
        Assert.assertEquals(-1, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    @Test
    public void testCraftControllingTest2() {
        craft = new Chandrayaan(0, 0, 0, 's');
        char[] commands = {'l','r','r','l','f','f','f','b'};
        craft.craftController(commands);

        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(2, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('s', craft.direction);
    }

    @Test
    public void testCraftControllingTest3() {
        craft = new Chandrayaan(0, 0, 0, 'e');
        char[] commands = {'l','l','f','b','r','r','u','l'};
        craft.craftController(commands);

        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }
}