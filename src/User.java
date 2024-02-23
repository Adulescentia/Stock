import java.util.ArrayList;

public class User {

    /*Vars*/
    long asset;
    ArrayList<Stock> buyReservationList;
    ArrayList<Stock> sellReservationList;

    /*Constructor*/
        /*Asset*/
    public static User asset (long asset) {
        User user = new User();
        user.asset = asset;
        return user;
    }
    public static User asset (String asset) {
        User user = new User();
        long preAsset = Long.parseLong(asset.substring(0, asset.length() - 1));
        switch (asset.substring(asset.length() - 1)) {
            case "K":
                user.asset = preAsset * 1000;
                break;
            case "M":
                user.asset = preAsset * 1000000;
                break;
            case "B":
                user.asset = preAsset * 1000000000;
                break;
            default:
                user.asset = preAsset;
        }
        return user;
    }
}
