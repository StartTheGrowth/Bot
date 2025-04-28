import org.telegram.telegrambots.meta.api.objects.Update;

public class ThisIsMySecondTestBot extends MainBot implements Observer {
    @Override
    public void onUpdateReceived(Update update) {
        super.onUpdateReceived(update);
    }

    @Override
    public void sendMsg(String message) {
        super.sendMsg(message);
    }

    @Override
    public String getBotUsername() {
        return "My_test_845697546_bot";
    }

    @Override
    public String getBotToken() {
        return "7677511786:AAEtxFpkIC4j7vCsyB5WNqN_uT5gWW_L8zY";
    }

    @Override
    public String getChatId() {
        return "303268549";
    }
}