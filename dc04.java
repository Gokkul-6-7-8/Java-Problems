//program to print the minimum count from left to right side 
import java.util.*;
public class dc04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
