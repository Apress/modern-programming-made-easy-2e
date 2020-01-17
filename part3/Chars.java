
public class Chars {

    public static void main(String...args) {
    
        System.out.print("20:");
        for (int c = 20; c < 12000; c++) {
            System.out.print(c % 100 == 0 ? ("\n" + c + ":") : "" + (char) c);
        }
        System.out.println();
    }
    
}
