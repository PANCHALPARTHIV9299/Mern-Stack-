public class max {
    public static void main(String args[]){
        int[] a ={3,5,10,6,2,1,11};
        int max = a[0];
        for (int i=1; i<a.length; i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
