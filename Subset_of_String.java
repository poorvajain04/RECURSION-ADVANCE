public class Subset_of_String {
    public static void main(String[] args) {
        subset("","abcd");

    }
    public static void subset(String s, String up) {
        if (up.isEmpty()) {
            System.out.println(s);
            return;
        }
        char ch=up.charAt(0);
        subset(s+ch,up.substring(1));
        subset(s,up.substring(1));
    }
}
