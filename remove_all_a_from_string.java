
public class remove_all_a_from_string {
    public static void main(String[] args) {
        String s="baccad";
        System.out.println(removeAllA(s));
        StringBuilder sb=new StringBuilder();
        recursiveRemoval(s,0,sb);

    }
    public static String removeAllA(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void recursiveRemoval(String s, int index, StringBuilder sb) {
        if (index >= s.length()) {  // base case
            System.out.println(sb.toString());
            return;
        }
        if (s.charAt(index) != 'a') {
            sb.append(s.charAt(index));
        }
        recursiveRemoval(s, index + 1, sb);
    }
}
