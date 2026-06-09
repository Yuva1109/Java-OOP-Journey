public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String employeeName = null;

        try {
            System.out.println(employeeName.toUpperCase());
        }
        catch (NullPointerException e) {
            System.out.println("Employee name is missing.");
        }
    }
}
