public class Rectangle {
    double sideA;
    double sideB;

    Rectangle(double A, double B){
        sideA = A;
        sideB = B;
    }

    double calculatePermiter(){
        return sideA + sideB;
    }
}
