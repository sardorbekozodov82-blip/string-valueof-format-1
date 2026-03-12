public class StringValueofFormatBasic {
    public static void main(String[] args) {
        System.out.println("=== String.valueOf() ===");
        System.out.println(String.valueOf(42));
        System.out.println(String.valueOf(3.14));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf('A'));
        char[] chars = {'J','a','v','a'};
        System.out.println(String.valueOf(chars));

        System.out.println("\n=== String.format() ===");
        String name  = "Alice";
        int    age   = 25;
        double gpa   = 3.857;
        System.out.println(String.format("Name: %s, Age: %d, GPA: %.2f", name, age, gpa));
        System.out.println(String.format("Padded: '%10s'", "Java"));
        System.out.println(String.format("Padded: '%-10s'", "Java"));
        System.out.println(String.format("Leading zeros: %05d", 42));
        System.out.println(String.format("Hex: %X", 255));
        System.out.println(String.format("Scientific: %e", 123456.789));

        // Receipt formatting
        System.out.println("\n=== Receipt ===");
        System.out.println(String.format("%-20s %5s %8s", "Item", "Qty", "Price"));
        System.out.println("-".repeat(35));
        Object[][] items = {{"Laptop",1,999.99},{"Mouse",2,24.99},{"Cable",3,9.99}};
        double total = 0;
        for (Object[] item : items) {
            double price = (Double)item[2] * (Integer)item[1];
            total += price;
            System.out.println(String.format("%-20s %5d %8.2f", item[0], item[1], price));
        }
        System.out.println("-".repeat(35));
        System.out.println(String.format("%-20s %5s %8.2f", "TOTAL","", total));
    }
}
