public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int pay = 1100;
        int bonus;
        if (pay > 1000) {
            bonus = (pay / 100);
        } else {
            bonus = 0;
        }
        int finalBalance = balance + pay + bonus;

        System.out.println("Баланс: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}