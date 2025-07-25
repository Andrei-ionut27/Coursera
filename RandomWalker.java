public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;

        System.out.println("(" + x + ", " + y + ")");

        // Continue until Manhattan distance == r
        while (true) {
            // Calculate Manhattan distance using conditionals only
            int dx = x;
            if (dx < 0) dx = -dx;

            int dy = y;
            if (dy < 0) dy = -dy;

            int manhattan = dx + dy;
            if (manhattan >= r) {
                break;
            }

//            // Generate a random number between 0 and 1 using Math.random()
//            double rand = Math.random();
//
//            // Use conditionals to pick direction
//            if (rand < 0.25) {
//                x = x + 1;  // East
//            } else if (rand < 0.50) {
//                x = x - 1;  // West
//            } else if (rand < 0.75) {
//                y = y + 1;  // North
//            } else {
//                y = y - 1;  // South
//            }
//
//            steps = steps + 1;
//            System.out.println("(" + x + ", " + y + ")");
//        }
//
//        System.out.print("steps = ");
//        System.out.println(steps);
//    }
//}