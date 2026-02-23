public class remove_app {
    public static void main(String[] args) {
        String s="AbrakadabraappabbApp";
        System.out.println(removeApp(s));
        System.out.println(removeAppDirect(s));

    }
    public static String removeApp(String s){
        if(s.length()<3) return s;
        if(s.startsWith("app") || s.startsWith("App")) return removeApp(s.substring(3));
        return s.charAt(0)+removeApp(s.substring(1));
    }
    public static String removeAppDirect(String s){
        s=s.replace("app", "");
        s=s.replace("App","");
        return s;
    }
}
