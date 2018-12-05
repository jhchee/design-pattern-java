package com.vincent.fluent_builder_pattern;

public class FluentBuilderTest {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount.BankAccountBuilder("Jon", "22454453454").withEmail("jon@example.com").wantNewsletter(true).build();
        System.out.println(newAccount);
    }
}
