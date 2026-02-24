public class skip_app_if_word_not_apple {
    public static void main(String[] args) {
        String s="babyapplyapple";
        System.out.println(remove(s));
        String str="babyappbaby";
        System.out.println(remove(str));
    }
    public static String remove(String s){
        if (s.length() == 0) return "";
        if(s.contains("apple")) return s;
        else if(s.startsWith("app") || s.startsWith("App")) return remove(s.substring(3));
        return s.charAt(0)+remove(s.substring(1));
    }
}
