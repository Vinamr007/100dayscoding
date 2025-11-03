public class method {
    public static void main(String[] args) {
        sayhello("vinu");
        System.out.println("the sum is " + add(5, 10));
    }
    private static void sayhello(String name){
        System.out.println("hello "+name);
        System.out.println("welcome to methods in java");
    }
    private static int add(int a,int b){
        return a+b;
    }
}
