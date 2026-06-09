public class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        int totalBonus = 10000;
        int employees = 0;

        try {
            int bonusPerEmployee = totalBonus / employees;
            System.out.println("Bonus Per Employee: " + bonusPerEmployee);
        }
        catch (ArithmeticException e) {
            System.out.println("Employee count cannot be zero.");
        }
    }
}
