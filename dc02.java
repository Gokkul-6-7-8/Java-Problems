import java.util.*;
public class dc02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0)
            {
                count++;
            }
            if(arr[i]!=0)
            {
            System.out.print(arr[i]);
            }
            
        }
        System.out.println("0".repeat(count));
    }
   
}
