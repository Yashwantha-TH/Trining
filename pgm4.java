import java.util.*;
//manufacturing company manufactures 2 adn 4 wheelers no count of them 
//first i/p=total vehicles manufactured
//second i/p = total wheels used
public class pgm4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int total=in.nextInt();
        int wheels=in.nextInt();
        //int fourwheels=0;
        //int twowheelers=0;
        for (int i = 0; i <= total; i++) {
            int j = total - i;
            if (4 * i + 2 * j == wheels) {
                System.out.println("Number of 4-wheelers: " + i);
                System.out.println("Number of 2-wheelers: " + j);
                break;
            }
        }
    }
}
