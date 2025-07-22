public class RandomWalker {
    public static void main(String[] args) {
        int stepsToTake = 15;  // fixed number of steps
        int x = 0;
        int y = 0;

        System.out.println("(" + x + ", " + y + ")");  // starting point

        for (int step = 1; step <= stepsToTake; step++) {
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

            System.out.println("(" + x + ", " + y + ")");
        }

        System.out.println("Total steps = " + stepsToTake);
    }
}
