package CNCourse;

public class Patern3 {
    public static void main(String[] args) {

        /*
        1
        12
        123
        1234

        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){

                System.out.print(j);
                j++;

            }
            System.out.println("" + "");
            i++;
        }*/

//        **********************************************************************************************
/*
          1
          23
          456
          78910


        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int p=1;
        int i=1;
        while(i<=n) {
            int j = 1;
            while (j <= i) {

                System.out.print(p);
                p++;
                j++;

            }
            System.out.println("" + "");
            i++;

        }

 */
//        **************************************************************************
/*
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        int i=1;
        while(i<=n) {
            int p=i;
            int j = 1;
            while (j <= i) {


                System.out.print(p);
                p++;
                j++;

            }
            System.out.println("" + "");
            i++;

 */
//        *********************************************************************
        /*
        1
        21
        321
        4321


        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;

        while(i<=n){
            int j=1;
            int p=i;
            while(j<=i){
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
     */

        /*
        1
        22
        333
        4444

        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;

		while(i<=n){
			int j=1;
			while(j<=i){
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
         */
//        **********************************************************************************

/*
        *
        **
        ***
        ****
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
*/

    }


}
