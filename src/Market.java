import java.util.ArrayList;

public class Market {

    /*Vars*/
    int tendency;
    ArrayList<Stock> stockList = new ArrayList<Stock>();
    User user = User.asset("1M");
    Stock samsung = new Stock("Samsung",100, 2, 10);



    /*Methods*/
    void testUser() {
        System.out.println(user.asset);
    } //temp
    void testStock() {System.out.println(samsung.getTotalPrice());} //temp

    void listUpStocks() {
        stockList.add(samsung);
    }
    void printStocks() {
        for (Stock stock : stockList) {
            System.out.println(stock.getName());
        }
    }
}
