package code;

public class Main {
    
    public static void main(String[] args) {
        // Define an array of commands to control the spacecraft.
        char[] commands = {'f', 'b', 'l', 'u'};

        // Set the initial direction of the spacecraft ('s' for south).
        char dir = 's';

        // Create a new Chandrayaan object with the initial position at coordinates (0, 0, 0) and facing south ('s').
        Chandrayaan craft = new Chandrayaan(0, 0, 0, dir);

        // Control the spacecraft using the sequence of commands.
        // The 'craftController' method will process the commands and update the spacecraft's position and direction accordingly.
        craft.craftController(commands);
    }
}
