package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// task 2
    //    isBmiOptimal(60.5f,169);
        // task 3
       // solveEcuation(1,-13,40); // x1=5, x2=8;
        // task 4
      //  fizzBuzz(21);
        // task 5
       // numerePrime();
        // Task 6
        //calculateHn(10);
        // Task 7
       // fibonacci(5);
        // Task 8
        //calculator();
        //Task 9
        //printWave(4,30);
        //Task 10
        calculateSumOfDigits(345);
    }
    public static void fizzBuzz(int x){
        for(int i = 1; i <= x; i++){
            if(i % 3 == 0 && i % 7 == 0)
                System.out.println("FizzBuzz");
            else if( i % 7 == 0)
                System.out.println("Buzz");
            else if(i % 3 == 0)
                    System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }
    public static void isBmiOptimal(float weightInKg, int heightInCm){
        double bmi=weightInKg/Math.pow(heightInCm/100.0f,2.0f);
        System.out.println("Your BMI is: "+bmi);
        if(bmi>=18.5 && bmi<=24.9)
            System.out.println("BMI optimal!");
        else
            System.out.println("BMI NOT optimal!");
    }
    public static void solveEcuation(int a, int b, int c){
        int delta = b*b-4*a*c;
        if(delta>=0){
            double x1,x2;
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }else
            System.out.println("Delta este negativ.");
    }
    public static void numerePrime() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul pana la care doriti sa afisati nr prime: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++)
            if(isPrim(i))
                System.out.println(i);

    }
    public static boolean isPrim(int x){

        if(x<=1)
            return false;
        for(int i = 2; i <= x / 2; i++)
            if(x % i == 0)
                return false;

            return true;

    }
    public static void calculateHn(int n){
        float Hn=0;
        for(int i = 1; i <= n; i++)
            Hn += 1f/i;
        System.out.println("The sum of the harmonic series is : " + Hn);
    }
    public static void fibonacci(int n){
        int sum=0, rev1=0, rev2=1;
        for(int i = 1; i <= n; i++) {
            rev1 = sum;
            sum += rev2;
            rev2 = rev1;
        }
        System.out.println(sum);
    }
    public static void calculator(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Dati primul nr: ");
        float n1 = scan.nextFloat();
        System.out.print("Dati o operatiune: ");
        String c = scan.next();
        System.out.print("Dati al doilea nr: ");
        float n2 = scan.nextFloat();
        float rezult = 0;
        switch (c){
            case "+":
                rezult = n1+n2;
                System.out.println("Rezultatul este: " + rezult);
                break;
            case "-":
                rezult = n1-n2;
                System.out.println("Rezultatul este: " + rezult);
                break;
            case "*":
                rezult = n1*n2;
                System.out.println("Rezultatul este: " + rezult);
                break;
            case "/":
                if(n2==0) {
                    System.out.println("Cannot calculate!");
                    break;
                }
                rezult = n1/n2;
                System.out.println("Rezultatul este: " + rezult);
                break;
            default:
                System.out.println("Ïnvalid symbol: " + c);
        }
    }
    public static void printWave(int l,int n){
      String[][] matr = new String[l][n];
        int i=0,j=0;

        while(j<n){
            {
                for(i=0; i < l && j < n; i++) {
                    matr[i][j] = "*";
                    j++;
                }
               for (i = l-1; i >= 0 && j < n; i--) {
                    matr[i][j] ="*";
                    j++;
                }
            }
        }
        for(i=0;i<l;i++) {
            for (j = 0; j < n; j++) {
                if (matr[i][j]==null)
                    matr[i][j] = " ";
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void calculateSumOfDigits(int n){
        int sum=0, n1=0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}




