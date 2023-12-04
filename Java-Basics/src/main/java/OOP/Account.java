package OOP;

import javax.swing.*;
import java.util.Random;

public class Account {

    public Account(){
        System.out.println("hi");
        try{
            throw new Exception("exception");
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }
    public String name;
    public static final int X =5;
    static {
        System.out.println("initialization of Account");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
