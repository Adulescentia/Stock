import java.util.ArrayList;

class Stock {

    /*Vars*/
    String name;
    ArrayList<Integer> buyList;
    ArrayList<Integer> sellList;
    int price;          //주가
    int totalPrice;     //시가 총액
    int charge;         //수수료
    int volatility;     //변동성
    int totalAmount;
    int amount;         //구매량


    /*Constructor*/
    Stock(String name, int price, int charge, int amount) {
        this.name = name;
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
    String getName() {return name;}
    int getTotalPrice() {
        totalPrice = price * totalAmount;
        return totalPrice;
    }

}