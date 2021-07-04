public class Demo01 {
    public static void main(String[] args) {
        System.out.println("hello");
        long i = 128000000L;
        System.out.println(i);
        int a = 10;
        int b = 20;
        a = a+b;
        System.out.println("a"+a);
        a+=b;
        System.out.println("a"+a);

        String a1 = "hello";
        String b1 = " world";
        a1 = b1+a1;
        System.out.println(a1);
        a1 += b1;
        System.out.println(a1);
    }
}
