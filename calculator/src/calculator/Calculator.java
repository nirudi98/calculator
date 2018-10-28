/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
public class Calculator
{
    public int addition(int x,int y)
    {
        int add=x+y;
        return add;
    }
    
    public int subtraction(int x,int y)
    {
        int sub=x-y;
        return sub;
    }
    
    public int multiplication(int x,int y)
    {
        int mul=x*y;
        return mul;
    }    
   
    public int division(int x,int y)
    {
        int div=x/y;
        return div;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1:");
        int a=sc.nextInt();
        System.out.println("enter number 2:");
        int b=sc.nextInt();
        
        Calculator c1=new Calculator();
        int ans1=c1.addition(a,b);
        int ans2=c1.subtraction(a,b);
        int ans3=c1.multiplication(a,b);
        int ans4=c1.division(a,b);
        System.out.println("the addition is :"+ans1);
        System.out.println("subtraction is :"+ans2);
        System.out.println("multiplication is :"+ans3);
        System.out.println("division is :"+ans4);
        
    }
    
}
