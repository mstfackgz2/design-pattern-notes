package Acreational.Bfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mesaj türü (email/sms): ");
        String type = sc.nextLine();

        MessageSenderFactory factory;
        if (type.equalsIgnoreCase("email")) {
            factory = new EmailSenderFactory();
        }else {
            factory = new SmsSenderFactory();
        }

        MessageSender sender = factory.createSender();

        sender.sendMessage("Ali","Naber");




    }
}
