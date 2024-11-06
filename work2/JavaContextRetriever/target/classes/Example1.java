interface Shape {
    void draw();
}
// SSA version:
//public class Example1 {
//    public static void main(String[] v1) {
//        int v3 = 0;
//        String v4 = v1[v3];
//        int v6 = Integer.parseInt(v4);
//        int v7 = 2;
//        int v8 = v6 % v7;
//
//        if ( v8 == v3 ) {
//            v11 = new Circle();
//        } else {
//            v9 = new Rectangle();
//        }
//        Shape v13 = Φ(v11, v9);
//        v13.draw();
//    }
//}

// javac Example1.java --release 8 && jar cvf Example1.jar *.class && rm *.class
public class Example1 {
    public static void main(String[] args) {
        Shape s;
        // is even?
        if (Integer.parseInt(args[0]) % 2 == 0) {
            s = new Circle();
        } else {
            s = new Rectangle();
        }
        s.draw();
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Draw Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Draw Triangle");
    }
}