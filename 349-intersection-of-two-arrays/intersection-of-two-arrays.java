class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {

            // check if nums1[i] is duplicate
            boolean duplicate = false;
            for (int k = 0; k < i; k++) {
                if (nums1[i] == nums1[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                continue;
            }

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    count++;
                    break;
                }
            }
        }

        int[] ans=new int[count];
        int index=0;

        for (int i = 0; i < nums1.length; i++) {

            // check if nums1[i] is duplicate
            boolean duplicate = false;
            for (int k = 0; k < i; k++) {
                if (nums1[i] == nums1[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                continue;
            }

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                   ans[index]=nums1[i];
                   index++;
                    break;
                }
            }
        }
        return ans;
        
    }
}