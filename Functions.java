import java.io.*;
public class Functions
{
    static int add(int a, int b)
    {
        return (a + b);
    }
    static int sub(int a, int b)
    {
        return (a - b);
    }
    static int mul(int a, int b)
    {
        return (a * b);
    }
    static int div(int a, int b)
    {
        return (a / b);
    }
    static int rem(int a, int b)
    {
        return (a % b);
    }
    static int fact(int a)
    {
        int fact = 1;
        for(int i = a; i>=1; i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    static int square(int a)
    {
        return(a*a);
    }
    static int cube(int a)
    {
        return(a*a*a);
    }
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the two numbers one by one");
        int m = Integer.parseInt(in.readLine());
        int n = Integer.parseInt(in.readLine());
        System.out.println("Sum = " + add(m, n));
        System.out.println("Difference = " + sub(m, n));
        System.out.println("Product = " + mul(m, n));
        System.out.println("Quotient = " + div(m, n));
        System.out.println("Remainder = " + rem(m, n));
        System.out.println("Factorial of "+m+" = "+fact(m)+"\nFactorial of "+n+" = "+fact(n));
        System.out.println("Square = " + square(m));
        System.out.println("Cube = " + cube(m));
    }
}