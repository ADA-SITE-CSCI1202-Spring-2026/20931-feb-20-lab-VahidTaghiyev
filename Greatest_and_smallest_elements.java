import java.util.Scanner;
public class Greatest_and_smallest_elements {


    //Part a
    public static int find_min (int[] arr){
        int min = arr[0];

        for (int i = 0; i<arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }


    //Part b
    public static int find_max(int[] arr){
        int max = arr[0];
        
        for(int i = 0; i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

    //Part c
    public static int[] find_min_max(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        return new int[]{max, min};
    } 

    //Input and Output
    public static void main(String[] args) {
        //Part i
        if (args.length > 0){
            int[] input = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                input[i] = Integer.parseInt(args[i]);
            }
            System.out.println("Command Line Input:");
            System.out.println("Minimum: " + find_min(input));
            System.out.println("Maximum: " + find_max(input));

            int[] result = find_min_max(input);
            System.out.println("Both (Min, Max): " + result[0] + ", " + result[1]);
        }
        //part ii
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number of elements: ");
        int n = scanner.nextInt();

        int[] userArray = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            userArray[i] = scanner.nextInt();
        }

        System.out.println("Scanner Input:");
        System.out.println("Minimum: " + find_min(userArray));
        System.out.println("Maximum: " + find_max(userArray));

        int[] result2 = find_min_max(userArray);
        System.out.println("Both (Min, Max): " + result2[0] + ", " + result2[1]);

        scanner.close();
    }
}
