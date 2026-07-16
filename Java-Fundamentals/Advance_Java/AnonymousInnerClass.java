class A1 {
    public void show() {
        System.out.println("In A1 show");
    }
}

public class AnonymousInnerClass {
    public static void main(String args[]) {
        A1 obj = new A1() {
            public void show() {
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}
// NOTE:- A class with no Name is Called Anonymous class
// with In the AnonymousInnerClass Mentioned above there is a class defined
// along with the object this class is called Anonymous Inner class