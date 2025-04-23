public class Sorter extends Player{

    //Sort by market value (ascending order)
    public static void selectionSortMV(Player[] arr){

        //Write the selection sort algorithum here 
        for(int i; i < arr.length-1; i++){
            int minIndex= i;

            for(int j= i+1; j < array.length; j++){

                if(arr[j].getMarketValue() < arr[minIndex].getMarketValue()){
                    minIndex= j;
                }
            }
            //Swap
            Player temp= arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex]= temp;
        }
    }

    //Sort by market value (ascending order)
    public static void insertionSortMV(Player[] arr){

        //Write the insertion sort algorithum here
        for(int i= 1; i < arr.length; i++){

            Player key = arr[i];
            int j= i-1;

            while(j >= 0 && arr[i].getMarketValue() > key.getMarketValue()){
                arr[j+1]= arr[j];

                j--;
            }
            arr[j+1]= key;
        }
    }

    //Search a player by market value
    public static int linearSearchByMV(Player[] arr, int targetMV){

        //Write the linear search algorithum here
        for(int i=0; i < arr.length; i++){

            if(arr[i].getMarketValue()==targetMarketV()){
                return i;
            }
            return -1;
        }
    }

    //Binary search a player by market value
    public static int binarySearchMV(Player[] arr, int target){

        int low= 0;
        int high= array.length - 1;

        while (low <= high){

            int mid= low + (high-low)/2;
            int midrating= arr[mid].getMarketValue();

            if (midRating == target){
                return array[mid];
            }

            else if(midRating < target){
                low= mid + 1;
            }

            else{
                high= mid - 1;
            }
        }
        return -1; //Not found
    }

    //Sort by rating (ascending order)
    public static void selectionSortRA(Player[] arr){

        //Write the selection sort algorithum here
        for(int i; i < arr.length-1; i++){
            int minIndex= i;

            for(int j= i+1; j < arr.length; j++){

                if(arr[j].getRating() < arr[minIndex].getRating()){
                    minIndex= j;
                }
            }
            //Swap
            int temp =arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex]= temp;
        }
    }

    //Sort by rating (ascending order)
    public static void insertionSortRA(Player[] arr){

        //Write the insertion sort algorithum here
        for(int i= 1; i < arr.length; i++){

            Player temp= arr[i];
            int j= i-1;

            while(j >= 0 && arr[i].getRating() > temp.getRating()){
                arr[j+1]= arr[j];

                j--;
            }
            arr[j+1]= temp;
        }
    }

    //Search a player by rating
    public static int linearSearchRA(Player[] arr, int targetRA){

        //Write the linear search algorithum here
        for(int i=0; i < arr.length; i++){

            if(arr[i].getRating()==targetRA()){
                return i;
            }
            return -1;
        }
    }

     //Binary search a player by overall rating
    public static int binarySearchRA(Player[] arr, int target){

        int low = 0;
        int high = arr.length - 1;

        while (low <= high){

            int mid = low + (high-low)/2;
            int midrating = arr[mid].getRating();

            if (midRating == target){
                return arr[mid];
            }

            else if(midRating < target){
                low = mid + 1;
            }

            else{
                high= mid - 1;
            }
        }
        return -1; //Not found
    }
}