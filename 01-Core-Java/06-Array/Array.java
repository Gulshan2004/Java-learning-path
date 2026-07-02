public class Array {
    public static void main(String args[]) {
        int nums[] = new int[4]; // this is for dynamic array here all the elememts are initalized to 0 in the beggning 
         
         // int nums[] = { 3, 7, 2, 4 }; this is a static array.
        nums[0] = 6;
        nums[1] = 4;
        nums[2] = 7;
        nums[3] = 9;

        // Fetching all the values
        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[i]);
        }
    }
}
