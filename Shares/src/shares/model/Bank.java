package shares.model;

public class Bank {
    
    private double cash;
    private double bankAcc;
    private double depositAcc;
    
    public Bank(double cash, double bankAcc, double depositAcc){
        
        this.cash = cash;
        this.bankAcc = bankAcc;
        this.depositAcc = depositAcc;
    }

    /**
     * @return the cash
     */
    public double getCash() {
        return cash;
    }

    /**
     * @return the bankAcc
     */
    public double getBankAcc() {
        return bankAcc;
    }

    /**
     * @return the depositAcc
     */
    public double getDepositAcc() {
        return depositAcc;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(double cash) {
        
        if(cash < 0){
            cash = 0;
        }
        
        this.cash = cash;
    }

    /**
     * @param bankAcc the bankAcc to set
     */
    public void setBankAcc(double bankAcc) {
        this.bankAcc = bankAcc;
    }

    /**
     * @param depositAcc the depositAcc to set
     */
    public void setDepositAcc(double depositAcc) {
        this.depositAcc = depositAcc;
    }
    
    
    
}
