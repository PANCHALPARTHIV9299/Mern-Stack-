public class min {
    public static void main(String args[]){
        int[] arr={14,15,21,2,3,1,6,4,7};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
