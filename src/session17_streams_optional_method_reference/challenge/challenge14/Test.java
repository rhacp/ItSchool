package session17_streams_optional_method_reference.challenge.challenge14;

public class Test {

    public static void main(String[] args) {
        int x = 5;
        int y = ++x;
        int z = x++;
        int q =x;
        System.out.println(q);
        System.out.println(z);
        System.out.println(y);
        System.out.println(++x + x++);
//        System.out.println(y);

        int i=0;
        while(i++ < 2) {
            System.out.println(i + " ");
        }
    }

}
