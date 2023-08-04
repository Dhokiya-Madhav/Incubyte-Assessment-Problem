package code;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Chandrayaan {
    public int x,y, z;
    public char direction;

    public Chandrayaan(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void moveSpaceCraft(char move) {
        switch (direction) {
            case 'u':
                if (move == 'f')
                    z++;
                else if (move == 'b')
                    z--;
                break;
            case 'd':
                if (move == 'f')
                    z++;
                else if (move == 'b')
                    z--;
                break;
            case 'n':
                if (move == 'f')
                    y++;
                else if (move == 'b')
                    y--;
                break;
            case 's':
                if (move == 'f')
                    y++;
                else if (move == 'b')
                    y--;
                break;
            case 'e':
                if (move == 'f')
                    x++;
                else if (move == 'b')
                    x--;
                break;
            case 'w':
                if (move == 'f')
                    x++;
                else if (move == 'b')
                    x--;
                break;
        }
    }

    public char turnLeft(char currentDirection) {
        switch (currentDirection) {
            case 'n':
                direction = 'w';
                break;
            case 'w':
                direction = 's';
                break;
            case 's':
                direction = 'e';
                break;
            case 'e':
                direction = 'n';
                break;
            case 'u':
            case 'd':
                direction = 'w';
                break;
        }
        return direction;
    }

    public char turnRight(char currentDirection) {
        switch (currentDirection) {
            case 'n':
                direction = 'e';
                break;
            case 'e':
                direction = 's';
                break;
            case 's':
                direction = 'w';
                break;
            case 'w':
                direction = 'n';
                break;
            case 'u':
            case 'd':
                direction = 'e';
                break;
        }
        return direction;
    }

    public void craftController(char[] commands) {
        for (int i = 0; i < commands.length; i++) {
            char command = commands[i];
            switch (command) {
                case 'l':
                    direction = turnLeft(direction);
                    break;
                case 'r':
                    direction = turnRight(direction);
                    break;
                case 'u':
                    direction = 'u';
                    break;
                case 'd':
                    direction = 'd';
                    break;
                case 'f':
                case 'b':
                    moveSpaceCraft(command);
                    break;
                default:
                    System.out.println("Invalid Command");
            }
            displayPosition();
        }
    }

    public void displayPosition() {
        System.out.println("Final position: ");
        System.out.print(x + " " + y + " " + z + "\t");
        System.out.println("Final direction: ");
        System.out.println(direction);
    }
}