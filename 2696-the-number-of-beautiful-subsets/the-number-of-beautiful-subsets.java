class Solution {
     private int countBeautifulSubsets(int[] nums, int k, int index, List<Integer> currentSubset) {
        if (index == nums.length) {
            return 1; // Count this subset
        }

        int count = 0;
        // Option 1: Do not include nums[index]
        count += countBeautifulSubsets(nums, k, index + 1, currentSubset);

        // Option 2: Include nums[index] if it's a valid addition
        boolean canInclude = true;
        for (int num : currentSubset) {
            if (Math.abs(num - nums[index]) == k) {
                canInclude = false;
                break;
            }
        }
        if (canInclude) {
            currentSubset.add(nums[index]);
            count += countBeautifulSubsets(nums, k, index + 1, currentSubset);
            currentSubset.remove(currentSubset.size() - 1); // Backtrack
        }

        return count;
    }

    public int beautifulSubsets(int[] nums, int k) {
        // Sort the array to consider subsets in an ordered manner
        Arrays.sort(nums);
        // Start backtracking from index 0
        return countBeautifulSubsets(nums, k, 0, new ArrayList<>()) - 1; // Subtract 1 to exclude the empty subset
    }
    }