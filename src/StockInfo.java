import java.util.HashMap;

public enum StockInfo {

    /*Stocks*/
    SAMSUNG(1,1000,1);

    /*Constructor*/
    private final int outstandingStocks;
    private final int charge;
    private final int identificationNumber;
    StockInfo(int identificationNumber, int outstandingStocks, int charge) {
        this.identificationNumber = identificationNumber;
        this.outstandingStocks = outstandingStocks;
        this.charge = charge;
    }

    /*Methods*/
    public int getTotalAmount() {return outstandingStocks;}
    public int getCharge() {return charge;}
    public int getIdentificationNumber() {return identificationNumber;}
}
