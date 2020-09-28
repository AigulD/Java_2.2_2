public class Main {
    public static void main(String[] args) {
        double weightkg = 55;
        double heightm = 1.62;

        BmiService service = new BmiService();

        double bmi = service.calculate(weightkg,heightm);
        System.out.printf("Body Mass Index %.2f",bmi);
    }
}
