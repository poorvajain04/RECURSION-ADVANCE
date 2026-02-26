import java.util.*;
public class Subset_of_Array {
    public static void main(String[] args) {
        int[] array={1,2,3};
        System.out.println(subset(array));
    }
    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num:nums){
            int size=result.size();
            for(int i=0;i<size;i++) {
                List<Integer> sub = new ArrayList<>(result.get(i));
                sub.add(num);
                result.add(sub);
            }
        }
        return result;
    }
}
