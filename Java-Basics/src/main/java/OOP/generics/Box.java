package OOP.generics;

public class Box<E> {
    private E element;
    public void setElement(E element){
        this.element = element;
    }
    public E getElement(){
        return this.element;
    }
}
