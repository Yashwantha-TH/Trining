import java.util.*;
public class pro5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int[] arr = new int[num];
         int[] arr2 = new int[num];
          for(int i=0;i<num;i++){
             arr[i]  = sc.nextInt();
          }
          int first=0;
          int last=num-1;
          for(int j=0;j<num;j++){
            if(arr[j]==0){
                arr2[last]=arr[j];
                last--;
          

            }else{
                arr2[first]=arr[j];
                first++;

            }
          }
          System.out.println(Arrays.toString(arr2));
    }
    
}
