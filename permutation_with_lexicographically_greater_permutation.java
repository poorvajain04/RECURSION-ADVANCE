import java.util.*;
public class permutation_with_lexicographically_greater_permutation {
    public static void main(String[] args) {
        int [] array={1,4,2,9,8,7,1,3};
        nextPermutation(array);
        System.out.println(Arrays.toString(array));
    }
    public static void nextPermutation(int[] nums){
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i])j--;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
