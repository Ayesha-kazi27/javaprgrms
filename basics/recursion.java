package basics;

    import java.util.Scanner;
    class recursion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a base value:");
            int a = sc.nextInt();
            System.out.println("Enter an exponent value:");
            int b = sc.nextInt();
            int result = power(a, b);
            System.out.println(a + " raised to the power of " + b + " is: " + result);
            sc.close();
        }

        public static int power(int a,int b) {
            if (b == 0) {
                return 1;
            } else {
                return a * power(a, b - 1);
            }
        }
    }