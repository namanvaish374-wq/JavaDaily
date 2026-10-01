public class NAMAN {

    int a, b;
    static int x = 0;

    
    NAMAN() {
        a = 0;
        b = 0;
    }


    NAMAN(int c, int d) {
        a = c;
        b = d;
    }

   
    NAMAN(NAMAN c) {
        a = c.a;
        b = c.b;
    }

   
    int square(int a) {
        return a * 100;
    }

    void Naman() {
        System.out.println("hello");
    }

   
    static int Naitik(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        NAMAN A1 = new NAMAN();
        NAMAN a2 = new NAMAN(10, 20);
        NAMAN a3 = new NAMAN(a2);   // Copy Constructor

        System.out.println("inline function " + A1.square(3));
        A1.Naman();
        System.out.println("friend function called " + Naitik(2, 3));
    }
} 
