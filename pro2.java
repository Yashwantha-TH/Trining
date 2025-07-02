

 import java.util.Scanner;

public class pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int totalMonkeys = sc.nextInt(); // Total monkey count
        int totalBananas = sc.nextInt(); // Total banana count
        int totalPeanuts = sc.nextInt(); // Total peanut count

        int monkeysFedByBananas = totalBananas / 2;
        int monkeysFedByPeanuts = totalPeanuts / 3;
        int unfedMonkeys = totalMonkeys;
        int actualFedByBananas;
        if (unfedMonkeys < monkeysFedByBananas) {
            actualFedByBananas = unfedMonkeys;
        } else {
            actualFedByBananas = monkeysFedByBananas;
        }
        unfedMonkeys -= actualFedByBananas;
        int actualFedByPeanuts;
        if (unfedMonkeys < monkeysFedByPeanuts) {
            actualFedByPeanuts = unfedMonkeys;
        } else {
            actualFedByPeanuts = monkeysFedByPeanuts;
        }
        unfedMonkeys -= actualFedByPeanuts;
        System.out.println(unfedMonkeys);

        sc.close();
    }
}