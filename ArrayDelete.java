import java.util.*;

public class ArrayDelete {
    public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);
System.out.println("enter a size of array");
int size=sc.nextInt();
int arr[]=new int[size];
int arr2[]=new int[size-1];
System.out.println("enter your array value");
for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
}
System.out.println("enter where you want to insert new value");
int newArrIndex=sc.nextInt();
for(int i=0;i<size;i++){
    if(i<newArrIndex){
        arr2[i]=arr[i];
    }
    else if(i==newArrIndex){
        continue;
    }else{
        arr2[i-1]=arr[i];
    }
}
for(int i=0;i<size-1;i++){
    System.out.print(arr2[i]);
}


    }
    
}

    
    

