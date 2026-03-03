import java.util.*;
public class Permutation_array_with_duplicates {
    public static void main(String[] args) {
        int [] arr={1,2,2};
        System.out.println(permutation_with_dup(arr));
    }
    public static List<List<Integer>> permutation_with_dup(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        while(true){
            List<Integer> current=new ArrayList<>();
            for(int num:nums){
                current.add(num);
            }
            res.add(current);
            int i=nums.length-2;
            while(i>=0 && nums[i]>=nums[i+1]) i--;
            if(i<0) break;
            int j=nums.length-1;
            while(nums[j]<=nums[i])j--;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        return res;
    }
}
