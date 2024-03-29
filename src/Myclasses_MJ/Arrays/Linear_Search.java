package Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {28, 45 ,23, 1 , 42, 13};
        int target = 2;
        int ans = linear_Search(nums, target);
        System.out.println(ans);
    }
    //search the array and return the index found
    // otherewise it the item not found then return -1
    static int linear_Search(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }
        else{

            for(int index=0; index<arr.length;index++){
                if(target == arr[index]){
                    return index;
                }      
            }
        }
        return -1;
    }
}
