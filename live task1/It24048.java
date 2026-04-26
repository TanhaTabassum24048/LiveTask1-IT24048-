public class It24048 {   //class named IT24048 containing the main() method.
    public static void main(String[] abs){

        for(int i=0 ; i<abs.length ; i+=2){
            //command line arguments to create objects.
                String brand = abs[i];
                String color = abs[i+1];
                //arguments represents brand and color. Input pairs seperated by space
                Vehicle v1 = new Vehicle(brand , color);
                v1.start();
        }

    }
}