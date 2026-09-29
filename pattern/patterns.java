import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n = Sc.nextInt();
        pattern1(n);
        Sc.close();
        
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n = Sc.nextInt();
        pattern1(n);
        Sc.close();
        
    }

    public static void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n = Sc.nextInt();
        pattern1(n);
        Sc.close();
        
    }

    public static void pattern1(int n) {
         for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }

    }
}


import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n = Sc.nextInt();
        pattern1(n);
        Sc.close();
        
    }

    public static void pattern1(int n) {
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}




import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n = Sc.nextInt();
        pattern1(n);
        Sc.close();
        
    }

    public static void pattern1(int n) {
          for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}







import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n = Sc.nextInt();
        pattern1(n);
        Sc.close();
        
    }

    public static void pattern1(int n) {
          for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }



    }
}


import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n = Sc.nextInt();
        pattern1(n);
        Sc.close();
        
    }

    public static void pattern1(int n) {
           for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}



import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the value of n");
        int n = Sc.nextInt();
        pattern1(n);
        Sc.close();
        
    }

    public static void pattern1(int n) {
            int spaces = 2 * n - 2;
        
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Determine the number of stars for the current row
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            
            // 1. Print left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            
            // 2. Print spaces in the middle
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // 3. Print right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();
            
            // Adjust spaces: decrease until the middle row, then increase
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }
}



import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read 'n' from the user
        scanner.close();
        
        pattern1(n);
    }

    public static void pattern1(int n) {
        // Upper half (Pyramid)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half (Inverted Pyramid)
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}