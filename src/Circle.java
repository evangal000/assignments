public class Circle {

    private double radius = 1.0;
    private String color = "red";


    Circle(double r){
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){

        // Area formula
        return (Math.PI * Math.pow(radius, 2));


    }

}
