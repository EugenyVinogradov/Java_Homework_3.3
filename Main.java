public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sumCredit = 1000_000;
        double percentCredit = 9.99;
        int yearsCredit = 1;
        int montPayment1 = (int) service.calculate(sumCredit, yearsCredit,percentCredit);
        System.out.println("При сроке погашения кредита " + yearsCredit +
                " год ежемесячный платеж составляет " + montPayment1 + " руб.");
        int yearsCredit2 = 2;
        int montPayment = (int) service.calculate(sumCredit, yearsCredit2,percentCredit);
        System.out.println("При сроке погашения кредита " + yearsCredit2 +
                " года ежемесячный платеж составляет " + montPayment + " руб.");
        int yearsCredit3 = 3;
        int montPayment3 = (int) service.calculate(sumCredit, yearsCredit3,percentCredit);
        System.out.println("При сроке погашения кредита " + yearsCredit3 +
                " года ежемесячный платеж составляет " + montPayment + " руб.");
    }
}
