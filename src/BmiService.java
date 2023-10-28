public class BmiService {

    public int calculate(double m, int kg){
        double result;
        result = kg / (m * m);
        return (int) result;

    }
}
