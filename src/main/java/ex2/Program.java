package ex2;

public class Program {
    public static void main(String[] args) {
        App app = new App();

        Account account1 = new Account("zheng", "Zheng Zu", true);
        Account account2 = new Account("ling", "Ling Fu", false);
        Account account3 = new Account("zheng", "Zheng Xu", false);

        app.registerAccount(account1);
        app.registerAccount(account2);
        app.registerAccount(account3);
        app.registerAccount(account3);

        System.out.println(app);

        app.removeAccount("ling");
        System.out.println(app);
    }
}
