import java.util.*;

class Solution {
    public int[][] solution(int[][] rc, String[] operations) {
        int length1 = rc.length;
        int length2 = rc[0].length;
        
        Deque<Integer> left = new ArrayDeque<>();
        Deque<Integer> right = new ArrayDeque<>();
        Deque<Deque<Integer>> center = new ArrayDeque<>();
        
        for (int i=0; i<length1; i++) {
            left.offer(rc[i][0]);
            right.offer(rc[i][length2-1]);
            
            center.offer(new ArrayDeque<>());
            for (int j=1; j<length2-1; j++) {
                center.peekLast().offer(rc[i][j]);
            }
        }
        
        for (int i=0; i<operations.length; i++) {
            if (operations[i].equals("Rotate")) {
                center.peekFirst().offerFirst(left.pollFirst());
                right.offerFirst(center.peekFirst().pollLast());
                center.peekLast().offerLast(right.pollLast());
                left.offerLast(center.peekLast().pollFirst());
            } else if (operations[i].equals("ShiftRow")) {
                left.offerFirst(left.pollLast());
                right.offerFirst(right.pollLast());
                center.offerFirst(center.pollLast());
            }
        }
        
        for (int i=0; i<length1; i++) {
            rc[i][0] = left.pollFirst();
            rc[i][length2-1] = right.pollFirst();
            
            int j = 1;
            for (int k : center.pollFirst()) {
                rc[i][j++] = k;
            }
        }
        
        return rc;
    }
    
}