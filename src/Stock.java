import java.util.ArrayList;

abstract class Stock {

    /*Vars*/
    ArrayList<Integer> buyList;
    ArrayList<Integer> sellList;
    int price;          //주가
    int totalPrice;     //시가 총액
    int charge;         //수수료
    int totalAmount;
    int volatility;     //변동성
    int purchasePrice;  //구매가
    int amount;         //구매량

    /*Constructors*/
    Stock(int price, int charge, int amount) {
        this.price = price;
        this.charge = charge;
        this.amount = amount;
    }

    /*Methods*/

    void updateVolatility(){}
    void updatePrice(){}

    void print() {  //temp
        System.out.println(price);
    }

}

class Samsung extends Stock {

    final int totalAmount = 1000;
    Samsung(int price, int charge, int amount) {
        super(price, charge, amount);
    }
    void updateTotalPrice(){
        totalPrice = price * totalAmount;
    }
}