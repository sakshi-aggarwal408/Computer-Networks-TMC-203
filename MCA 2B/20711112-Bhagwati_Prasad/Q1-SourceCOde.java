import java.util.Scanner;

public  class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factor(n);
        System.out.println(result);
        sc.close();
    }

    public static int factor (int n){
        if (n <= 0 || n ==1){
            return 1;
        } else  return (n*factor(n-1));
    }
}