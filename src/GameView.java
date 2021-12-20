public class GameView {
    public void incorrectInput(){
        System.out.println("Pls, check your number incorrect input.");
    }
    public void correctInput(){
        System.out.println("You are right!");
    }
    public void newRadiusMessage(int top,int bot,boolean flag){
        if(flag){
            System.out.print("Correct number is smaller.");
        }else {
            System.out.print("Correct number is bigger.");
        }
        System.out.println("Your number is not correct, pls try again. Your new radius is:[" + top + "," + bot + "].");
    }

}
