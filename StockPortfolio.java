class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        // TODO
        this.buyingPrice=buyingPrice;
        this.currentPrice=buyingPrice;
        this.symbol=symbol;
        this.quantity=quantity;
        this.highestPrice=buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        // TODO
        if (newPrice<0) {
            System.out.println("new price cant be negative");
            return;
        }
        else {
            this.currentPrice = newPrice;
            if(highestPrice<newPrice){
                highestPrice=newPrice;
            }
        }

    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        return (currentPrice-buyingPrice)*quantity;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        // TODO
        return currentPrice*quantity;
    }
}