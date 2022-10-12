public class BankAccount {
    private int amount;

    public int getAmount() {
        return amount;
    }
    public String deposit(int cum){
        amount =+ cum;
        return "вы  пополнили счет на :" + cum;
    }

    public String wichDraw(int cum) throws LimitException{
        if (cum >= amount ){
            throw new LimitException("вы истратили все:" + amount , amount);
        }
        amount = amount -cum;
        return "Успешно. Вы сняли 6000. осталось:" + amount;
    }
}
