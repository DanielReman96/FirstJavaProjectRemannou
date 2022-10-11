import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {

        out.println("Exercitiul 1: \n");
        out.println("Hello\nDaniel\n");


        out.println("Exercitiul 2: \n");
        int a = 2;
        int b = 3;
        int c = a + b;
        out.println(c);


        out.println("Exercitiul 3: \n");
        float d = 3;
        double e = 10;
        double f = e / d;
        out.println(f);

        out.println("Exercitiul 4: \n");
        int g = -5 + 8 * 6;
        out.println(g);
        int h = (55 + 9) % 9;
        out.println(h);
        float i = 20 + ((-3) * 5 / 8f);
        out.println(i);
        double j = 5 + (((15 / 3) * 2) -(8d % 3d));
        out.println(j);;

        int x = 5;
        int y = 6;
        int z = multiplication(x, y);
        out.println(z);


        float r = division(40,6.3f);
        out.println(r);
    }




    public static int multiplication(int first, int second) {
        int result = first * second;
        return result;
    }


    public static float division(int first, float second){

        float result = first / second;
        return (float) result;
    }
}

