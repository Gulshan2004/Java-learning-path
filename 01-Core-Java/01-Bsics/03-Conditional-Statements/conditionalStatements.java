public class conditionalStatements {
    public static void main(String args[]) {
        /*
         * int x = 18;
         * 
         * if(x>10 && x<=20){ // 11-20
         * System.out.println("hello");
         * System.out.println("Thank You");
         * }
         * else
         * System.out.println("bye");
         * }
         */

        int x = 8;
        int y = 7;
        int z = 9;

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}