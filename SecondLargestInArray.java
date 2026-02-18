import java.util.Scanner;
public class SecondLargestInArray{

    public static int SecondLargest(int[] arr){
        int largest = arr[0];
        int slargest = -1;

        for(int i =0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]< largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = SecondLargest(arr);

        if (result == -1) {
            System.out.println("Second largest not possible.");
        } else {
            System.out.println("Second Largest: " + result);
        }

       
        

    }
}