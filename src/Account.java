public class Account {

    private String number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(String number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withDraw(double amount) {
        validateWithDraw(amount);
        balance -= amount;
    }

    private void validateWithDraw(double amount) {
        if (amount > getWithdrawLimit()){
            throw new BusinessException("Erro de Saque: A quantia excede o limite de saque!");
        }
        if (amount > getBalance()){
            throw new BusinessException("Erro de Saque: Saldo insulficiente!");
        }
    }













}
