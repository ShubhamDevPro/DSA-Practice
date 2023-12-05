package Arrays;

public class Majority_Element {
    public static void main(String[] args){
        int nums[]={8,8,7,7,7};
        int k = majorityElement(nums);
        System.out.println(k);
    }
    public int majorityElement(int[] nums) {
        int i1=nums[0];
        int i2=nums[0];
        int count_i=0;
        int count_j=0;
        if(nums.length>1){
            i2=nums[1];
            int k =2;
            while(i1==i2 && nums.length<k){
                i2=nums[k];
                k++;
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]==i1){
                    count_i++;
                }else{
                    count_j++;
                }
            }}
        if(count_i>count_j){
            return i1;
        }return i2;
    }
}
