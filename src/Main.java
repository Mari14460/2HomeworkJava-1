public class Main {
    public static void main(String[] args) {
        // Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
        // Формула расчета следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
        // Дробные мили не начисляются.

        int ticketPrice = 113_210;
        int milesPer = 20;
        int miles = ticketPrice / milesPer;

        System.out.println("--- First task ---");
        System.out.println("Miles: " + miles);
        System.out.println("");
    }
}