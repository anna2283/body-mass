public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double heightMeters = 1.90;
        int weightKilos = 95;
        int index = bmiService.calculate(heightMeters,weightKilos);
        System.out.println("Индекс массы тела: " + index + " кг/кв.м");

    }
}
