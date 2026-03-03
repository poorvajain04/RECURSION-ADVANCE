public class counting_no_of_Permutations {
    public static void main(String[] args) {
        String a="abc";
        System.out.println(Permute_count("",a));

    }
    public static int Permute_count(String p,String up){
        if(up.isEmpty()) return 1;
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+Permute_count(f+s+ch,up.substring(1));
        }
        return count;
    }
}
