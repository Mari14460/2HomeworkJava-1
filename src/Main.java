public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService(); // создаем instance (экземпляр объекта)
        int ticketPrice = 10_000;
        int miles = service.calculate(ticketPrice); //  вызываем метод из созданной instance

        System.out.println("--- First task with class and method ---");
        System.out.println("Miles: " + miles);
        System.out.println("");
    }
}