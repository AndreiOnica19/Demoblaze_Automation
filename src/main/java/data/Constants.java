package data;

import com.github.javafaker.Faker;

public class Constants {
    public static String generateRandomEmail() {
        Faker faker = new Faker();
        return faker.bothify("????##@gmail.com");
    }

    public static final String NAME = "Onica Andrei";
    public static final String CITY = "Bucharest";
    public static final String COUNTRY = "Romania";
    public static final String CARD = "4646 4646 4646 4646";
    public static final String CARD_MONTH = "May";
    public static final String CARD_YEAR = "2024";
    public static final String EXPECTED_MESSAGE = "Sign up successful.";
    public static final String THANK_YOU_MESSAGE = "Thank you for your purchase!";
    public static final String PASSWORD = "onica3000";
}
