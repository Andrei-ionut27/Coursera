public class GeneralizedHarmonic {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        double harmonica = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonica += 1.0 / Math.pow(i, r);
        }

        System.out.println("H(" + n + ", " + r + ") = " + harmonica);

    }
}
