import java.util.*;
public class DiceRollingToGetTarget {
    public static void main(String[] args) {
        System.out.println(dice("",4));

    }
    public static List<String> dice(String p, int target){
        if(target==0){
            List<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }
        List<String> res=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++) {
            res.addAll(dice(p + i, target - i));
        }
        return res;
    }
}
