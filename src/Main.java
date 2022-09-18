public class Main {
    public static void main(String[] args) {
        BeverageMaker beverageMaker = new BeverageMaker();
        beverageMaker.addBeverage(new Tea());
        beverageMaker.addBeverage(new Coffee());
        beverageMaker.addBeverage(new Soup());
        beverageMaker.setCupSize(CupSize.BIG);

        beverageMaker.prepare(1);
        beverageMaker.prepare(0);
        beverageMaker.setCupSize(CupSize.SMALL);
        beverageMaker.prepare(2);
    }
}