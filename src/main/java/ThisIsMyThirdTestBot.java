import org.telegram.telegrambots.meta.api.objects.Update;

public class ThisIsMyThirdTestBot extends MainBot implements Observer{
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
        return "My_test_8745210_bot";
    }

    @Override
    public String getBotToken() {
        return "7381240399:AAHsSFFxFavb9x_WU9wUqWwb4RseFwi8qdI";
    }

    @Override
    public String getChatId() {
        return "303268549";
    }
}
