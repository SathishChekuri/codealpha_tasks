import java.util.*;

public class StockTradingPlatform {

    static HashMap<String, Double> market = new HashMap<>();
    static HashMap<String, Integer> portfolio = new HashMap<>();
    static ArrayList<String> history = new ArrayList<>();

    static double balance = 100000;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        initializeMarket();

        while (true) {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("Balance :$" + balance);
            System.out.println("1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    viewMarket();
                    break;

                case 2:
                    buyStock();
                    break;

                case 3:
                    sellStock();
                    break;

                case 4:
                    viewPortfolio();
                    break;

                case 5:
                    viewHistory();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void initializeMarket() {

        market.put("TCS", 3500.0);
        market.put("INFY", 1600.0);
        market.put("WIPRO", 500.0);
        market.put("HCL", 1400.0);
        market.put("TECHM", 1700.0);
    }

    public static void viewMarket() {

        System.out.println("\n----- MARKET -----");

        for (String stock : market.keySet()) {

            System.out.println(
                    stock + " :$" + market.get(stock));
        }
    }

    public static void buyStock() {

        System.out.print("Enter Stock Name: ");
        String stock = sc.next().toUpperCase();

        if (!market.containsKey(stock)) {

            System.out.println("Invalid Stock!");
            return;
        }

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        double cost = qty * market.get(stock);

        if (cost > balance) {

            System.out.println("Insufficient Balance!");
            return;
        }

        balance -= cost;

        portfolio.put(
                stock,
                portfolio.getOrDefault(stock, 0) + qty);

        history.add(
                "Bought " + qty + " shares of " + stock);

        System.out.println("Stock Purchased Successfully!");
    }

    public static void sellStock() {

        System.out.print("Enter Stock Name: ");
        String stock = sc.next().toUpperCase();

        if (!portfolio.containsKey(stock)) {

            System.out.println("You don't own this stock!");
            return;
        }

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        int owned = portfolio.get(stock);

        if (qty > owned) {

            System.out.println("Not Enough Shares!");
            return;
        }

        balance += qty * market.get(stock);

        if (qty == owned) {

            portfolio.remove(stock);

        } else {

            portfolio.put(stock, owned - qty);
        }

        history.add(
                "Sold " + qty + " shares of " + stock);

        System.out.println("Stock Sold Successfully!");
    }

    public static void viewPortfolio() {

        if (portfolio.isEmpty()) {

            System.out.println("Portfolio Empty!");
            return;
        }

        double totalValue = 0;

        System.out.println("\n----- PORTFOLIO -----");

        for (String stock : portfolio.keySet()) {

            int qty = portfolio.get(stock);

            double value = qty * market.get(stock);

            totalValue += value;

            System.out.println(
                    stock +
                            " | Qty: " + qty +
                            " | Value: $" + value);
        }

        System.out.println(
                "\nPortfolio Value: $" + totalValue);

        System.out.println(
                "Net Worth: $" +
                        (balance + totalValue));
    }

    public static void viewHistory() {

        if (history.isEmpty()) {

            System.out.println("No Transactions Yet!");
            return;
        }

        System.out.println("\n----- HISTORY -----");

        for (String h : history) {

            System.out.println(h);
        }
    }
}