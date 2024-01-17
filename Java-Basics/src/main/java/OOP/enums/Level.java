package OOP.enums;

public abstract class Level{
        public static final Level HIGH = new Level(10){
                @Override
                public void print() {
                        System.out.println("HIGH LEVEL : "+this.getLevelNumber());
                        System.out.println(this.getClass().getName());
                }
        };
        public static final Level MEDIUM = new Level(5){
                @Override
                public void print() {
                        System.out.println("MEDIUM LEVEL :"+this.getLevelNumber());
                        System.out.println(this.getClass().getName());
                }
        };
        public static final Level LOW = new Level(1){
                @Override
                public void print() {
                        System.out.println("LOW LEVEL :"+this.getLevelNumber());
                }
        };
        private int levelNumber;
        private Level(int levelNumber){
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

