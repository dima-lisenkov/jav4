import java.util.Scanner;
import java.util.Stack;

public class proj_3 {
    

private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите пример в обратной польской записи: ");
        String str = in.nextLine();
        in.close();
        String[] strings = str.split(" ");

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                stack.push(Double.parseDouble(strings[i]));
            } else {
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();

                switch (strings[i]) {
                    case "+":
                        stack.push(tmp1 + tmp2);
                        break;
                    case "-":
                        stack.push(tmp2 - tmp1);
                        break;
                    case "/":
                        stack.push(tmp2 / tmp1);
                        break;
                    case "*":
                        stack.push(tmp1 * tmp2);
                        break;

                    default:
                        break;
                }
            }
        }
        if (!stack.empty()) {
            System.out.println("Результат: ");
            System.out.print(stack.pop());
        } else {
            System.out.println("Ошибка!");
        }
    }

    public static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}