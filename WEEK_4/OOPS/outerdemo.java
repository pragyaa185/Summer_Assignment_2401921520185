class Outer {

    void display() {
        System.out.println("This is Outer Class");
    }

    class Inner {

        void display() {
            System.out.println("This is Inner Class");
        }
    }
}

public class OuterDemo {
    public static void main(String[] args) {

        Outer o = new Outer();
        o.display();

        Outer.Inner i = o.new Inner();
        i.display();
    }
}