import java.util.Scanner;


public class ArmstrongDemo {
    public static void main(String[] args) {
        int sum=0,temp,rem;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        temp=num;
        while(num>0){
        rem=num%10;
        sum=sum+rem*rem*rem;
        num=num/10;
        }
        if(temp==sum){
            System.out.println("number is armstrong ");
        }
        else{
            System.out.println("number is not Armstrong");
        }

    }
    
}
