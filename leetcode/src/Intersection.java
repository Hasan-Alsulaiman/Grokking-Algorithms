import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }

        @Override
        public String toString() {
            return "" + val;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> seta = new HashSet<ListNode>();
        while(headA != null){
            System.out.println(headA);
            seta.add(headA);
            headA = headA.next;
        }
        System.out.println(seta);
        while (headB != null){
            System.out.println("hi");
            if(seta.contains(headB)){
                return headB;
            }
            headB = headB.next;

        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,8,4,5};
        int[] arr2 = new int[] {6,1,8,4,5};
        ListNode nodes1 = new ListNode(4);
        ListNode nodes2 = new ListNode(5);
        ListNode temp = nodes1;
        for (int i: arr1){
            temp.next = new ListNode(i);
            temp = temp.next;
        }

        temp = nodes2;
        for (int i: arr2){
            temp.next = new ListNode(i);
            temp = temp.next;
        }

        ListNode res = Intersection.getIntersectionNode(nodes1, nodes2);
        System.out.println(res);

    }

}

