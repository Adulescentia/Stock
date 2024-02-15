import java.util.ArrayList;

public class Stock {

    /*Vars*/
    ArrayList<Integer> buyList;
    ArrayList<Integer> sellList;
    int price;          //주가
    int totalPrice;     //시가 총액
    int charge;         //수수료
    int totalAmount;    //총 발행량
    int volatility;     //변동성
    int purchasePrice;  //구매가

    /*Constructor*/
    Stock(int price, int charge, int totalAmount, int volatility) {
        this.price = price;
        this.charge = charge;
        this.totalAmount = totalAmount;
        this.volatility = volatility;
    }

    /*Methods*/
    void updateTotalPrice(){
        totalPrice = price * totalAmount;
    }

    void updateVolatility(){}
    void updatePrice(){}

}