public class largest {
    public static void main(String[] args) {
        int[] arr = {1,54,65,98,4,6,97,2341,647,98,21,645,98,561,64,9,4};
        int large = arr[0];
        for(int i:arr){
            if (i>large) {
                large = i;
            }
        }
        System.out.print("largest in array = " + large);
    }
}
