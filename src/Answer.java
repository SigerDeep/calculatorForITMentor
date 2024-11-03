public interface Answer {
    static int get(String quest) {
        String[] quests = quest.split(" ");
        int a = Integer.parseInt(quests[0]);
        String operation = quests[1];
        int b = Integer.parseInt(quests[2]);
        int res = 0;
        if (operation.equals("+")) { res = a + b;}
        else if (operation.equals("-")) { res = a - b;}
        else if (operation.equals("*")) { res = a * b;}
        else { res = a / b;}
        return res;
    }
}