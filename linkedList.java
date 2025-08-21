public class linkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null; // list became empty
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    public void searchIT(int target) {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                System.out.println("Target Found");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Target not found");
    }

    public int helper(Node node, int target) {
        if (node == null) return -1;
        if (node.data == target) return 0;

        int index = helper(node.next, target);
        return (index == -1) ? -1 : index + 1;
    }

    public int searchRF(int target) {
        return helper(head, target);
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        tail = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNth(int indexFromEnd) {
        if (indexFromEnd <= 0 || indexFromEnd > size) {
            System.out.println("Invalid index from end");
            return;
        }

        int indexFromStart = size - indexFromEnd;

        if (indexFromStart == 0) {
            removeFirst();
            return;
        }

        Node temp = head;
        for (int i = 0; i < indexFromStart - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        // Update tail if last node was removed
        if (indexFromEnd == 1) {
            tail = temp;
        }

        size--;
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();

        ll.addFirst(1);
        ll.addFirst(2);       // 2 -> 1
        ll.addLast(3);        // 2 -> 1 -> 3
        ll.addLast(4);        // 2 -> 1 -> 3 -> 4
        ll.print();

        ll.add(2, 9);         // 2 -> 1 -> 9 -> 3 -> 4
        ll.print();

        System.out.println("Size: " + ll.size());

        ll.removeFirst();     // 1 -> 9 -> 3 -> 4
        ll.print();

        System.out.println("Size: " + ll.size());

        ll.removeLast();      // 1 -> 9 -> 3
        ll.print();

        System.out.println("Index of 0: " + ll.searchRF(0));  // -1 (not found)

        ll.reverse();         // 3 -> 9 -> 1
        ll.print();

        ll.removeNth(3);      // removes 3rd from end (3)
        ll.print();
    }
}
