public class largestInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,3,6,1};
        int largest = arr[0];
        for(int i:arr){
            if (i >= largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
