package Model.Entities;

public class Reservation {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Reservation(){
    };

    public Reservation(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    } 

    public Integer getNumber(){
        return number;
    }

    public String getHolder(){
        return holder;
    }

    public Double getBalance(){
        return balance;
    }

    public Double getLimit(){
        return withdrawLimit;
    }

    public void setLimit(Double withdrawLimit){
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double deposit){
        balance += deposit;
    }

    public void withdraw(Double withdraw){
        if (withdraw > withdrawLimit){
            throw new IllegalArgumentException("Withdraw error: The amount exceeds withdraw limit");
        }
        else if (balance - withdraw < 0){
            throw new IllegalAccessError("Withdraw error: Not enough balance");
        }
        balance -= withdraw;
    }
}