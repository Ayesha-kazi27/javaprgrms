public class Pattern {
        public static void main(String[] args) {
            // write your code here
            char c = 'A';
            for(int i = 1;i<=4;i++){
                for(int j=1;j<=4-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(c);
                }
                System.out.println();
                c++;
            }
        }
}
