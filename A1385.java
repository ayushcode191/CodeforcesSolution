package problem;

import java.util.Scanner;

public class A1385 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a == b && a >= c) || (a == c && a >= b) || (b == c && b >= a)){
                System.out.println("YES");
                if(a==b){
                    System.out.println(a+" "+c+" "+c);
                } else if (b==c) {
                    System.out.println(b+" "+a+" "+a);
                }
                else{
                    System.out.println(a+" "+b+" "+b);
                }
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
