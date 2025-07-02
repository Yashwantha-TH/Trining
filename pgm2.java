import java.util.*;
public class pgm2 {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter no of monkeys");
    int monkeys=in.nextInt();
    System.out.println("Enter no of bananas");
    int banana=in.nextInt();
    System.out.println("Enter no of peanuts");
    int peanuts=in.nextInt();
    int monkeys1=0;
    for(int i=0;i<monkeys;i++){
        if(banana>=2){
            banana-=2;
           // monkeys1+=1;
            monkeys--;
        }
        else if(peanuts>=3){
            peanuts-=3;
           // monkeys1+=1;
            monkeys--;
        }
        else if((banana>0 && banana <2) ||( peanuts>0 && peanuts<3)){
           // monkeys1+=1;
           monkeys--;
        }
        else{
            break;
        }
    }
    System.out.println(monkeys);
    in.close();
    }
}   
    


