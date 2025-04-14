package Acreational.Bfactory;

public class SmsSenderFactory extends  MessageSenderFactory{
    @Override
    public MessageSender createSender() {
        return new SmsSender();
    }
}
