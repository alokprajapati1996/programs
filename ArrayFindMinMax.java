import java.util.Scanner;

public class ArrayFindMinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int row=sc.nextInt();
        System.out.println("enter column");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("enter value of array");
        for(int i=0;i<row;i++){
        for(int j=0;j<row;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    int min=arr[0][0],max=arr[0][0];
    for(int i=0;i<row;i++){
    for(int j=0;j<row;j++){
      if(arr[i][j]<min){
          min=arr[i][j];
          
      }
      if(arr[i][j]>max){
          max=arr[i][j];
      }


        }
    }
        System.out.println("min value :"+min);
        System.out.println("maximun value :"+max);

    
    
    }
}
