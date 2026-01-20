class pr_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 5;

        // Unary  operator
        System.out.println("Unary Operators Output:");
        System.out.println("a++ = " + a++);
        System.out.println("a-- = " + a--);
        System.out.println("--b = " + --b);
        System.out.println("++b = " + ++b);

        // Arithmetic expressions
        System.out.println("\nArithetic Operators Output:");
        float exp1 = a * b - c;
        float exp2 = (a + b) * (a + c);
        System.out.println("a * b - c = " + exp1);
        System.out.println("(a + b) * (a + c) = " + exp2);

        // Relational
        System.out.println("\nRelational Opertors Output:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical
        System.out.println("\nLogical Operators Output:");
        System.out.println("a > b && b < c = " + (a > b && b < c));
        System.out.println("a > b || b < c = " + (a > b || b < c));

        // Bitwise operators
        System.out.println("\nBitwise Operators Output:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println(" a >> 1 = " + (a >> 1));

        // Ternary operator
        System.out.println("\nTernary Operator Output:");
        int max = (a > c) ? a :  c;
        System.out.println("Max of a and c = " + max);

        // Assignment operators
        System.out.println("\nAssignment Operators Output:");
        int x = 5;
        System.out.println("x = 5 -> " + x);
        x += 3;
        System.out.println("x += 3 -> " + x);
        x -= 2;
        System.out.println("x -= 2 -> " + x);
        x *= 4;
        System.out.println("x *=  4 -> " + x);
        x /= 3;
        System.out.println("x /= 3 -> " + x);
        x %= 2;
        System.out.println("x %= 2 -> " + x);
    }
}