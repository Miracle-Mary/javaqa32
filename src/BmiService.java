public class BmiService {
    public int calculate(double heightMeters, double weightKg) {
        double index = weightKg / (heightMeters * heightMeters);
        int result = (int) index;
        return result;
    }
}
