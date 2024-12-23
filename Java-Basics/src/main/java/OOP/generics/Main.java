package OOP.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private Object object;
    public void setObject(Object object){
        this.object = object;
    }
    public Object getObject(){
        return this.object;
    }

    public static void main(String[] args) {
            Main m = new Main();
            m.setObject("hi");
            int x = (int) m.getObject();
    }
}

