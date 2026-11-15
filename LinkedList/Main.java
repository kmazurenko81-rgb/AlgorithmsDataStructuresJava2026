
import java.util.LinkedList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1 - власний ListNode
        System.out.println("Example 1:");

        ListNode a1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode b1 = new ListNode(1, new ListNode(3, new ListNode(4)));

        printList(solution.mergeTwoLists(a1, b1));

        // Example 2 - власний ListNode
        System.out.println("Example 2:");

        ListNode a2 = null;
        ListNode b2 = null;

        printList(solution.mergeTwoLists(a2, b2));

        // Example 3 - власний ListNode
        System.out.println("Example 3:");

        ListNode a3 = null;
        ListNode b3 = new ListNode(0);

        printList(solution.mergeTwoLists(a3, b3));


        // Використання LinkedList та Collections

        System.out.println("\nUsing LinkedList and Collections:");

        // Example 1
        System.out.println("Example 1 (LinkedList):");

        LinkedList<Integer> list1 = new LinkedList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(4);

        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<Integer>();

        list2.add(1);
        list2.add(3);
        list2.add(4);

        System.out.println(list2);

        System.out.println(mergeWithCollections(list1, list2));


        // Example 2
        System.out.println("Example 2 (LinkedList):");

        System.out.println(mergeWithCollections(
                new LinkedList<>(),
                new LinkedList<>()
        ));


        // Example 3
        System.out.println("Example 3 (LinkedList):");

        LinkedList<Integer> list3 = new LinkedList<>();

        list3.add(0);

        System.out.println(mergeWithCollections(
                new LinkedList<>(),
                list3
        ));


        // Додаткове об'єднання через Solution

        System.out.println("\nAdditional merge using Solution:");

        ListNode nodeList1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        ListNode nodeList2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));

        ListNode mergedList = solution.mergeTwoLists(nodeList1, nodeList2);

        ListNode temp = mergedList;

        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


    // Метод для виведення списку ListNode
    public static void printList(ListNode head) {

        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    // Метод для об'єднання LinkedList через Collections
    public static LinkedList<Integer> mergeWithCollections(
            LinkedList<Integer> list1,
            LinkedList<Integer> list2) {

        LinkedList<Integer> result = new LinkedList<>();

        result.addAll(list1);
        result.addAll(list2);

        Collections.sort(result);

        return result;
    }
}
