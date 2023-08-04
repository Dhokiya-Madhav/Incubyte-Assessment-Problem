package code;
public class Main {
    
    public static void main(String[] args) {
        char[] commands = {'f','b','l','u'};
        char dir='s';
        Chandrayaan craft = new Chandrayaan(0,0,0,dir);
        for (int i = 0; i < commands.length; i++) {
            char move = commands[i];
            switch (move) {
                case 'l':
                    dir = craft.takeLeft(dir);
                    break;
                case 'r':
                    dir = craft.takeRight(dir);
                    break;
                case 'u':
                    dir = 'u';
                    craft.direction='u';
                    break;
                case 'd':
                    dir = 'd';
                    craft.direction='d';
                    break;
                case 'f':
                case 'b':
                    craft.movespacecraft(move);
                    break;
                default:
                    System.out.println("Invalid Command");
                    
            }
            craft.displayPosition();
        }
    }
}
