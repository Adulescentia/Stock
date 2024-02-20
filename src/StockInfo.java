public enum StockInfo {

    /*Stocks*/
    SAMSUNG(1000);

    /*Constructor*/
    private final int totalAmount;
    StockInfo(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    /*Methods*/
    public int getTotalAmount() {return totalAmount;}

}
