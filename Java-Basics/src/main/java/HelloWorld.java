import out.Outer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Path path = Paths.get("");
        Files.exists(path);
    }
    private String name;
    public void setName(String name) throws Throwable {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static void printArray2(int... elements){
        for(int x : elements){
            System.out.println(x);
        }
    }
    public static void printArray(int[] elements){
        for(int x : elements){
            System.out.println(x);
        }
    }


}

