class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        ListNode trav = head;

        while(trav != null){
            arr.add(trav.val);
            trav = trav.next;
        }

        int start = 0;
        int end = arr.size()-1;

        while(start<=end){
            if(arr.get(start) != arr.get(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}