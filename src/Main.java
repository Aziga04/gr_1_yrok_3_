public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount =new BankAccount();
        System.out.println(bankAccount.deposit(30000));

        while (true){
            try {
                System.out.println(bankAccount.wichDraw(6000));
            } catch (LimitException e) {
                throw new RuntimeException(e.getMessage());
                int newAmount = (int) Math.round(e.getRemainingAmount());
                try {
                    System.out.println(bankAccount.wichDraw(newAmount));
                } catch (LimitException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            }
        }
    }

}