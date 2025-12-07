import java.util.*;

public class StringBuilder1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            StringBuilder s = new StringBuilder("HEllo");

            System.out.println("String: "+s);

            //Charat
            System.out.println("Char: "+s.charAt(3));

            // Set charat
            s.setCharAt(0,'Y');
            System.out.println("Char: "+s);


            // insert at
            s.insert(5,' ');
            s.insert(6,'w');
            System.out.println("String: "+s);

            // Reverse the string
            System.out.println("String reverse:  "+s.reverse());

            //Delete
            s.deleteCharAt(0);

            System.out.println("String: "+s);

            s.delete(0,1);
            System.out.println("String: "+s);

            s.reverse();
            System.out.println("String: "+s);

            s.append(" World");
            System.out.println("String: "+s);

            System.out.println("Length: "+s.length());


        }
}