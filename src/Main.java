import java.util.Scanner;

public class Main implements Answer{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);){
            String quest = scanner.nextLine();
            WrongQuestCatcher wrongQuestCatcher = new WrongQuestCatcher();
            try{
                wrongQuestCatcher.isRight(quest);
            } catch (QuestException e) {
                throw new RuntimeException(e);
            }

            int answer = Answer.get(quest);
            System.out.println(answer);
        }
    }
}