import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа n
        System.out.print("Введите номер числа Фибоначчи (n >= 0): ");
        int n = scanner.nextInt();

        // Проверка на неотрицательность n
        if (n < 0) {
            System.out.println("Ошибка: номер должен быть неотрицательным.");
            return;
        }

        // Проверка случаев n = 0 и n = 1
        if (n == 0) {
            System.out.println("Число Фибоначчи F(" + n + ") = 0");
            return;
        } else if (n == 1) {
            System.out.println("Число Фибоначчи F(" + n + ") = 1");
            return;
        }

        // Инициализация первых значений последовательности
        long prev = 0;
        long curr = 1;

        // Вычисление F(n) с помощью цикла
        for (int i = 2; i <= n; i++) {
            long next = prev + curr; // Считаем следующее число
            prev = curr;             // Обновляем предыдущее значение
            curr = next;             // Обновляем текущее значение
        }

        // Вывод результата
        System.out.println("Число Фибоначчи F(" + n + ") = " + curr);
    }
}