
import java.util.*;
import java.util.Random;

public class rockpaperscissorgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("enter your name");
        
        String name = sc.nextLine();
        System.out.println("instruction");
        System.out.println(
                "The winner of this 5 round match will be determined by whoever wins the most rounds. The player who achieves the most victories will come out on top and win the game. Good luck to both players!This match 5 round match who win maximum match this one win this game");
        System.out.println("u and computer playing this game \n" + "0 for rock\n" + "1 for paper\n" + "2 for scissor\n"
                + "let's start game");
        int playercount = 0;
        int computercount = 0;
        int draw = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("select your weapon");
            int user_weapon = sc.nextInt();
            int computer_weapon = ra.nextInt(3);
            System.out.println("computer selected his weapon\n" + computer_weapon);
            if (user_weapon == 0 && computer_weapon == 0) {
                System.out.println("draw");
                draw++;
            } else if (user_weapon == 0 && computer_weapon == 1) {
                System.out.println("computer is winner");
                computercount++;
            } else if (user_weapon == 0 && computer_weapon == 2) {
                System.out.println(name + " is winner");
                playercount++;
            } else if (user_weapon == 1 && computer_weapon == 0) {
                System.out.println(name + " is winner");
                playercount++;
            } else if (user_weapon == 1 && computer_weapon == 1) {
                System.out.println("draw");
                draw++;
            } else if (user_weapon == 1 && computer_weapon == 2) {
                System.out.println("computer is winner");
                computercount++;
            } else if (user_weapon == 2 && computer_weapon == 2) {
                System.out.println("draw");
                draw++;
            } else if (user_weapon == 2 && computer_weapon == 1) {
                System.out.println(name + " is winner");
                playercount++;
            } else if (user_weapon == 2 && computer_weapon == 0) {
                System.out.println(" computer is winner");
                computercount++;

            }

        }
        System.out.println("Score board");
        System.out.println("computer Score "+computercount);
        System.out.println(name+"'s"+" Score "+ playercount);
        System.out.println("draw Score"+draw);
        if (computercount < playercount) {
            System.out.print("winner is " + name);
        } else if (computercount > playercount) {
            System.out.print("winner is computer");
        } else {
            System.out.println("draw Match"+draw);
        }
    }

}