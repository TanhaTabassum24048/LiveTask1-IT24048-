public class Vehicle{ // class named Vehicle
    //two private variables
    private String brand;
    private String color;

    //public constructor that initializes these variables.
    public Vehicle(String b , String c){
        this.brand = b;
        this.color = c;
    }

    // public method start() that match the sample input and output respectively:
    public void start(){
        System.out.println("Vehicle Brand" + brand);
        System.out.println("Vehicle Color" + color);
        System.out.println("Vehicle is starting ....");
    }
 }