package com.company;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.objects.NativeDate.getYear;
import static jdk.nashorn.internal.objects.NativeDate.setYear;

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
        //calculateSumOfDigits(345);
        // Task 11
       // findLongestUserInput();
        //Task 12
        //calculateSpacePercentage();
        //Task 13
       // stutter();
        //Task 14
      //  countCaractersBetween();
        //Task 15
       // arbitrarlyNumers();
        //Task 16
       // subsequence();
        // Task 17
        //nextDateClasses();
        // Task 18
        sneeze();
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
    public static void findLongestUserInput(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti text de la tastatura: ");
        String text;
        String maxtext = "";
        do{
           text = scan.nextLine();
            if(maxtext.length() < text.length() && !text.equals("Enough!")) {
                maxtext = text;
            }
        }while(!text.equals("Enough!"));
        if(maxtext.equals(""))
            System.out.println("No text provided!");
        else
            System.out.println("Textul cel mai lung este: " + maxtext);
    }
    public static void calculateSpacePercentage(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti text de la tastatura: ");
        String text = scan.nextLine();
       float sp=0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' ')
                sp++;
        }
        System.out.println("Textul contine spatii: " + (sp/text.length())*100 + " %");

    }
    public static void stutter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti tetul: ");
        String text = scan.nextLine();
        String[] words = text.split(" ");
        String[] dwords = new String[words.length*2];
////        for(String element : words) {
////            System.out.print(element + " " + element+ " ");
//        }
        int i=0;
        for(String element : words){
            dwords[i] = element;
            dwords[i+1] = element;
            i+=2;
        }
        for(String ele : dwords)
            System.out.print(ele + " ");

    }
    public static void countCaractersBetween(){
        Scanner scan = new Scanner(System.in);
       System.out.println("Introduceti doua caractere: ");
        char c1,c2;
        c1 = scan.next().charAt(0);
        c2 = scan.next().charAt(0);
        int n1,n2;
        n1 = (int) c1;
        n2 = (int) c2;
        if ((n1 >= (int)'a' && n1 <= (int)'z') && (n2 >= (int)'a' && n2 <= (int)'z')) {
            if (n2 == n1)
                System.out.println(0);
            else if (n2 > n1)
                System.out.println(n2 - n1 - 1);
            else
                System.out.println(n1 - n2 - 1);
        }else
            System.out.println("Invalid input!");

    }
    public static void arbitrarlyNumers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti zece numere aleatorii: ");
        int nre[] = new int[10];
        for(int i = 0; i < 10; i++)
            nre[i] = scan.nextInt();

        int[] unic = new int[10];

        int eg=0, k=0;
        for(int i = 0; i < 10; i++) {
            eg=0;
            for (int j = 0; j < 10; j++) {
                if (nre[i] == nre[j])
                    eg++;
            }
            if(eg >= 2 && k == 0) {
                unic[k] = nre[i];
                k++;
            }else if(eg >= 2){

                int eg2 = 0;
                for (int l = 0; l < k; l++) {
                    if (unic[l] == nre[i]) {
                        eg2 = 1;
                    }
                }
                    if (eg2 == 0)  {
                        unic[k] = nre[i];
                        k++;
                    }
            }
        }
        for(int i = 0; i < k; i++)
            System.out.print(unic[i] + " ");
    }
    public static void subsequence(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti zece numere aleatorii: ");
        int nre[] = new int[10];
        for(int i = 0; i < 10; i++)
            nre[i] = scan.nextInt();
        int i = 0,k = 1, max = 0;
        while( i < 9){
            if(nre[i] < nre[i+1])
            {
                i++;
                k++;
            }else if(max <= k) {
                max = k;
                k=1;
                i++;
            }else
                i++;

        }
        System.out.println("The longest increasing sequence is: " + max);
    }
    public static void nextDateClasses(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Write the date of your next SDA class of type YYYY-MM-dd: ");
        String readDate = scan.nextLine();
        LocalDate date = LocalDate.parse(readDate);
        System.out.println(date);
        LocalDate now = LocalDate.now();
        System.out.println(Period.between(now,date));
    } // Ex 17 -???? Local Date
    public static void sneeze(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a text: ");
        String text = scan.nextLine();
        Pattern p1 = Pattern.compile("acho+");
        Matcher mac = p1.matcher(text);
        System.out.println("Textul este: " + text);
        if(mac.matches())
            System.out.println(" A stranutat!!!!");
        else
            System.out.println("Nu a stranutat.");

    } // Ex 18 - ok!
    public static void guessNumber(){
       Random r = new Random();
       int nr = r.nextInt(100);
       Scanner scan = Scanner()

    }
}




