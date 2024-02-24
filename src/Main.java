public class Main {
    public static void main(String[] args) {
        double freq = 937.45;

        double df = freq - 936.899;
        int nCh = (int)(df / 0.2);

        //

        System.out.println("nCh = " + nCh);
    }
}