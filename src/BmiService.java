public class BmiService {
    public double calculate (double weightkg, double heightm){
        double bmi = (int)weightkg / (heightm * heightm);
        return (bmi);
    }
}
