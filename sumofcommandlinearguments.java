public class sumofcommandlinearguments {

    public static void main(String[] args) {
        int sum =0;
        System.out.println("Calculate sum of value");

        for(int i=0;i<args.length;i++) {
            System.out.println(args[i]);
            sum = sum + Integer.parseInt(args[i]);

        }
        System.out.println("sum is:" +sum);

    }

}


