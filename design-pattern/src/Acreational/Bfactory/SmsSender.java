package Acreational.Bfactory;

public class SmsSender implements MessageSender{
    @Override
    public void sendMessage(String to, String message) {
        System.out.println("sms "+to+ " adresine "+message+" olarak Gonderildi!");
    }
}
