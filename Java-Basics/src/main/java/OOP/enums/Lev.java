package OOP.enums;

public enum Lev  {
    HIGH(10){
        @Override
        public void print() {

        }
    },MEDIUM(5){
        @Override
        public void print() {

        }
    },LOW(1){
        @Override
        public void print() {

        }
    };

    private int levelNumber;
    Lev(int levelNumber){
        this.levelNumber = levelNumber;
    }
    public void setLevelNumber(int levelNumber){
        this.levelNumber = levelNumber;
    }
    public int getLevelNumber(){
        return this.levelNumber;
    }
    public abstract void print();

}
