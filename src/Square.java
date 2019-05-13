public class Square {
    double sideA;

    Square(double side){
        sideA = side;
    }

    double calculateArea(){
        return Math.pow(sideA,2);
    }
}
