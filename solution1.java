import java.util.Random;
import java.util.Arrays;
public class solution1
{
    static void randomize( int arr[], int n)
    {
        Random ran = new Random();
        for (int i = n-1; i > 0; i--) {
              
            int j = ran.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
      
  
    public static void main(String[] args) 
    {         
         int[] arr = {1, 2, 3, 4, 5, 6, 7};
         int n = arr.length;
         randomize(arr, n);
    }
}