// import java.util.Scanner;

// public class Demo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = input.nextLine();
//         System.out.println("Hello, " + name + "!");
//     }
// }

// import java.util.Scanner;

// public class Demo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = input.nextInt();
//        if (num % 2 == 0) {
//             System.out.println("The number is even.");
//         } else if (num % 2 != 0) {
//             System.out.println("The number is odd.");
        
//        } else {
//             System.out.println("Invalid input. Please enter a valid number.");
//        }    }
// }

// import java.util.Scanner;
// public class Demo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter principle amount: ");
//         int P = input.nextInt();
//         System.out.print("Enter rate of interest: ");
//         float R = input.nextFloat();
//         System.out.print("Enter time in years: ");
//         int T = input.nextInt();
//         float SI = (P * R * T) / 100;
//         System.out.println("Simple Interest is: " + SI);        
        
//         input.close();
//     }
// }

// 

// 

// import java.util.Scanner;
// public class Demo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a number n: ");
//         int n = input.nextInt();
//         System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
//         input.close();
//     }

//     public static int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         return fibonacci(n - 1) + fibonacci(n - 2);
//     }
// }


// import java.util.Scanner;
// public class Demo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter your string: ");
//         String str = input.nextLine();
//         if (str.equals(new StringBuilder(str).reverse().toString())) {
//             System.out.println("The String is palindrome.");
//         } else {
//             System.out.println("The String is not palindrome.");
//         }
        
//         input.close();
//     }
// }

// import java.util.Scanner;
// public class Demo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int start = input.nextInt();
//         System.out.print("Enter another number: ");
//         int end = input.nextInt();
//         System.out.println("Armstrong numbers between " + start + " and " + end + ":");
//         for (int i = start; i <= end; i++) {
//             int sum = 0, temp = i, digits = String.valueOf(i).length();
//             while (temp != 0) {
//                 int digit = temp % 10;
//                 sum += Math.pow(digit, digits);
//                 temp /= 10;
//             }
//             if (sum == i) {
//                 System.out.print(i + " ");
//             }
//         }

//         input.close();
//     }
// }

