package enumeration.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMON 등급의 할인 금액: " + diamond);
//        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
//        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
//        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}
