import java.util.*;
public class Combination {
    public static void main(String[] args) {
        int n=5;
        int k=2;
        System.out.println(combine(n,k));
    }
    public static List<List<Integer>> combine(int n,int k){
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for(int i=1; i<=n; i++){
            int size=result.size();
            for(int j=0; j<size; j++){
                List<Integer> subset=new ArrayList<>(result.get(j));
                subset.add(i);
                result.add(subset);
            }
        }
        List<List<Integer>> answer=new ArrayList<>();
        for(List<Integer> list:result){
            if(list.size()==k){
                answer.add(list);
            }
        }
        return answer;
    }
}
