import java.util.Scanner;
public class Search_Element_in_Array_with_Find_Index{
    public static int FindFirstOccurence(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the "+n+" Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Searching element");
    int x=sc.nextInt();
    int index=FindFirstOccurence(arr,x);
    if(index==-1){
    System.out.println("The Element"+x+"Not found");

    }
    else{
        System.out.println("The Element"+x+"Found in the index "+index);
    }
    sc.close();
}}