public class Circle {
    double diameter;

    Circle (double diam){
        diameter = diam;
    }

    double calculateArea(){
        return  Math.PI * Math.pow(diameter,2);
    }
}
