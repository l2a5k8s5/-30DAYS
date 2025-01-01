import java.util.*;
public class EqualArray {

    public static int Min2Mov(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        int count=0;
        while(start<end)
        {
            count+=nums[end]-nums[start];
            start++;
            end--;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the length of the array : ");
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.println(" Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }

        System.out.println( " minimum steps to make array equal is " + Min2Mov(nums));
        sc.close();
    }
    
}
