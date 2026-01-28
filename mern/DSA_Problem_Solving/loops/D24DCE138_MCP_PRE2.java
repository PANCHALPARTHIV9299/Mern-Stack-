public class D24DCE138_MCP_PRE2 {
    public static boolean check(int[] nums) {
        int A = nums.length;
        int count = 0;
        for (int i = 0; i < A; i++) {
            int B = (i + 1) % A;
            if (nums[i] > nums[B] && ++count > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,1,2,2})); 
        System.out.println(check(new int[]{2,2,1,3,4}));   
        System.out.println(check(new int[]{1,2,3}));     
    }
}
