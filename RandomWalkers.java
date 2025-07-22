public class RandomWalkers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RandomWalkers r trials");
            return;
        }

        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        long totalSteps = 0;

        for (int t = 0; t < trials; t++) {
            int x = 0;
            int y = 0;
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) < r) {
                double direction = Math.random();

                if (direction < 0.25) {
                    y++;  // north
                } else if (direction < 0.50) {
                    x++;  // east
                } else if (direction < 0.75) {
                    y--;  // south
                } else {
                    x--;  // west
                }

                steps++;
            }

            totalSteps += steps;
        }

        double averageSteps = (double) totalSteps / trials;
        System.out.println("average number of steps = " + averageSteps);
    }
}
