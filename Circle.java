
public class Circle {
    public static void main(String []args){
    Circle1 c1 = new Circle1(5);
        System.out.println(c1);
    }
}

class Circle1{
    private double a = 1;

    public Circle1() {
    }
    public Circle1(double a){
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double getCircumference(){
        return Math.PI;
    }
    public double getArea(){
        return a*a*getCircumference();
    }
    
    public String toString() {
        return "Area is "+this.getArea();
    }
}
