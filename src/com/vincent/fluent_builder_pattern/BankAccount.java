package com.vincent.fluent_builder_pattern;

public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private BankAccount(BankAccountBuilder builder) {
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
        this.newsletter = builder.newsletter;
    }

    @Override
    public String toString() {
        return this.name + " " + this.accountNumber + " " + this.email + " " + this.newsletter;
    }

    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        // mandatory field
        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        // optional field
        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        // optional field
        public BankAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
