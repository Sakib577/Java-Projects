public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int [][] nums={{1,2,3},{4,5,6,7}};
        System.out.println(nums[1][3]);

        nums [0][2] = 9;
        System.out.println(nums[0][2]);

        for (int i=0; i < nums.length; i++)
        {
            for (int j=0; j <nums[i].length; j++)
            {
                System.out.println(nums[i][j]);
            }
        }
    }
}