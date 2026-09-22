public class Lab01_Ex6_4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String[] months = {
            "january", "february", "march", "april", "may", "june",
            "july", "august", "september", "october", "november", "december"
        };

        String[] abbreviations = {
            "jan", "feb", "mar", "apr", "may", "jun",
            "jul", "aug", "sep", "oct", "nov", "dec"
        };

        String[] abb_dot = {
            "jan.", "feb.", "mar.", "apr.", "may.",
            "jun.", "jul.", "aug.", "sep.", "oct.", "nov.", "dec."
        };

        int month = 0;
        int year = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter month: ");
            String monthInput = scanner.nextLine().trim().toLowerCase();

            System.out.print("Enter year: ");
            String yearInput = scanner.nextLine().trim();

            for (int i = 0; i < 12; i++) {
                if (monthInput.equals(months[i])
                        || monthInput.equals(abbreviations[i])
                        || monthInput.equals(abb_dot[i])
                        || monthInput.equals(String.valueOf(i + 1))) {

                    month = i + 1;
                    break;
                }
            }

            try {
                year = Integer.parseInt(yearInput);
            } catch (NumberFormatException e) {
                year = -1;
            }

            if (month >= 1 && month <= 12 && year >= 0) {
                validInput = true;
            } else {
                System.out.println("Invalid month or year. Please try again.");
                month = 0;
            }
        }

        int days;

        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }

        System.out.printf(
            "Month %d of year %d has %d days.%n",
            month, year, days
        );

        scanner.close();
    }
}