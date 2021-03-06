package com.vincent.decorator_pattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        // decorating normal circle
        // decorating: consume in normal circle, override and add more methods
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
