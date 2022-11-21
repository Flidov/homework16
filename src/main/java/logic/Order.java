package logic;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
    String[] basket;
    int totalPrice;

    public String[] getBasket() {
        return basket;
    }

    public void setBasket(String[] basket) {
        this.basket = basket;
    }

    private int getSum() {
        int sum = 0;
        for (int x = 0; x < basket.length; x++) {
            String a = basket[x];
            int b = 0;
            Pattern pattern = Pattern.compile("\\s+\\d+[$]");
            Matcher matcher = pattern.matcher(a);
            if (matcher.find()) {
                a = (a.substring(matcher.start(), matcher.end()));
                a = a.replaceAll("[$]", "");
                b = Integer.parseInt(a.trim());
                sum  =sum+ b;
            }

        }
        return sum;


    }

    public String listBasket() {
        StringBuilder list = new StringBuilder();

        for (int x = 0; x < basket.length; x++) {
            list.append("<li>" + basket[x] + "</li>");
        }

        return list.toString();
    }

    public int getTotalPrice() {
        totalPrice=getSum();
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "basket=" + Arrays.toString(basket) +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
