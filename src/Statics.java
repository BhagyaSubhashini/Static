public class Statics {
    int multiply(int a,int b){
        return a*b;
    }
    static int sum(int a,int b){
        return a+b;
    }
}
class Test{
    public static void main(String[] args) {
        Statics s = new Statics();
        System.out.println("4 x 8 = "+ s.multiply(4,8));
        System.out.println("4 + 8 = "+ Statics.sum(4,8));
    }
}