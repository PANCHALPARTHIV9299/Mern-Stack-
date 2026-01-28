class D24DCE138_MCP_PRER {

    String max = "0";

    public String bignum(int[] nums) {

        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        permute(arr, 0);

        if (max.charAt(0) == '0') {
            return "0";
        }

        return max;
    }

    void permute(String[] arr, int index) {

        if (index == arr.length) {
            String current = "";
            for (String s : arr) {
                current += s;
            }

            if (current.compareTo(max) > 0) {
                max = current;
            }
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1);
            swap(arr, index, i); 
        }
    }

    void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        D24DCE138_MCP_PRER obj = new D24DCE138_MCP_PRER();

        int[] nums1 = {10, 2};
        int[] nums2 = {3, 30, 344};

        System.out.println(obj.bignum(nums1)); 
        System.out.println(obj.bignum(nums2)); 
    }
}
