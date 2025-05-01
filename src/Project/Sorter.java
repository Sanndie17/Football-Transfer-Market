public class Sorter extends Club {

    // Constructor that takes all parameters needed by Club
    public Sorter(String clubName, String name, int age, String position, int rating, int marketValue) throws UsageException {
        super(clubName, name, age, position, rating, marketValue);
    }

    // Selection sort by market value (ascending)
    public static void selectionSortMV(Player[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getMarketValue() < arr[minIndex].getMarketValue()) {
                    minIndex = j;
                }
            }
            // Swap
            Player temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion sort by market value (ascending)
    public static void insertionSortMV(Player[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Player key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getMarketValue() > key.getMarketValue()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Linear search by market value
    public static int linearSearchByMV(Player[] arr, int targetMV) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getMarketValue() == targetMV) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Binary search by market value (array must be sorted)
    public static int binarySearchMV(Player[] arr, int targetMV) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midMV = arr[mid].getMarketValue();

            if (midMV == targetMV) {
                return mid;
            } else if (midMV < targetMV) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Not found
    }

    // Selection sort by rating (ascending)
    public static void selectionSortRA(Player[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getRating() < arr[minIndex].getRating()) {
                    minIndex = j;
                }
            }
            // Swap
            Player temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion sort by rating (ascending)
    public static void insertionSortRA(Player[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Player key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getRating() > key.getRating()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Linear search by rating
    public static int linearSearchRA(Player[] arr, int targetRA) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getRating() == targetRA) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Binary search by rating (array must be sorted)
    public static int binarySearchRA(Player[] arr, int targetRA) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midRating = arr[mid].getRating();

            if (midRating == targetRA) {
                return mid;
            } else if (midRating < targetRA) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Not found
    }
}