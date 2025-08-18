# Others solution

## Two sum

```Java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int idx1 = 0; idx1 < nums.length - 1; idx1++) {
            for (int idx2 = idx1 + 1; idx2 < nums.length; idx2++) {
                if (target == nums[idx1] + nums[idx2]) {
                    return new int[] {idx1, idx2};
                }
            }
        }
        return new int[] {0, 0};
    }
}
```

## Reverse an integer

```Java
class Solution {
    public int reverse(int x) {
        long input = (long) x;
        long reversedNum = 0;

        while (input != 0) {
            reversedNum = reversedNum * 10 + input % 10;
            input /= 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reversedNum;
        }
    }
}
```