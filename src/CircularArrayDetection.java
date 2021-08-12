public class CircularArrayDetection {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public SinglyLinkedListNode insertNode(int nodeData, SinglyLinkedListNode head) {
             SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            return head;
        }

        static boolean hasCycle(SinglyLinkedListNode head) {
            boolean flag = false;
            if (head == null) {
                return false;
            }
            SinglyLinkedListNode slow = head;
            SinglyLinkedListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast)
                    return true;
            }
            return false;
        }

        static void printLinkedList(SinglyLinkedListNode head) {
            while (head != null) {
                System.out.println(head.data);
                head=head.next;
            }
        }

        public static void main(String[] args) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(5);
            SinglyLinkedList linkedList = new SinglyLinkedList();
            linkedList.insertNode(6,node);
            printLinkedList(node);
        }
    }
}
