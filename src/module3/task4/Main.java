package module3.task4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Name", 1000000, 6, "Company", 15000, "USD");
        System.out.println(user.withdraw(5));
    }
}
