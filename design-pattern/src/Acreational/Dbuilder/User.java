package Acreational.Dbuilder;

public class User {

    // zorunlu kisimlar
    private String name;
    private String lastName;

    // zorunlu olmayan kisimlar
    private String email;
    private String phone;
    private String address;
    private int age;


    public static class Builder{
        //zorunlu olanlar
        private String name;
        private String lastName;

        // zorunlu olmayan kisimlar
        private String email;
        private String phone;
        private String address;
        private int age;

        public Builder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }







    private User(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.email =builder. email;
        this.phone = builder.phone;
        this.address =builder.address;
        this.age = builder.age;
    }

    public void showInfo() {
        System.out.println("Ad: " + name);
        System.out.println("Soyad: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Telefon: " + phone);
        System.out.println("Adres: " + address);
        System.out.println("Yaş: " + age);
    }
}
