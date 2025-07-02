import java.util.*;

public class pgm3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of monkeys");
        int monkeys = in.nextInt();
        System.out.println("Enter no of bananas");
        int banana = in.nextInt();
        System.out.println("Enter no of peanuts");
        int peanuts = in.nextInt();

        int monkeys1= 0;

        for (int i = 0; i < monkeys; i++) {
            if (banana >= 2) {
                banana -= 2;
                monkeys1++;
            }
             else if (peanuts >= 3) {
                peanuts -= 3;
                monkeys1++;
            } 
                else if ((banana > 0 && banana < 2) || (peanuts > 0 && peanuts < 3)) {
                monkeys1++;
                banana = 0;  
                peanuts = 0; 
            } 
            else {
                break;
            }
        }

        System.out.println("Monkeys remaining: " +(monkeys - monkeys1++));

        in.close();
    }
}
