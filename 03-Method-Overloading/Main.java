
class Test {

    public int max(int x, int y) {
        return x > y ? x : y;
    }

    public int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        }
        return c;

    }
}
public class Main {

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.max(10, 20));
        System.out.println(t.max(10, 20, 30));
    }

}
