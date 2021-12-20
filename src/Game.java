import java.util.Random;
import java.util.Scanner;

public class Game {
    private static int top = 100;
    private static int bot = 0;
    private int num;
    private static int in_num;
    Game(){
        num = (int)(Math.random() * (top - bot) + bot);
    }
    public void play(GameView view){
        Scanner sc = new Scanner(System.in);
        do {
            in_num = sc.nextInt();
            if(in_num == this.num) {
                view.correctInput();
                break;
            }
            else{
                if(in_num > top || bot > in_num){
                    view.incorrectInput();
                }else {
                    if(in_num > this.num){
                        top = --in_num;
                        view.newRadiusMessage(top,bot,true);
                    }
                    else {
                        bot = ++in_num;
                        view.newRadiusMessage(top,bot,false);
                    }
                }
            }
        }while (true);
    }
}

