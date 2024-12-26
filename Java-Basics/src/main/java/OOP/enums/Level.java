package OOP.enums;

public abstract class Level {
        public enum Coin {
                NICKEL(5) {
                        @Override
                        int toCoins(int pennies) {
                                return 0;
                        }
                }, // constants must appear first
                DIME(10),
                QUARTER(25),
                DOLLAR(100); // the semicolon is required

                private final int valueInPennies;

                Coin(int valueInPennies) {
                        this.valueInPennies = valueInPennies;
                }

                int toCoins(int pennies) {
                        return pennies / valueInPennies;
                }

                public static boolean p() {
                        return true;
                }

        }

        public static void main(String[] args) {
                Coin c = Coin.DIME;
                switch (c) {
                        case NICKEL:
                                break;
                        case DIME:
                                break;
                        case QUARTER:
                                break;
                        case DOLLAR:
                                break;
                        default:
                                break;
                }
        }

        public static final Level HIGH = new Level(10) {
                @Override
                public void print() {
                        System.out.println("HIGH LEVEL : " + this.getLevelNumber());
                        System.out.println(this.getClass().getName());
                }
        };
        public static final Level MEDIUM = new Level(5) {
                @Override
                public void print() {
                        System.out.println("MEDIUM LEVEL :" + this.getLevelNumber());
                        System.out.println(this.getClass().getName());
                }
        };
        public static final Level LOW = new Level(1) {
                @Override
                public void print() {
                        System.out.println("LOW LEVEL :" + this.getLevelNumber());
                }
        };
        private int levelNumber;

        private Level(int levelNumber) {
                this.levelNumber = levelNumber;
        }

        public void setLevelNumber(int levelNumber) {
                this.levelNumber = levelNumber;
        }

        public int getLevelNumber() {
                return this.levelNumber;
        }

        public abstract void print();

}
 
