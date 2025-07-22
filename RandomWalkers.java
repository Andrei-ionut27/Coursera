public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        long totalSteps = 0;

        java.util.Random rand = new java.util.Random();

        for (int t = 0; t < trials; t++) {
            int x = 0;
            int y = 0;
            int steps = 0;

           while (Math.abs(x) + Math.abs(y) < r) {
               int direction = rand.nextInt(4);

               if (direction == 0) y++;
               else if (direction == 1) x++;
               else if (direction == 2) y++;
               else x--;

               steps++;
           }
              totalSteps += steps;

           }
            double averageSteps = (double)  totalSteps / trials;
        System.out.println("Average number of steps over " + trials + "trials: " + averageSteps);
        }
    }

