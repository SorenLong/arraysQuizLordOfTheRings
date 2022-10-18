import java.util.Scanner;

public class Main{

    //This is a short program that uses 2d arrays to do a quiz about tolkien characters

    public static void main(String[] args){
        String quiz[] = new String[4];



        String quiz2D[][] = new String[9][9];

        //creating questions and assigning them positions
        quiz2D[0][0] = "What is gandalf?";
        quiz2D[0][1] = "Valar";
        quiz2D[0][2] = "Maiar";
        quiz2D[0][3] = "Ainur";
        quiz2D[0][4] = "Dwarf";

        quiz2D[1][0] = "Who was the original and first evil tolkien character chronologically?!";
        quiz2D[1][1] = "Sauron";
        quiz2D[1][2] = "Morgoth";
        quiz2D[1][3] = "Melkor";
        quiz2D[1][4] = "Super evil guy!";

        quiz2D[2][0] = "Who was in the books but not the films?";
        quiz2D[2][1] = "Radagast";
        quiz2D[2][2] = "Isildur son of Elendil";
        quiz2D[2][3] = "Adar";
        quiz2D[2][4] = "Tom";

        quiz2D[3][0] = "What Hobbit threw the ring into mount doom?";
        quiz2D[3][1] = "Sam";
        quiz2D[3][2] = "Frodo";
        quiz2D[3][3] = "Bilbo";
        quiz2D[3][4] = "Pippin";

        quiz2D[4][0] = "What year did fellowship (movie) come out?";
        quiz2D[4][1] = "2001";
        quiz2D[4][2] = "1999";
        quiz2D[4][3] = "2008";
        quiz2D[4][4] = "2010";

        //Question 1 input + output

        for(int i = 0; i<5; i++) {
            System.out.println(quiz2D[0][i]);
        }Scanner scnq = new Scanner(System.in);
        String scannerQuestion = scnq.next(); //this will take the user's input
        if ((quiz2D[0][2].toLowerCase().equals(scannerQuestion.toLowerCase()))){
            System.out.println("You are correct!");
        }else{
            System.out.println("Nope, sorry.");
        }

        System.out.println(" "); // adds space before question

        //Question 2 input + output

        for(int i = 0; i<5; i++) {
            System.out.println(quiz2D[1][i]);
        }Scanner scnq2 = new Scanner(System.in);
        String scannerQuestion2 = scnq2.next(); //this will take the user's input
        if ((quiz2D[1][3].toLowerCase().equals(scannerQuestion2.toLowerCase()))){
            System.out.println("You are correct!");
        }else{
            System.out.println("Nope, sorry.");
        }

        System.out.println(" "); // adds space before question

        //Question 3 input + output

        for(int i = 0; i<5; i++) {
            System.out.println(quiz2D[2][i]);
        }Scanner scnq3 = new Scanner(System.in);
        String scannerQuestion3 = scnq3.next(); //this will take the user's input
        if ((quiz2D[2][4].toLowerCase().equals(scannerQuestion3.toLowerCase()))){
            System.out.println("You are correct!");
        }else{
            System.out.println("Nope, sorry.");
        }

        System.out.println(" "); // adds space before question

        for(int i = 0; i<5; i++) {
            System.out.println(quiz2D[3][i]);
        }Scanner scnq4 = new Scanner(System.in);
        String scannerQuestion4 = scnq4.next(); //this will take the user's input
        if ((quiz2D[3][1].toLowerCase().equals(scannerQuestion4.toLowerCase()))){
            System.out.println("You are correct!");
        }else{
            System.out.println("Nope, sorry.");
        }

        System.out.println(" "); // adds space before question

        for(int i = 0; i<5; i++) {
            System.out.println(quiz2D[4][i]);
        }Scanner scnq5 = new Scanner(System.in);
        String scannerQuestion5 = scnq5.next(); //this will take the user's input
        if ((quiz2D[4][1].toLowerCase().equals(scannerQuestion5.toLowerCase()))){
            System.out.println("You are correct!");
        }else{
            System.out.println("Nope, sorry.");
        }



    }

}