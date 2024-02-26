import java.util.ArrayList;

class Stock {

    /*Vars*/
    int identificationNumber;
    String name;
    ArrayList<Integer> buyList;
    ArrayList<Integer> sellList;
    int price;          //주가
    int totalPrice;     //시가 총액
    int charge;         //수수료
    int volatility;     //변동성
    int amountOfOutstandingStocks;//발행량
    int amount;         //구매량


    /*Constructor*/
    Stock(int identificationNumber, int price, int charge, int amount) {
        this.identificationNumber = identificationNumber;
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
        totalPrice = price * amountOfOutstandingStocks;
        return totalPrice;
    }


}