import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            SendMessage message = new SendMessage();
            message.setChatId(String.valueOf(chatId));
            System.out.println(messageText);

            if (messageText.equals("/start")) {
                message.setText("Привет, я простой телеграмм-бот. Напиши сюда что-нибудь");
            } else {
                message.setText("Ты написал " + messageText);
            }
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "My_test_8456971023_bot";
    }

    @Override
    public String getBotToken() {
        return "7286058820:AAH6py4Tuu1VrurMaPn99z1o0ufKCTN1UHo";
    }

    public static void main(String[] args) {
       try {
           TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
           botsApi.registerBot(new Main());
           System.out.println("Бот запущен");

       } catch (TelegramApiException e) {
           e.printStackTrace();
       }
    }
}