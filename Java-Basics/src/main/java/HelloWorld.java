import OOP.serialization.Acc;
import out.Outer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream outputStream =
//                new ObjectOutputStream(
//                        Files.newOutputStream(
//                                Paths.get("D:\\backend-development\\JAVA\\test\\test.ser")));

        ObjectInputStream inputStream =
                new ObjectInputStream(
                        Files.newInputStream(
                                Paths.get("D:\\backend-development\\JAVA\\test\\test.ser")));

//        Acc acc = new Acc();
//        outputStream.writeObject(acc);
    Acc acc =(Acc)inputStream.readObject();
        System.out.println("age : " +acc.getAge());
        System.out.println("name : " +acc.getName());
        System.out.println("salary : " +acc.getSalary());
    }
}

