package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here

        System.out.println("Hello World!");


    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
String sg=new String();
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println("");
                sg=" _(\\    |@@|";
        System.out.println(sg);
        System.out.println("   /\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __ ");
        System.out.println("        \\ }{ /\\ )_ / _\\");
        System.out.println("        /\\__/\\ \\ __o (__");
        System.out.println("       (--/\\--)");
        System.out.println("       _)(  )(_");
        System.out.println("      `---''---`");
        System.out.println("\n");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here

        char justone='Z';
        int hx=0xface;
        int octal=012;
        char whatonearth=012;
        float tort=44e-1f;
        float kicsi=5.5f;
        double nekem=8.88e1;
        float sayninetynine=99.9f;
        long hosszuu=80L;
        //System.out.println(justone+"   "+hx+"   "+octal+"   "+whatonearth+"   "+tort+"   "+kicsi+"   "+sayninetynine+"   "+hosszuu);
    int sum;
          sum=(hx)+ (octal)+ ((int) whatonearth)+ ((int) tort)+ ((int) kicsi)+ ((int) nekem)+ ((int) sayninetynine)+((int) hosszuu);
        System.out.println(sum);

    }


    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner kb=new Scanner(System.in);
        int zahl= kb.nextInt();
        //ystem.out.println(zahl);
        int zahl2= kb.nextInt();
        //System.out.println(zahl2);
        System.out.println(zahl+zahl2);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int a=7; int b=77;
        a = a^b^(b = a);

        System.out.println("a = "+ a + " b = "+b) ;
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here

        Scanner kb=new Scanner(System.in);
        int zahl= kb.nextInt();
        //System.out.println(zahl);
        int zahl2= kb.nextInt();
        //System.out.println(zahl2);
        String rel="";
            if(zahl>zahl2){
                rel=">";
            }
            else if(zahl<zahl2) {
                rel = "<";
            }
            else {
                rel = "=";
            }
        System.out.println(zahl+rel+zahl2);
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        Scanner kb=new Scanner(System.in);
        int Umsatz= kb.nextInt();
        System.out.println(Umsatz);
        String rel="";

        if(Umsatz < 0 || Umsatz >= 100000){rel="Invalid Revenue";} else if (0 <= Umsatz &&  Umsatz < 20000){rel="Poor Sales Revenue";} else if (20000 <= Umsatz && Umsatz  < 50000){rel="Average Sales Revenue";} else if (50000 <= Umsatz && Umsatz < 80000){rel="Good Sales Revenue";} else if (80000 <= Umsatz && Umsatz < 100000){rel="Excellent Sales Revenue";}

        System.out.println(rel);
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        System.out.println();
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        System.out.println();
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        System.out.println();
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}