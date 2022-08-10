package Shapes.service;

import Shapes.model.Triangle;

import java.util.HashMap;
import java.util.Map;

public class FlyweightTriangle {
    /** Attributes **/
    private Map<String, Triangle> triangleMap = new HashMap<>();

    /** Getter **/
    public Map<String, Triangle> getTriangleMap() {
        return triangleMap;
    }

    /** Methods **/
    // Triangle
    public Triangle getTriangle(String color) {
        Triangle triangle = triangleMap.get(color);
        if (triangle == null) {
            triangle = new Triangle(color);
            triangleMap.put(color, triangle);
        }
        return triangle;
    }
}
