public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(185,80);
        System.out.println("Твой индекс массы тела: "+ bmi);
    }
}