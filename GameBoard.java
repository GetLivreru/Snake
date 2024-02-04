import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    // Ваш код для отображения игрового поля   
    private int[][] matrix;
    public GameBoard(int weight,int height){
        matrix = new int[weight][height];
        initializeMatrix(500);
    }
    
    private void initializeMatrix(int value) {
        // implementation of the method
        for(int i = 0 ;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                matrix[i][j] = value;
            }
        }
    }
}
