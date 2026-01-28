public class countthenX {
    public static void main (String args[]){
        int[] arr={2,4,15,1,3,5,6,7,8};
        int num = 4;
        int count=0;
        for (int i=0; i<arr.length;i++){
            if (num < arr[i]) {
                count +=1;
            }
        }
        System.out.println(count+" : numbers are bigger then "+num);
    }
}
