public class ShapeCalculator {
    double squareArea(Square square){
        return Math.pow(square.sideA,2);
    }

    double circleArea(Circle cirle){
        return Math.PI * Math.pow(cirle.diameter,2);
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.sideA+triangle.sideB+triangle.sideC;
    }

    double rectPerimeter(Rectangle rectangle){
        return rectangle.sideA + rectangle.sideB;
    }
}
