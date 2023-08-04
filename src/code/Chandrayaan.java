package code;

public class Chandrayaan {
    // Fields to store the spacecraft's current position and direction.
    public int x, y, z;
    public char direction;

    // Constructor to initialize the spacecraft's initial position and direction.
    public Chandrayaan(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    // Method to move the spacecraft forward or backward in the current direction.
    public void moveSpaceCraft(char move) {
        switch (direction) {
            case 'u':
                if (move == 'f')
                    z++; // Move forward in the up direction.
                else if (move == 'b')
                    z--; // Move backward in the up direction.
                break;
            case 'd':
                if (move == 'f')
                    z++; // Move forward in the down direction.
                else if (move == 'b')
                    z--; // Move backward in the down direction.
                break;
            case 'n':
                if (move == 'f')
                    y++; // Move forward in the north direction.
                else if (move == 'b')
                    y--; // Move backward in the north direction.
                break;
            case 's':
                if (move == 'f')
                    y++; // Move forward in the south direction.
                else if (move == 'b')
                    y--; // Move backward in the south direction.
                break;
            case 'e':
                if (move == 'f')
                    x++; // Move forward in the east direction.
                else if (move == 'b')
                    x--; // Move backward in the east direction.
                break;
            case 'w':
                if (move == 'f')
                    x++; // Move forward in the west direction.
                else if (move == 'b')
                    x--; // Move backward in the west direction.
                break;
        }
    }

    // Method to turn the spacecraft left based on the current direction.
    public char turnLeft(char currentDirection) {
        switch (currentDirection) {
            case 'n':
                direction = 'w'; // Turn left from north, face west.
                break;
            case 'w':
                direction = 's'; // Turn left from west, face south.
                break;
            case 's':
                direction = 'e'; // Turn left from south, face east.
                break;
            case 'e':
                direction = 'n'; // Turn left from east, face north.
                break;
            case 'u':
            case 'd':
                direction = 'w'; // Turn left from up or down, face west.
                break;
        }
        return direction;
    }

    // Method to turn the spacecraft right based on the current direction.
    public char turnRight(char currentDirection) {
        switch (currentDirection) {
            case 'n':
                direction = 'e'; // Turn right from north, face east.
                break;
            case 'e':
                direction = 's'; // Turn right from east, face south.
                break;
            case 's':
                direction = 'w'; // Turn right from south, face west.
                break;
            case 'w':
                direction = 'n'; // Turn right from west, face north.
                break;
            case 'u':
            case 'd':
                direction = 'e'; // Turn right from up or down, face east.
                break;
        }
        return direction;
    }

    // Method to control the spacecraft using a sequence of commands.
    public void craftController(char[] commands) {
        for (int i = 0; i < commands.length; i++) {
            char command = commands[i];
            switch (command) {
                case 'l':
                    direction = turnLeft(direction); // Turn left.
                    break;
                case 'r':
                    direction = turnRight(direction); // Turn right.
                    break;
                case 'u':
                case 'd':
                    direction = command; // Move up or down.
                    break;
                case 'f':
                case 'b':
                    moveSpaceCraft(command); // Move forward or backward.
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
        // Display the final position and direction of the spacecraft after executing the commands.
        displayPosition();
    }

    // Method to display the final position and direction of the spacecraft.
    public void displayPosition() {
        System.out.println("Final position: ");
        System.out.print(x + " " + y + " " + z + "\t");
        System.out.println("Final direction: ");
        System.out.println(direction);
    }
}
