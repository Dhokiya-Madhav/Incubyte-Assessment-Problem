package code;
public class Main {
    
    public static void main(String[] args) {
        char[] commands = {'f','b','l','u'};
        char dir='s';
        Chandrayaan craft = new Chandrayaan(0,0,0,dir);
        craft.craftController(commands);
    }
}
