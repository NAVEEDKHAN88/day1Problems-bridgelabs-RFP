public class staticVariableMethod {
    static int a = 10;
    static int b=20; // Static variable
    static int c;

    static void fun(int c){     // Static function
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }
    public static void main(String[] args) {

        fun(9);
    }
}
