public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightkg = 55;
        double heightm = 1.62;
        double bmi = service.calculate(weightkg,heightm);
        System.out.println(bmi);
    }
}
