import java.util.ArrayList;

public class Market {
    int tendency;
    ArrayList<Stock> stockList;
    User user = User.asset("1M");
    Samsung samsung = new Samsung(100, 2, 10);
    void testUser() {
        System.out.println(user.asset);
    } //temp
    void testStock() {samsung.updateTotalPrice(); System.out.println(samsung.totalPrice);} //temp

    void ListUpStocks() {
    }
}
