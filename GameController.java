public interface GameController {
    void startGame();
    void pauseGame();
    void resumeGame();
    void endGame();
    void moveSnake(Direction direction);
}
