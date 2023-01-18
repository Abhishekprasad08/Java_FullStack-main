 public static void main(String[] args) {
//   int n =5;
        //upper half
        int n = 4;


        //upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("4");
            }


            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("3");
            }
            System.out.println();
        }
        //lower part
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("1");
            }


            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }


            for(int j=1; j<=i; j++) {
                System.out.print("2");
            }
            System.out.println();
        }
    }
}



  (out put)

  4      3
  44    33
  444  333
  44443333
  11112222
  111  222
  11    22
  1      2
