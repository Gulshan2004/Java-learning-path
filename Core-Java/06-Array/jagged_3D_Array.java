public class jagged_3D_Array {
    public static void main(String args[]){
        
        int nums[][]= new int[3][]; // Jagged Array with 3 rows 
        nums[0] =new int[3]; // First row with 3 elements
        nums[1] =new int[4]; //Second row with 4 elements
        nums[2] =new int[2]; //Third row with 2 elements

        //Populating and Accessing Jagged Arrays:
        for (int i=0;i<nums.length;i++){ 
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]= (int) (Math.random()*10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(); //Move to the next line after each row 
        }

        //You can also use an enhanced for loop to iterate over the jagged array
       /*  for (int n[] :nums){
            for (int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
            */

       // int nums1[][]= new int[3][4][5]; //3D ARRAY initialization 
 }
}
