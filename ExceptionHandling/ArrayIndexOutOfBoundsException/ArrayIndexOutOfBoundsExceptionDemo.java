public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {

        String[] products = {"Laptop", "Mouse", "Keyboard"};

        try {
            System.out.println("Selected Product: " + products[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Product does not exist in the cart.");
        }
    }
}
