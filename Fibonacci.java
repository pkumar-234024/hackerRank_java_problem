import java.util.Scanner;
class Fibonacci{
    public void fib(long num){
        long a=0;
        long b=1;
        if (num <=0)
            System.out.println(0);
        else{
            for(int i=0;i<num;i++){
                long c = a+b;
                a = b;
                b = c;
                System.out.print(c+" ");
            }
        }

    }
}
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        long n = sc.nextLong();
        Fibonacci_Series fb = new Fibonacci_Series();
        fb.fib(n);
    }
}