import java.util.Scanner;

public class strongnumber{

     public static void main(String[] args) {
       int l, c=0;
       Scanner ip = new Scanner(System.in);
       System.out.print("Enter how many strong numbers to print??");
       l = ip.nextInt();
       for(int i = 0; ;i++){
         if(c == l)
           break;
         if(isStrongNum(i)){
           c++;
           System.out.println(i +", ");
         }
       }
       ip.close();
     }

     private static boolean isStrongNum(int num){
       int sum=0, temp = num;
       while(num > 0){
         int rem = num % 10;
         sum = sum + fact(rem);
         num = num/10;
       }
       if(sum == temp)
             return true;
       else
             return false;
     }
     private static int fact(int num){
       int res=1;
       for (int i = num;i>=1 ; i-- ){
            res = res * i;
         }
         return res;
     }
}
