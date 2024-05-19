public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("================================");
        list.addFirst(3);
        list.addLast(4);
        list.addFirst(7);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=================================");
        try {
            list.add(40, 1);
        } catch (Exception e) {
            System.out.println(e);
        }
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=================================");
        try {
            System.out.println("Data awal pada Linked List: " + list.getFirst());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("Data akhir pada Linked List: " + list.getLast());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("Data index ke-1 pada Linked List: " + list.get(1));
        } catch (Exception e) {
            System.out.println(e);
        }
        list.clear();
        list.print();
        System.out.println("Size: " + list.size());
        list.addLast(50);
        list.addLast(40);
        list.addLast(10);
        list.addLast(20);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=================================");
        try {
            list.removeFirst();
        } catch (Exception e) {
            System.out.println(e);
        }
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=================================");
        try {
            list.removeLast();
        } catch (Exception e) {
            System.out.println(e);
        }
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=================================");
        try {
            list.remove(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        list.print();
        System.out.println("Size: " + list.size());
    }
}