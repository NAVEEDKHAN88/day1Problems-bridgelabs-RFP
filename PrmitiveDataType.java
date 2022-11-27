public class PrmitiveDataType {

    boolean n;
    byte a;
    short v;
    int i;
    long d;
    float k;
    double h;
    String p;

    public void dataTypes() {
        System.out.println("boolean default value is :" + n);
        System.out.println("byte default value is :" + a);
        System.out.println("short default value is :" + v);
        System.out.println("int default value is :" + i);
        System.out.println("long default value is :" + d);
        System.out.println("float default value is :" + k);
        System.out.println("double default value is :" + h);
        System.out.println("String default value is :" + p);

        System.out.println("Finish ....");
    }


    public static void main(String[] args) {
        PrmitiveDataType l=new PrmitiveDataType();
        System.out.println("Default values are......");
        l.dataTypes();
    }
}