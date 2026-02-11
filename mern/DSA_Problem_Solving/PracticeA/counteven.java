 public class counteven {
    public static void main (String args[]){
        int[] arr={2,4,15,1,3,5,6,7,8};
        int count=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2 == 0){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
