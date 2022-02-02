
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    public void sendMsg(Message message, String text) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
//        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);

        try {
            Buttons buttons = new Buttons();
            buttons.setButtons(sendMessage);
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public void sendMsg2(Message message, String text) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);

        try {
            Buttons buttons = new Buttons();
            buttons.setButtons2(sendMessage);
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public void sendMsg3(Message message, String text) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);

        try {
            Buttons buttons = new Buttons();
            buttons.setButtons3(sendMessage);
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public void sendMsg4(Message message, String text) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);

        try {
            Buttons buttons = new Buttons();
            buttons.setButtons4(sendMessage);
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public void sendMsg5(Message message, String text) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);

        try {
            Buttons buttons = new Buttons();
            buttons.setButtons5(sendMessage);
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public void sendMsg6(Message message, String text) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);

        try {
            Buttons buttons = new Buttons();
            buttons.setButtons6(sendMessage);
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public void sendMsg7(Message message, String text) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);

        try {
            Buttons buttons = new Buttons();
            buttons.setButtons7(sendMessage);
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpdateReceived(Update update) {

        Message message = update.getMessage();

        Integer private_bot = message.getFrom().getId();

        System.out.println(private_bot);

        //---------------------------------------

//        if (message.getFrom().getId().equals(67332)) {

            if (message != null && message.hasText()) {

                if (Character.isDigit(message.getText().charAt(0))) {

                } else {

                    switch (message.getText()) {

                        case "/start":

                            sendMsg(message, "Привет, Ляман ♊️ \n\n" +
                                    "Для получения информации о даном боте нажми на кноку 'Information' ");

                            break;

                        //------------------- COMMANDS -------------------------------------------------

                        case "Information":

                            sendMsg2(message, "Я - телеграмм бот,созданный Мурадом специально для тебя,Лямка ❤️ \n \n " +
                                    "\uD83D\uDDD3️7 декабря,Мы впервые увиделись в ADNSU и начали прогулку в сторону торговой. \n \n" +
                                    "Интересный факт : Когда прощались,ты спросила у Няргиз мой знак задиака,после чего она спросила у меня и получила ответ,который ей не понравился - Дева ♍️\n" +
                                    "Затем она передала мой ответ тебе,но к сожалению Я не увидел твою реакцию \uD83E\uDD72 \n\n"+
                                    "\uD83D\uDDD3️ В 24.12.2021 в 18:00 в торговом центре 28, Я предложил тебе стать парой,на что ты ответила : 'Согласна !' \uD83E\uDD73 \n \n " +
                                    "Продолжим ? \n " +
                                    "Нажимай на 'Continue' " );

                            break;

                        //------------------- COMMANDS -------------------------------------------------

                        case "Continue":

                            sendMsg3(message, "Возможно с даты нашего знакомства прошло немного времени,но уже могу сказать пару фактов \uD83D\uDE01 \n \n" +
                                    "Для продолжения нажми на \uD83D\uDC40 ");

                            break;

                        //------------------- LIST -------------------------------------------------


                        case "\uD83D\uDC40":

                                sendMsg4(message,"Нажми на 'Facts' и выбирай. \n" +
                                "А после окончания нажми на 'Next' ");

                            break;

                        // --------------------------------------------------------------------------

                        case "Facts":

                            sendMsg5(message, "Выбирай: \n " +
                                    "❤️ \n " +
                                    "\uD83E\uDDE1 \n " +
                                    "\uD83D\uDC9B \n " +
                                    "\uD83D\uDC9A \n " +
                                    "\uD83D\uDC99 \n ");

                            break;

                        // --------------------------------------------------------------------------

                        case "❤️":

                            sendMsg5(message, "Ты сногшибательно красивая,у тебя нереально красивая улыбка,которая сводит меня с ума ❤️");

                            break;

                        //----------------------------------------------------------------------------

                        case "\uD83E\uDDE1":

                            sendMsg5(message, "СОБСТВЕННИЦА ! \n" +
                                    "Надеюсь мои подруги не пострадают из-за твоей ревности \uD83D\uDE42");

                            break;

                        //----------------------------------------------------------------------------

                        case "\uD83D\uDC9B":

                            sendMsg5(message, "У тебя очень милые глаза (несмотря на то что они цвета гАвна \uD83D\uDE02)");

                            break;

                        //----------------------------------------------------------------------------

                        case "\uD83D\uDC9A":

                            sendMsg5(message, "В жизни еще не говорил про это,но твои стрелки просто нечто,они всегда восхитительны. \n" +
                                    "И да,я любуюсь не твоими глазами,а твоими стрелками \n \n" +
                                    "СТОЙ,НЕ КУСАЙ И НЕ БЕЙ,ЭТО ВСЕГО ЛИШЬ МОЯ ОЧЕРЕДНАЯ ГЛУПАЯ ШУТКА ! ❣️");

                            break;

                        //----------------------------------------------------------------------------

                        case "\uD83D\uDC99":

                            sendMsg5(message, "Каждый раз удивляюсь,как столько тараканов умещается у тебя в голове,ибо только из-за них ты можешь петь песни всю дорогу и разговаривать сама собой \uD83D\uDE02\uD83D\uDE02\uD83D\uDE02 \n \n" +
                                    "Но это не мешает мне любоваться тобой,а наоборот делает тебя всё больше особенной \uD83D\uDC95 ");

                            break;

                        //----------------------------------------------------------------------------

                        case "Next":

                            sendMsg6(message, "За столь короткое время Я сильно привязался к тебе,с каждой встречой всё больше влюбляюсь в тебя \uD83D\uDC9D \n \n" +
                                    "Своим присутствием в твоей жизни буду делать тебя только счастливой \uD83D\uDC9E \n \n" +
                                    "С наступающим, желаю счастливых и крепких нам отношений \uD83C\uDF84  \n \n" +
                                    "Нажми на 'Finish' ");

                            break;

                        //----------------------------------------------------------------------------

                        case "Finish":

                            sendMsg7(message, "Надеюсь ты улыбалась когда читала всё что сверху (или же мои бессонные ночи уйдут просто впустую \uD83E\uDD72) \n\n" +
                                    "И да,к моему счастью \uD83D\uDE42,благодарность принимается только в виде поцелуя \uD83D\uDD1E  \n \n" +
                                    "Погоди,закрой глаза и получишь второй подарок \uD83C\uDF81 \n \n" +
                                    "Я по уши влюблен в тебя ❤️\n \n" +
                                    "Телеграмм бот завершает свою работу \uD83E\uDDA6 \n \n " +
                                    "Baby, love you ❤️ ");

                            break;

                        //----------------------------------------------------------------------------

                        case "❤️\u200D\uD83D\uDD25":

                            sendMsg7(message, "❤️\u200D\uD83D\uDD25");

                            break;

                        //----------------------------------------------------------------------------

                        default:

                            sendMsg(message, "I am sorry,but I can not understand you, Lyaman \uD83D\uDC94");

                    }

                }

            }

        }

//    }

    //---------------------------------------------------------------------------------------------

    public String getBotUsername() {
        return "lyamanka_bot";
    }

    public String getBotToken() {
        return "5096675386:AAFuS6ukL0BoHYjzthIr8EdAYRH_hwBubmk";
    }

}
