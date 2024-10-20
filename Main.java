import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String input = scanner.nextLine();
        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String calc(String input) throws Exception {
        String[] part = input.split(" ");
        if (part.length != 3) {
            throw new Exception("Неверный формат выражения");
        }

        int num1 = Integer.parseInt(part[0]);
        int num2 = Integer.parseInt(part[2]);
        String operator = part[1];

        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new Exception("Числа должны быть от 1 до 10 включительно");
        }

        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    throw new Exception("Деление на ноль");
                }
                result = num1 / num2;
                break;
            default:
                throw new Exception("Неверный оператор");
        }

        return String.valueOf(result);
    }
}





