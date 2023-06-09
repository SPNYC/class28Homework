package class28.Homework;
/*
Create a method checkUserName that will throw a runtime exception.
Method should throw an exception when entered username is less than 5 characters.
 */
public class CheckUserName {
    public static void checkUserName(String username) {
        if (username.length() < 5) {
            throw new RuntimeException("Username is less than 5 characters");
        }
    }
    public static void main(String[] args) {
        String username = "name";

        try {
            checkUserName(username);
            System.out.println("Username is valid");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
