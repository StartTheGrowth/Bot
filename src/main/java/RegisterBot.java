import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class RegisterBot implements Observable {
    public RegisterBot() {
    }
    private String text = " ";
    Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
    ArrayList<Observer> bots;
    public void setBots(ArrayList<Observer> bots) {
        this.bots = bots;
    }
    public void register() {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            for (int i = 0; i < bots.size(); i++) {
                botsApi.registerBot((LongPollingBot) bots.get(i));
            }
            System.out.println("Бот запущен");

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        while (true) {
            if (scanner.hasNextLine()) {
                text = scanner.nextLine();
                for (int i = 0; i < bots.size(); i++) {
                    bots.get(i).sendMsg(text);
                }
            }
        }
    }
}