public class GamingConsoleReport {

    public static void main(String[] args) {

        // Single-dimensional arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        int[] totals = new int[cities.length];

        // Two-dimensional array: rows = cities, columns = consoles
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        String line = "--------------------------------------------------------";

        // Calculate total sales per city
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                totals[row] += sales[row][col];
            }
        }

        // Find the city with the most sales
        int highestIndex = 0;
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[highestIndex]) {
                highestIndex = i;
            }
        }

        // Report heading
        System.out.println(line);
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println(line);

        // Console names header
        System.out.printf("%-20s", "");
        for (int col = 0; col < consoles.length; col++) {
            System.out.printf("%-10s", consoles[col]);
        }
        System.out.println();

        // Sales table
        for (int row = 0; row < sales.length; row++) {
            System.out.printf("%-20s", cities[row]);
            for (int col = 0; col < sales[row].length; col++) {
                System.out.printf("%-10d", sales[row][col]);
            }
            System.out.println();
        }

        // Totals per city
        System.out.println(line);
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println(line);
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%d%n", cities[i], totals[i]);
        }

        // City with the most sales
        System.out.println(line);
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]);
        System.out.println(line);
    }
}