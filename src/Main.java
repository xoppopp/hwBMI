public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 1.75;
        int kg = 60;
        int bmi = service.calculate(m, kg);
        System.out.println(bmi);
    }
}
