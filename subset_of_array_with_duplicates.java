import java.util.*;
public class subset_of_array_with_duplicates {
    public static void main(String args[]) {
        int[] array={1,2,2};
        System.out.println(subset(array));
    }
    public static List<List<Integer>> subset(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result =  new ArrayList<>();
        result.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0; i<nums.length; i++){
            start=0;
            if(i>0 && nums[i] == nums[i-1]) start = end + 1;
            end=result.size()-1;
            for(int j=start;j<=end;j++){
                List<Integer> sub =  new ArrayList<>(result.get(j));
                sub.add(nums[i]);
                result.add(sub);
            }
        }
        return result;
    }
}
