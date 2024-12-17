package OOP;

public class Account {
    static{
        System.out.println("init of the outer");
    }
    public static int x;
    public static int shared = 10;
    public static void main(String[] args) {
        System.out.println(Inner.x);
        Account a = new Account();
        Account.Inner inner = a.new Inner();
        //        inner.printInner();

    }
    public void instanceMethod(){
        // Inner inner = new Inner();
        System.out.println(Account.this);
    }

    public class Inner{
        private static int x = (int)Math.random() + 1;
        public static int shared = 55;
        static{
            System.out.println("init of the static inner");
        }


        public void printInner(){
            System.out.println(Account.this);
            System.out.println(this);
        }
        

    }


}
