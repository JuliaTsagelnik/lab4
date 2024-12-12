import java.util.Scanner;

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

        // Создаем экземпляр класса FibonacciCalculator
        FibonacciCalculator calculator = new FibonacciCalculator();
        long result = calculator.calculateFibonacci(n); // Вычисляем число Фибоначчи

        // Вывод результата
        System.out.println("Число Фибоначчи F(" + n + ") = " + result);
    }
}