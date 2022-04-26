public class CreditPaymentService {
    public double calculate(int sumCredit, int yearsCredit, double percentCredit) {
        int countMonth = yearsCredit * 12;  // Переводим годы погашения кредита в месяцы
        double percentMonth = percentCredit / 12 /100;  // Переводим годовой процент погашения в месячный и переходим от процентов к действительным числам
        return sumCredit * (percentMonth * Math.pow((1 + percentMonth), countMonth)) /
                (Math.pow((1 + percentMonth), countMonth) - 1);
    }
}
