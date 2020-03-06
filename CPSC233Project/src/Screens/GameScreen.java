package Screens;

import Launcher.JavaFXApp;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class GameScreen extends BaseScreen {
    @Override
    public void create() {

    }

    @Override
    public void render(float delta, GraphicsContext g) {
        // Clear the background
        clear(g, Color.WHITE);
        drawBoard(g);
    }

    public void drawBoard(GraphicsContext g) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                // Draw white checkered squares

                if ((r + c) % 2 == 0) continue;

                float squareSize = JavaFXApp.SIZE / 8.0f;

                Paint temp = g.getFill();
                g.setFill(Color.BLACK);
                g.fillRect(r * squareSize, c * squareSize, squareSize, squareSize);
                g.setFill(temp);
            }
        }
    }

    @Override
    public void onMouseEvent(MouseEvent event) {
        System.out.println(getChessCoordinateX(event.getX()) + " " + getChessCoordinateY(event.getY()));
    }

    @Override
    public void dispose() {

    }

    private int getChessCoordinateX(double mouseX) {
        return (int)(mouseX / (JavaFXApp.SIZE / 8.0));
    }

    private int getChessCoordinateY(double mouseY) {
        return (int)(mouseY / (JavaFXApp.SIZE / 8.0));
    }
}
