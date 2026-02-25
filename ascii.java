public class ascii {
    public static void main(String[] args) {
        Ascii("","abcd");

    }
    public static void Ascii(String s,String up){
        if(up.isEmpty()){
            if(!s.isEmpty()){
                for(int i=0;i<s.length();i++){
                    System.out.print((int)s.charAt(i)+'0');
                }
                System.out.println();
            }
            return;
        }
        Ascii(s+up.charAt(0),up.substring(1));
        Ascii(s,up.substring(1));

    }
}
