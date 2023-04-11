public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 69.0;
        double height = 1.8;
        double index = service.calculate(weight, height);
        System.out.printf("%.2f", index);
    }
}