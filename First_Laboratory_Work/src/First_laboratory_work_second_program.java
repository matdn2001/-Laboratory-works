import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Программа, которая проверяет строку на палиндром
public class First_laboratory_work_second_program {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите массив аргументов через пробел: ");
        String s = reader.readLine();
        String[] start = s.split(" ");
        System.out.print(ANSI_YELLOW + "Результаты проверки для каждого аргумента: ");
        for (int i = 0; i < start.length; i++){
            if (isPalindrome(start[i]))
                System.out.println(start[i] + " является палиндромом ");
            else
                System.out.println(start[i] + " не является палиндромом ");
        }
    }
    // Функция, переворачивающая строку
    public static String reverseString(String s){
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--)
            result += s.charAt(i);
        return result;
    }
    // Функция проверки на палиндром
    public static boolean isPalindrome(String s){
        if (s.equals(reverseString(s)))
            return true;
        else
            return false;
    }
}
