public class Pattern_INEURON {
    public static void main(String[] args) {
        int n=10;

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {

                //condition for printing I
                if (j==0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                //condition for printing N
                System.out.print(" ");    
                if (j==0||j==n-1||i==j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }    

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                   
                //condition for printing E
                System.out.print(" ");    
                if (i==0||i==n-1||i==(n-1)/2||j==0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                   
                //condition for printing U
                System.out.print(" ");    
                if (j==0&&i!=n-1||j==n-1&&i!=n-1||i==n-1&&j!=0&&j!=n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                //condition for printing R
                System.out.print(" ");    
                if (j==0 ||i==0||i==(n-1)/2 ||j==n-1&&i<=(n-1)/2 ||i>=(n-1)/2 &&i==j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
           
           }
           
           System.out.print("\t");
            for (int j = 0; j < n; j++) {
                 //condition for printing 0
                 System.out.print(" ");    
                 if (i==0&&j!=0&&j!=n-1||j==0&&i!=0&&i!=n-1 ||i==n-1&&j!=0&&j!=n-1||j==n-1&&i!=0&&i!=n-1) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
           
           }

           System.out.print("\t");
            for (int j = 0; j < n; j++) {
                //condition for printing N
                System.out.print(" ");    
                if (j==0||j==n-1||i==j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            
            System.out.println();
        }
    }
}

                
            

               

                 
                