public class EvklidRecursion {

    public static int run(int a, int b) {
        if (a==b) return a;
        if (a > b)  return run(b, a-b);
        if (a < b) return run(a, b-a);
        return 0;
        }
}
