package OOP.generics;

public class Box<E extends Number> {

       private E object;

        public E getObject() {
                return object;
        }

        public void setObject(E object) {
                this.object = object;
        }
}
