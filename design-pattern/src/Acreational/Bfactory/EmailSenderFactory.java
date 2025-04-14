package Acreational.Bfactory;

public class EmailSenderFactory extends MessageSenderFactory{
    @Override
    public MessageSender createSender() {
        return new EmailSender();
    }
}
