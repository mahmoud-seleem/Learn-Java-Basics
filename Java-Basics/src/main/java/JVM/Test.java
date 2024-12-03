package JVM;

import java.io.EOFException;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        try{
            x = 50;
        pp();
      }catch(Exception e){
       
      }

    }
    public static int pp() throws EOFException{
        throw new EOFException();
    }
}


