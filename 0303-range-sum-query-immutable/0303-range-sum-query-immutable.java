class NumArray {
        int[] prifix;
    public NumArray(int[] nums) {
        prifix=new int[nums.length];
        prifix[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prifix[i]=prifix[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return  prifix[right];
        }
        return prifix[right]-prifix[left-1];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */