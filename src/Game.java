import java.util.Random;
import java.util.Scanner;

public class Game {

    private static int top = 100;
    private static int bot = 0;
    private int num;
    private static int in_num;
    Game(){
        num = (int)(Math.random() * (top - bot) + bot);
        System.out.println(num);
    }
    public static void play(){
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        do {
            in_num = sc.nextInt();
            if(in_num == game.num) {
                System.out.println("You are right!");
                break;
            }
            else{
                if(in_num > top || bot > in_num){
                    System.out.println("Pls, check your number incorrect input.");
                }else {
                    if(in_num > game.num){
                        System.out.print("Correct number is smaller.");
                        top = --in_num;
                    }
                    else {
                        System.out.print("Correct number is bigger.");
                        bot = ++in_num;
                    }
                    System.out.println("Your number is not correct, pls try again. Your new radius is:[" + top + "," + bot + "].");
                }
            }
        }while (true);
    }
}
