public class Main {
    static int a = 30;
    static int b;
    static int c;
    static{
        System.out.println("1st block");
        b = a + 10;
    }
    static{
        System.out.println("2nd block");
        c = 50;
    }
    static void show(){
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
    }

    public static void main(String[] args) {
        show();
    }
}