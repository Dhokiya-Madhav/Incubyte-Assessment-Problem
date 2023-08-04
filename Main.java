public class Main {
    
    public static void main(String[] args) {
        char[] commands = {'u','r','d','b','f'};
        char direction='s';
        Chandrayaan craft = new Chandrayaan(0,0,0,direction);
        for (int i = 0; i < commands.length; i++) {
            char move = commands[i];
            switch (move) {
                case 'l':
                    direction = craft.takeLeft(direction);
                    break;
                case 'r':
                    direction = craft.takeRight(direction);
                    break;
                case 'u':
                    direction = 'u';
                    craft.direction='u';
                    break;
                case 'd':
                    direction = 'd';
                    craft.direction='d';
                    break;
                case 'f':
                case 'b':
                    craft.movespacecraft(move);
                    break;
            }
            craft.displayPosition();
        }
    }
}
