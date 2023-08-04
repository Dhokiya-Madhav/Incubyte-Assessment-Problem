package code;

public class Chandrayaan {
    int x = 0, y = 0, z = 0;
    char direction = 'n';

    public Chandrayaan(int x,int y,int z,char direction){
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void movespacecraft(char d) {
        switch (direction) {
            case 'u':
                if (d == 'f')
                    z++;
                else if (d == 'b')
                    z--;
                break;
            case 'd':
                if (d == 'f')
                    z++;
                else if (d == 'b')
                    z--;
                break;
            case 'n':
                if (d == 'f')
                    y++;
                else if (d == 'b')
                    y--;
                break;
            case 's':
                if (d == 'f')
                    y++;
                else if (d == 'b')
                    y--;
                break;
            case 'e':
                if (d == 'f')
                    x++;
                else if (d == 'b')
                    x--;
                break;
            case 'w':
                if (d == 'f')
                    x++;
                else if (d == 'b')
                    x--;
                break;
        }
    }

    public char takeLeft(char d) {
        switch (d) {
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

    public char takeRight(char d) {
        switch (d) {
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

    public void displayPosition() {
        System.out.print(x + " " + y + " " + z + "\t");
        System.out.println(direction);
    }
}
