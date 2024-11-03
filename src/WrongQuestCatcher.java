public class WrongQuestCatcher{
    public void isRight(String quest) throws QuestException{
        String[] quests = quest.split(" ");
        int a = Integer.parseInt(quests[0]);
        String operation = quests[1];
        int b = Integer.parseInt(quests[2]);

        if (!quest.matches("\\d{1,2}\\s\\W\\s\\d{1,2}") ||
                !(a > 0 && a < 11 && b > 0 && b < 11 && "+-*/".contains(operation))) {
            throw new QuestException("Неверный ввод");
        }
    }
}
