import java.util.Scanner;

public class ArrayElementOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the desired element: ");
        int ele = sc.nextInt();
        int count=0;
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                count++;
                found=true;
            }  
        }
        System.out.println("The occurence of desired element is "+ count);
        if(found==false){
            System.out.println("Element is not found");
        }
    }
    
}
