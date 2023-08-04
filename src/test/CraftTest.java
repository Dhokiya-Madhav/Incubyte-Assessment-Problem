package test;

import static org.junit.Assert.assertNotNull;
import org.junit.*;
import code.Chandrayaan;

public class CraftTest {
    private Chandrayaan craft;

    @Test
    public void testCraftInitialization() {
        // Create a new Chandrayaan object with the specified parameters: 0, 0, 0, and
        // 'n'.
        craft = new Chandrayaan(0, 0, 0, 'n');

        // Assert that the craft object is not null.
        // If the constructor of Chandrayaan initializes the object correctly,
        // the craft object should not be null, and this assertion will pass.
        assertNotNull(craft);
    }

    // This is a unit test for the Chandrayaan class, which tests the forward
    // movement of the spacecraft along the Y-axis.
    @Test
    public void testCraftForwardOnAxisY() {
        // Create a new Chandrayaan object with the specified parameters: 0, 0, 0, and
        // 'n'.
        craft = new Chandrayaan(0, 0, 0, 'n');

        // Move the spacecraft forward along the Y-axis.
        // The 'moveSpaceCraft' method is expected to update the position and direction
        // of the spacecraft accordingly.
        craft.moveSpaceCraft('f');

        // Assert that the new position and direction of the spacecraft are as expected
        // after the forward movement.
        // The expected position after the forward movement is (0, 1, 0), and the
        // direction should remain 'n'.
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(1, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);
    }

    // This is a unit test for the Chandrayaan class, which tests the backward
    // movement of the spacecraft along the Y-axis.
    @Test
    public void testCraftBackwardOnAxisY() {
        // Create a new Chandrayaan object with the specified parameters: 0, 0, 0, and
        // 'n'.
        craft = new Chandrayaan(0, 0, 0, 'n');

        // Move the spacecraft backward along the Y-axis.
        // The 'moveSpaceCraft' method is expected to update the position and direction
        // of the spacecraft accordingly.
        craft.moveSpaceCraft('b');

        // Assert that the new position and direction of the spacecraft are as expected
        // after the backward movement.
        // The expected position after the backward movement is (0, -1, 0), and the
        // direction should remain 'n'.
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(-1, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);
    }

