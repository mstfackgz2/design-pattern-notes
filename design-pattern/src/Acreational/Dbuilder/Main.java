package Acreational.Dbuilder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("Ali", "Yılmaz")
                .email("ali@gmail.com")
                .phone("0532xxxxxxx")
                .build();

        user.showInfo();
    }
}
