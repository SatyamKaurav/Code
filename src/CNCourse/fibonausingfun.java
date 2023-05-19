public class fibonausingfun {
    public static boolean checkMember(int n) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int a = 1;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int temp = a + b;
            b = a;
            temp = b;
            if (temp == n) {
                return true;
            } else {
                return false;

            }

        }
         return false;
    }



    public static void main(String [] args){

//        boolean bo=checkMember();
//        System.out.print(bo);
    }


}
