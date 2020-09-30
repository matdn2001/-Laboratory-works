// Программа, которая выводит все простые числа в диапазоне от 2 до 100
public class First_laboratory_work_first_program {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        System.out.print(ANSI_YELLOW + "Все простые числа в диапазоне от 2 до 100: ");
        for (int i = 2; i < 101; i++){
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
    // Функция, определяющая число на простоту
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
