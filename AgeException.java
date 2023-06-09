package class28.Homework;
/*
Create a method to check age eligibility that will throw a runtime exception.
Method should throw an exception age is less than 16.
 */
public class AgeException {
    public static void checkAge(int age) {
        if (age < 16) {
            throw new RuntimeException("Not eligible");
        }
    }

    public static void main(String[] args) {
        int age = 13;

        try {
            checkAge(age);
            System.out.println("Eligible");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
