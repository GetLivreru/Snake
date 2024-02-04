import javax.swing.JFrame;

public class SnakeGame {
    public static void main(String[] args) {
        // Ваш код запуска игры
        JFrame jFrame = new JFrame();
        GameBoard gameBoard = new GameBoard(500,500);
        jFrame.add(gameBoard);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
