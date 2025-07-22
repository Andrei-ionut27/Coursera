public class CMYKtoRGB {
    public static void main(String[] args) {
 double cyan = Double.parseDouble(args[0]);
 double mangenta = Double.parseDouble(args[1]);
 double yellow = Double.parseDouble(args[2]);
 double black = Double.parseDouble(args[3]);

 double white = 1 - black;
 int red = (int) Math.round(255 * white * (1- cyan));
 int green = (int) Math.round(255 * white* (1 - mangenta));
 int blue = (int) Math.round(255 * white * (1 - yellow));


 System.out.println("Red: " + red);
 System.out.println("Green: " + green);
 System.out.println("blue: " + blue);
    }
}