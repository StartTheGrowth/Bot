import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Observer>bots = new ArrayList<>();
        ThisIsMyNewTestBot testBot = new ThisIsMyNewTestBot();
        ThisIsMySecondTestBot testBot1 = new ThisIsMySecondTestBot();
        ThisIsMyThirdTestBot testBot2 = new ThisIsMyThirdTestBot();
        bots.add(testBot);
        bots.add(testBot1);
        bots.add(testBot2);
        RegisterBot registerBot = new RegisterBot();
        registerBot.setBots(bots);
        registerBot.register();
    }
}