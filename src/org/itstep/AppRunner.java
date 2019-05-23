package org.itstep;

public class AppRunner {
    public static void main(String[] args) {
        User me =new User();
        me.name = "Ann";
        me.pasword = "12345";

        User you = new User();
        you.name = "Your name";
        you.pasword = "your pass";

        System.out.println("User Me has name " + me.name);
        System.out.println("User YOU has name " + you.name);
    }

}
