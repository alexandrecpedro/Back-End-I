package Shapes.service;

import Shapes.model.Square;

import java.util.HashMap;
import java.util.Map;

public class FlyweightSquare {
    /** Attributes **/
    private Map<Integer, Square> squareMap = new HashMap<>();
    
    /** Getter **/
    public Map<Integer, Square> getSquareMap() {
        return squareMap;
    }

    /** Methods **/
    // Square
    public Square getSquare(int size) {
        Square square = squareMap.get(size);
        if (square == null) {
            square = new Square(size);
            squareMap.put(size, square);
        }
        return square;
    }
}
