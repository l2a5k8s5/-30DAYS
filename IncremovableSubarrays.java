import java.util.*;
public class IncremovableSubarrays{
    public static int incremovableSubarrayCount(int[] nums,int n){
        int count = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(isIncreasingSubSequence(nums,i,j,n)){
                    count++;
                }
            }

        }
        return count;
    }

    public static boolean isIncreasingSubSequence(int[] nums,int start,int end,int n)
    {
        int prev=0;
        for(int i=0;i<n;i++)
        {
            if(i<=end && i>=start){
                continue;
            }
            if(nums[i]<=prev)
            {
                return false;
            }
            prev=nums[i];
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the length of the array : ");
        int n=sc.nextInt();

        int[] nums=new int[n];
        System.out.println(" Enter the elements of the array : ");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }

        System.out.println(" The total number of incremovable subarrays are " + incremovableSubarrayCount(nums, n));
        sc.close();
    }


}