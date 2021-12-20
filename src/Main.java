public class Main {
    public static void main(String[] args) {
        Game model = new Game();
        GameView view = new GameView();
        GameController controller = new GameController(model,view);
        controller.play();
    }
}
