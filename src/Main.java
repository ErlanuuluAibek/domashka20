import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileWriter fileWriter=new FileWriter("Car.txt")){
            fileWriter.write("Hello world");
            Car car=new Car();
            car.close();
            car.drive();
        }
        catch(IOException i){
            System.out.println(i.getMessage());
        }
    }
}