import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Возможные для ввода клетки:\n Болото - S \n Вода - W \n Кусты - T \n Равнина - P \n ");
        System.out.println("Введите Ваши критерии игрового поля 4х4 клетки\nТребуется 16 символов");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

            if((input.contains("S") ||input.contains("T") ||input.contains("W") ||input.contains("P") )&& input.length() ==16){
                String regex = "[A-Z]{4}+";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    System.out.println(input.substring(matcher.start(), matcher.end()).trim());
                }
            } else {
                System.out.println("Ошибка, введены неверные параметры поля");
            }
        System.out.println("Введите рассу существа \n 1 - Человек \n 2 - Болотник \n 3 - Леший");
            String playerInput = scanner.nextLine();
            if(playerInput.matches("1")){
                playerInput = "Человек";

            } if(playerInput.matches("2")){
                playerInput = "Болотник";

        } if(playerInput.matches("3")){
                playerInput = "Леший";
        }
        Solution.getReuslt(input,playerInput);

    }

}
