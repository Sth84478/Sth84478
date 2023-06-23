
public class Main {
    public static void main(String[] args) {
        int i = 10;
        try {
            System.out.println("Apple");
            if (i > 0) {
                throw new IllegalArgumentException();
            }
            System.out.println("Banana");
        } catch (IllegalArgumentException e) {
            System.out.println("Coconut");
        } catch (Exception e) {
            System.out.println("Donut");
        } finally {
            System.out.println("Egg");
        }

        System.out.println("Flour");
    }


}