import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Car extends IOException {

    public void  close(){
        System.out.println("Машина жабылып жатат");
    }
    public void drive(){
        System.out.println("Машина журуп жатат");
    }
}
