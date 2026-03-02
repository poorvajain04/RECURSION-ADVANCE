import java.util.*;
public class Permute_array {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(permute(arr));
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num:nums){
            List<List<Integer>> newRes=new ArrayList<>();
            for(List<Integer> perm:res){
                for(int i=0;i<=perm.size();i++){
                    List<Integer> newPerm=new ArrayList<>(perm);
                    newPerm.add(i,num);
                    newRes.add(newPerm);
                }
            }
            res=newRes;
        }
        return res;
    }
}
