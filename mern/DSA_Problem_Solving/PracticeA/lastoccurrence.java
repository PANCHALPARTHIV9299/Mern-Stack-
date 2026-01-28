public class lastoccurrence {
    public static void main(String args[]){
        int[] arr={2,4,15,8,3,5,8,7,5,8,9,10};
        int match = 8;
        int count =0;
        for(int i=1; i<arr.length; i++){
            if(match == arr[i]){
                count = i;
            }
        }
        System.out.println(count);
    }
}
