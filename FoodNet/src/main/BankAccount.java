package main;

public class BankAccount {
    private int AccountNumber;
    private String name;
    private int amountMoney;

    Administration administration = new Administration();

    public BankAccount(int accountNumber, String name, int amountMoney) {
        AccountNumber = accountNumber;
        this.name = name;
        this.amountMoney = amountMoney;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }
}
