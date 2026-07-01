interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    public int square(int n) {
        return n * n;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();

        int result = a.square(5);

        System.out.println("Square = " + result);
    }
}