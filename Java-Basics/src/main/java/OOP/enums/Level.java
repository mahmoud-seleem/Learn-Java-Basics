package OOP.enums;

public enum Level {
    HIGH(){
        @Override
        public void m(){
            System.out.println(HIGH);
        }
    };

    public abstract void m();
}