    // Test case for moving the spacecraft forward along the X-axis when facing east
    // ('e').
    @Test
    public void testCraftForwardOnAxisX() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing east ('e').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'e');

        // Move the spacecraft forward along the X-axis.
        // The 'moveSpaceCraft' method is expected to update the position and direction
        // of the spacecraft accordingly.
        craft.moveSpaceCraft('f');

        // Assert that the new position and direction of the spacecraft are as expected
        // after the forward movement.
        // The expected position after the forward movement is (1, 0, 0), and the
        // direction should remain 'e'.
        Assert.assertEquals(1, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    // Test case for moving the spacecraft backward along the X-axis when facing
    // east ('e').
    @Test
    public void testCraftBackwardOnAxisX() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing east ('e').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'e');

        // Move the spacecraft backward along the X-axis.
        // The 'moveSpaceCraft' method is expected to update the position and direction
        // of the spacecraft accordingly.
        craft.moveSpaceCraft('b');

        // Assert that the new position and direction of the spacecraft are as expected
        // after the backward movement.
        // The expected position after the backward movement is (-1, 0, 0), and the
        // direction should remain 'e'.
        Assert.assertEquals(-1, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    // Test case for moving the spacecraft forward along the Z-axis when facing up
    // ('u').
    @Test
    public void testCraftForwardOnAxisZ() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing up ('u').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'u');

        // Move the spacecraft forward along the Z-axis.
        // The 'moveSpaceCraft' method is expected to update the position and direction
        // of the spacecraft accordingly.
        craft.moveSpaceCraft('f');

        // Assert that the new position and direction of the spacecraft are as expected
        // after the forward movement.
        // The expected position after the forward movement is (0, 0, 1), and the
        // direction should remain 'u'.
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(1, craft.z);
        Assert.assertEquals('u', craft.direction);
    }

    // Test case for moving the spacecraft backward along the Z-axis when facing up
    // ('u').
    @Test
    public void testCraftBackwardOnAxisZ() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing up ('u').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'u');

        // Move the spacecraft backward along the Z-axis.
        // The 'moveSpaceCraft' method is expected to update the position and direction
        // of the spacecraft accordingly.
        craft.moveSpaceCraft('b');

        // Assert that the new position and direction of the spacecraft are as expected
        // after the backward movement.
        // The expected position after the backward movement is (0, 0, -1), and the
        // direction should remain 'u'.
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(-1, craft.z);
        Assert.assertEquals('u', craft.direction);
    }

    // Test case for rotating the spacecraft left from the north direction ('n').
    @Test
    public void testRotateLeftFromDirectionN() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing north ('n').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'n');

        // Rotate the spacecraft left from the north direction ('n').
        // The 'turnLeft' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnLeft(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the left
        // rotation.
        // The expected direction after the left rotation is west ('w').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    // Test case for rotating the spacecraft left from the west direction ('w').
    @Test
    public void testRotateLeftFromDirectionW() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing west ('w').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'w');

        // Rotate the spacecraft left from the west direction ('w').
        // The 'turnLeft' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnLeft(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the left
        // rotation.
        // The expected direction after the left rotation is south ('s').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('s', craft.direction);
    }

    // Test case for rotating the spacecraft left from the south direction ('s').
    @Test
    public void testRotateLeftFromDirectionS() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing south ('s').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 's');

        // Rotate the spacecraft left from the south direction ('s').
        // The 'turnLeft' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnLeft(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the left
        // rotation.
        // The expected direction after the left rotation is east ('e').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    // Test case for rotating the spacecraft left from the east direction ('e').
    @Test
    public void testRotateLeftFromDirectionE() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing east ('e').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'e');

        // Rotate the spacecraft left from the east direction ('e').
        // The 'turnLeft' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnLeft(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the left
        // rotation.
        // The expected direction after the left rotation is north ('n').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);
    }

    // Test case for rotating the spacecraft left from the upward direction ('u').
    @Test
    public void testRotateLeftFromDirectionUp() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing upward ('u').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'u');

        // Rotate the spacecraft left from the upward direction ('u').
        // The 'turnLeft' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnLeft(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the left
        // rotation.
        // The expected direction after the left rotation is west ('w').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    // Test case for rotating the spacecraft left from the downward direction ('d').
    @Test
    public void testRotateLeftFromDirectionDown() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing downward ('d').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'd');

        // Rotate the spacecraft left from the downward direction ('d').
        // The 'turnLeft' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnLeft(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the left
        // rotation.
        // The expected direction after the left rotation is west ('w').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    // Test case for rotating the spacecraft right from the north direction ('n').
    @Test
    public void testRotateRightFromDirectionN() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing north ('n').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'n');

        // Rotate the spacecraft right from the north direction ('n').
        // The 'turnRight' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnRight(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the
        // right rotation.
        // The expected direction after the right rotation is east ('e').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    // Test case for rotating the spacecraft right from the east direction ('e').
    @Test
    public void testRotateRightFromDirectionE() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing east ('e').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'e');

        // Rotate the spacecraft right from the east direction ('e').
        // The 'turnRight' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnRight(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the
        // right rotation.
        // The expected direction after the right rotation is south ('s').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('s', craft.direction);
    }

    // Test case for rotating the spacecraft right from the south direction ('s').
    @Test
    public void testRotateRightFromDirectionS() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing south ('s').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 's');

        // Rotate the spacecraft right from the south direction ('s').
        // The 'turnRight' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnRight(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the
        // right rotation.
        // The expected direction after the right rotation is west ('w').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    // Test case for rotating the spacecraft right from the west direction ('w').
    @Test
    public void testRotateRightFromDirectionW() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing west ('w').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'w');

        // Rotate the spacecraft right from the west direction ('w').
        // The 'turnRight' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnRight(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the
        // right rotation.
        // The expected direction after the right rotation is north ('n').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('n', craft.direction);
    }

    // Test case for rotating the spacecraft right from the upward direction ('u').
    @Test
    public void testRotateRightFromDirectionUp() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing upward ('u').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'u');

        // Rotate the spacecraft right from the upward direction ('u').
        // The 'turnRight' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnRight(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the
        // right rotation.
        // The expected direction after the right rotation is east ('e').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    // Test case for rotating the spacecraft right from the downward direction
    // ('d').
    @Test
    public void testRotateRightFromDirectionDown() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing downward ('d').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'd');

        // Rotate the spacecraft right from the downward direction ('d').
        // The 'turnRight' method is expected to update the direction of the spacecraft
        // accordingly.
        craft.turnRight(craft.direction);

        // Assert that the new direction of the spacecraft is as expected after the
        // right rotation.
        // The expected direction after the right rotation is east ('e').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('e', craft.direction);
    }

    // Test case for controlling the spacecraft using a sequence of commands.
    @Test
    public void testCraftControllingTest1() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing north ('n').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'n');

        // Define an array of commands for controlling the spacecraft.
        char[] commands = { 'f', 'r', 'u', 'b', 'l' };

        // Control the spacecraft using the sequence of commands.
        // The 'craftController' method is expected to process the commands and update
        // the spacecraft's position and direction accordingly.
        craft.craftController(commands);

        // Assert that the final position and direction of the spacecraft are as
        // expected after executing the commands.
        // The expected final position is (0, 1, -1), and the expected direction after
        // the sequence of commands is west ('w').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(1, craft.y);
        Assert.assertEquals(-1, craft.z);
        Assert.assertEquals('w', craft.direction);
    }

    // Test case for controlling the spacecraft using a sequence of commands.
    @Test
    public void testCraftControllingTest2() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing south ('s').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 's');

        // Define an array of commands for controlling the spacecraft.
        char[] commands = { 'l', 'r', 'r', 'l', 'f', 'f', 'f', 'b' };

        // Control the spacecraft using the sequence of commands.
        // The 'craftController' method is expected to process the commands and update
        // the spacecraft's position and direction accordingly.
        craft.craftController(commands);

        // Assert that the final position and direction of the spacecraft are as
        // expected after executing the commands.
        // The expected final position is (0, 2, 0), and the expected direction after
        // the sequence of commands is south ('s').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(2, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('s', craft.direction);
    }

    // Test case for controlling the spacecraft using a sequence of commands.
    @Test
    public void testCraftControllingTest3() {
        // Create a new Chandrayaan object with the initial position at coordinates (0,
        // 0, 0) and facing east ('e').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, 'e');

        // Define an array of commands for controlling the spacecraft.
        char[] commands = { 'l', 'l', 'f', 'b', 'r', 'r', 'u', 'l' };

        // Control the spacecraft using the sequence of commands.
        // The 'craftController' method is expected to process the commands and update
        // the spacecraft's position and direction accordingly.
        craft.craftController(commands);

        // Assert that the final position and direction of the spacecraft are as
        // expected after executing the commands.
        // The expected final position is (0, 0, 0), and the expected direction after
        // the sequence of commands is west ('w').
        Assert.assertEquals(0, craft.x);
        Assert.assertEquals(0, craft.y);
        Assert.assertEquals(0, craft.z);
        Assert.assertEquals('w', craft.direction);
    }
}