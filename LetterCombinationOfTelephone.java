import java.util.*;

public class LetterCombinationOfTelephone {
    public static void main(String[] args) {
        System.out.println(LetterCombination("23"));

    }
    public static List<String> LetterCombination(String digits){
        return helper("",digits);
    }
    public static List<String> helper( String p, String digits){
        if(digits.isEmpty()){
            List<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }
        List<String>res=new ArrayList<>();
        int digit=digits.charAt(0)-'0';
        int start=(digit-2)*3;
        if(digit==7) start++;
        int len=(digit==7||digit==9)?4:3;
        for(int i=start;i<start+len;i++){
            char ch=(char)('a'+i);
            res.addAll(helper(p+ch,digits.substring(1)));
        }
        return res;
    }
}
