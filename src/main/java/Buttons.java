import org.telegram.telegrambots.api.methods.send.SendDocument;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Buttons {

    public void setButtons(SendMessage sendMessage) {

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("Information"));

        keyboardRowList.add(keyboardFirstRow);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

    public void setButtons2(SendMessage sendMessage) {

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        keyboardSecondRow.add(new KeyboardButton("Continue"));

        keyboardRowList.add(keyboardSecondRow);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

    public void setButtons3(SendMessage sendMessage) {

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("\uD83D\uDC40"));

        keyboardRowList.add(keyboardFirstRow);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

    public void setButtons4(SendMessage sendMessage) {

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("Facts"));

        keyboardRowList.add(keyboardFirstRow);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

    public void setButtons5(SendMessage sendMessage) {

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        keyboardSecondRow.add(new KeyboardButton("❤️ "));
        keyboardSecondRow.add(new KeyboardButton("\uD83E\uDDE1"));
        keyboardSecondRow.add(new KeyboardButton("\uD83D\uDC9B"));
        keyboardSecondRow.add(new KeyboardButton("\uD83D\uDC9A"));
        keyboardSecondRow.add(new KeyboardButton("\uD83D\uDC99"));
        keyboardSecondRow.add(new KeyboardButton("Next"));

        keyboardRowList.add(keyboardSecondRow);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

    public void setButtons6(SendMessage sendMessage) {

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("Finish"));

        keyboardRowList.add(keyboardFirstRow);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

    public void setButtons7(SendMessage sendMessage) {

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("❤️\u200D\uD83D\uDD25"));

        keyboardRowList.add(keyboardFirstRow);

        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

}
