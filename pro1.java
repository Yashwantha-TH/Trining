import java.util.*;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of buildings: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] max1 = new int[num];
        int[] max2 = new int[num];
        int sum=0;
        for(int i=0;i<num;i++){
            arr[i]  = sc.nextInt();
        }
        if (num > 0) { 
            max1[0] = arr[0];
            for (int i = 1; i < num; i++) {
                max1[i] = Math.max(max1[i - 1], arr[i]);
            }
        }

        if (num > 0) { 
            max2[num - 1] = arr[num - 1];
            for (int i = num - 2; i >= 0; i--) {
                max2[i] = Math.max(max2[i + 1], arr[i]);
            }
        }
        System.out.println(Arrays.toString(max1));
        System.out.println(Arrays.toString(max2));
        for(int k=0;k<num;k++){
            if(max1[k] > max2[k]){
                sum += max2[k] - arr[k];
            }else{
                sum += max1[k] - arr[k];
            }
        }
        System.out.println(sum);
    }
}
