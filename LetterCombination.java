import javax.swing.*;
import java.util.*;
public class LetterCombination {
    public static void main(String args[]){
        JFrame frame = new JFrame("Keypad");
        frame.setSize(2000,2000);
        ImageIcon icon = new ImageIcon("src/img.png");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println(keypad("","23"));
    }
    public static List<String> keypad(String p, String up){
        if(up.isEmpty()){
            List<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }
        List<String> res=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit*3);i++){
            char ch=(char)('a'+i);
            res.addAll(keypad(p+ch,up.substring(1)));
        }
        return res;
    }
}
