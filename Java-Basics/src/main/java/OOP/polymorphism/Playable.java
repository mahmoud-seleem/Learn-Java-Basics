package OOP.polymorphism;

public interface Playable {
     void play();
     default void mm(){
          plll();
     };
      static void mmmm(){

     }
     private void plll(){
          System.out.println("hello");
     }
     int x  = 5;
}
