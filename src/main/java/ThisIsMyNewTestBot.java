import org.telegram.telegrambots.meta.api.objects.Update;

public class ThisIsMyNewTestBot extends MainBot implements Observer {
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
        return "My_test_8456971023_bot";
    }

    @Override
    public String getBotToken() {
        return "7286058820:AAH6py4Tuu1VrurMaPn99z1o0ufKCTN1UHo";
    }

    @Override
    public String getChatId() {
        return "303268549";
    }
}