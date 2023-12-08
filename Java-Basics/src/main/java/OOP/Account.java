package OOP;

import javax.swing.*;
import java.util.Random;

public class Account {

    public Account(){

        try{
            System.out.println("hi");
            throw new Exception("exception");
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }
    public String name;
    private static  int X =5;
    static {
        System.out.println("initialization of Account");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static void sss(){

    }
    static void usingStatic(){
        StaticInnerClass s = new StaticInnerClass();
        s.m();
        s.pr();
    }

    public static class StaticInnerClass {
        int s ;
        static {
            System.out.println("initialization of static inner class");
        }
        public void m(){
            System.out.println(X);
            sss();
        }
        private  void pr(){

        }
    }
}
