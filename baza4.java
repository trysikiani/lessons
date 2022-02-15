public class baza4 {
    public static void main(String[] args) {
        String a = "(()()";
        int x = 0;
        for (int i = 0; i < a.length(); i++) {
            if (x < 0) {
                System.out.println("neyspex");
            }
            String a2 = a.substring(i, i + 1);
            if (a2.contains("(")) {
                x++;
            } else {
                x--;
            }
        }
        if (x == 0) {
            System.out.println("yspex");
        } else {
            System.out.println("neysp");
        }
    }
}
