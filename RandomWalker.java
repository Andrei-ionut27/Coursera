public class RandomWalker {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;

        System.out.println("(" + x + ", " + y + ")");
        java.util.Random rand = new java.util.Random();

        while (Math.abs(x) + Math.abs(y) < r) {
            int direction = rand.nextInt(4);

            if (direction == 0) {
                y++;
            }else if (direction == 1) {
                x++;
            } else if (direction == 2) {
                y--;
            }else {
                x--;
            }
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("Total steps = " + steps);
    }
}
