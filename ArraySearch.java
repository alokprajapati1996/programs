import java.util.Scanner;

public class ArraySearch {
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter row");
    int row=sc.nextInt();
    System.out.println("enter colomn");
    int col=sc.nextInt();
    int arr[][]=new int[row][col];
    System.out.println("enter value of array");

    for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        arr[i][j]=sc.nextInt();
    }
    }
    System.out.println("enter search value");
int x=sc.nextInt();
    System.out.println("value will be:");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){

            if(arr[i][j]==x){
                System.out.println(i+" "+j);
            
            }
            
        }
    }
}
}      
        
    

