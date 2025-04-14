package Acreational.Bfactory;

public class EmailSender implements MessageSender{

    @Override
    public void sendMessage(String to, String message) {
        System.out.println("mail "+to+ " adresine "+message+" olarak Gonderildi!");
    }
}
