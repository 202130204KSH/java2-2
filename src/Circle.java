public class Circle {
    int rad;
    String name;
    
    public Circle(){
        rad = 1; name = "";
    }

    public Circle(int r, String n){
        rad = r;
        name = n;
    }

    public double getArea(){
        return 3.14*rad*rad;
    }
    public static void main(String[] args){
        Circle pizza = new Circle(10, "피자");
        double area = pizza.getArea();
        System.out.println(pizza.name+"면적"+area);

        Circle donut = new Circle();
        donut.name = "도넛";
        area = donut.getArea();
        System.out.println(donut.name+"면적"+area);
    }
}