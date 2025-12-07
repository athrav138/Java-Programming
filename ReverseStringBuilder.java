import java.util.*;

public class StringBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder s = new StringBuilder("HELLO");

        System.out.println("String: "+s);
        int j = s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            char ch = s.charAt(i);
            //s.charAt(i) = s.charAt(j);
            s.setCharAt(i,s.charAt(j));
            //s.charAt(j) = ch;
            s.setCharAt(j,ch);
            j--;
        }

        System.out.println("String reverse is: "+s);

    }
}