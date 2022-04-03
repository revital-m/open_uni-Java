import java.util.HashSet;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class RandomMatrixFillController {

    @FXML
    private Canvas canv;
    private GraphicsContext gc;
    
    public void initialize() {
    	gc = canv.getGraphicsContext2D();
    }

    @FXML
    void btnPressed(ActionEvent event) {
    	final int CANV_WIDTH = (int) canv.getWidth();
    	final int CANV_HEIGHT = (int) canv.getHeight();
    	final int RECT_SIZE = 10;
    	
    	gc.clearRect(0, 0, CANV_WIDTH, CANV_HEIGHT);
    	
    	createMatrix(CANV_WIDTH, CANV_HEIGHT, RECT_SIZE);
    	fillRandomRect(CANV_WIDTH, CANV_HEIGHT, RECT_SIZE);
    }
    
    // Create the matrix.
    private void createMatrix(int canvWidth, int canvHeight, int rectSize) {
    	for (int i = 0; i < canvHeight;) {
    		for (int j = 0; j < canvWidth;) {
    			gc.strokeRect(j, i, rectSize, rectSize);
    			j += rectSize;
    		}
    		i += rectSize;
    	}
    }
    
    // Fill the random rectangle in the matrix.
    private void fillRandomRect(int canvWidth, int canvHeight, int rectSize) {
    	
    	int numOfRectToFill = (int) (((canvWidth * canvHeight) / Math.pow(rectSize, 2)) * 0.1);
    	Random r = new Random();
    	HashSet<String> rectCoordinatesSet = new HashSet<String>();
    	
    	while (numOfRectToFill > 0) {
    		int xRandom = r.nextInt(canvWidth);
    		int x = (xRandom - (xRandom % rectSize)); // Initialize location in the canvas.
    		int yRandom = r.nextInt(canvHeight);
    		int y = (yRandom - (yRandom % rectSize)); // Initialize location in the canvas.
    		
    		String coordinates = String.valueOf(x) + "-" + String.valueOf(y);

    		// Check if the (x,y) location is not fill already.
    		if (!rectCoordinatesSet.contains(coordinates)) {
    			rectCoordinatesSet.add(coordinates);
    			gc.fillRect(x, y, rectSize, rectSize);
    			numOfRectToFill--;
    		}
    	}
    }
}
