package abstracttion;

public abstract class Bank {

    public void offerLoan(){
        System.out.println("Bank is offering loan");
    }

    public abstract void loanInterest();
}
