public class Main {
    public static void main(String[] args) {
        // Задача 1
        {
            int[] payments = {800, 900, 1100, 1000, 600};
            int sum = 0;
            for (int index = 0; index < payments.length; index++) {
                sum = sum + payments[index];
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        // Задача 2
        {
            int[] payments = {20, 25, 90, 85, 60};
            int maxPayments = -1;
            for (int i = 0; i < payments.length; i++) {
                if (payments[i] > maxPayments) {
                    maxPayments = payments[i];
                }
            }
            System.out.println("Максимальная сумма трат за неделю составила " + maxPayments + " рублей");
        }
        {
            int[] payments = {20, 15, 90, 85, 60};
            int maxPayments = Integer.MAX_VALUE;
            for (int i = 0; i < payments.length; i++) {
                if (payments[i] < maxPayments) {
                    maxPayments = payments[i];
                }
            }
            System.out.println("Минимальная сумма трат за неделю составила " + maxPayments + " рублей");
        }
        // Задача 3
        {
            int[] payments = {15, 25, 40, 10, 20};
            int maxPayments = 0;
            for (int i = 0; i < payments.length; i++) {
                maxPayments += payments[i];
            }
            int avg = maxPayments / payments.length;
            System.out.println("Средняя сумма затрат за месяц составила " + avg + " рублей");
        }
        //Задача 4
        {
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
            System.out.println();
        }
    }
}