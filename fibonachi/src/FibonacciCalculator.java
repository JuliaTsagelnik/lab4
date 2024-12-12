public class FibonacciCalculator {
    // Метод для вычисления F(n)
    public long calculateFibonacci(int n) {
        // Проверка случаев n = 0 и n = 1
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Инициализация первых значений последовательности
        long prev = 0;
        long curr = 1;

        // Вычисление F(n) с помощью цикла
        for (int i = 2; i <= n; i++) {
            long next = prev + curr; // Считаем следующее число
            prev = curr;             // Обновляем предыдущее значение
            curr = next;             // Обновляем текущее значение
        }

        return curr; // Возвращаем результат
    }
}
