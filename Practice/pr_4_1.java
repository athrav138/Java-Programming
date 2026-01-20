public class pr_4_1{
    public static void main(String [] args)
    {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println("THe length: "+s1.length());
        System.out.println("THe charAt index 3: "+s1.charAt(1));
        System.out.println("THe subString index 2 to 4: "+s1.substring(2,4));
        System.out.println("THe sub string contains: "+ s2.contains("Wo"));
        System.out.println("The string equal or not: "+s1.equals(s2));
        System.out.println("isEmpty: "+s1.isEmpty());
        System.out.println("concatenation: "+s1.concat(" "+s2));
    }
}