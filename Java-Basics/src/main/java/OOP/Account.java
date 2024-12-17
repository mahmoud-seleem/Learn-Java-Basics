package OOP;

public class Account {
    public String name;
    public Account(String name){
        this.name = name;
    }
    static{
        System.out.println("init of the outer");
    }
    public static int x;
    public static int shared = 10;
    public static void main(String[] args) {
        Account aaaaa = new Account("hi");
        aaaaa.instanceMethod();
        System.out.println(aaaaa.name);
    }
    public void mmmm(){

    }
    public void instanceMethod(){
        Account a = new Account("HHH"){
            public void mmmm() {
                System.out.println(Account.this);
                System.out.println("mmmm method from the account new class");
                System.out.println("name::::"+ name);
            }
        };
        a.mmmm();
        Account aa = new Account("HHH");
        aa.mmmm();
    }
    public static void staticinstanceMethod(){
        Account a = new Account("MMM"){
            public void mmmm() {
                System.out.println();
                System.out.println("mmmm method from the account new class");
            }
        };
        a.mmmm();
        Account aa = new Account("MMM");
        aa.mmmm();
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
