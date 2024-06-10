public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst(890, "Dhanil");
        singLL.print();
        singLL.addLast(760, "Dhany");
        singLL.print();
        singLL.addFirst(700, "Joko");
        singLL.print();
        singLL.insertAfter(700, 999, "Yono");
        singLL.print();
        singLL.insertAt(3, 833, "Kukru");
        singLL.print();
        
        System.out.println("Data pada indeks ke-1="+singLL.getData(12));
        System.out.println("Data 833 berada pada indeks ke-"+singLL.indexOf(760));
        
        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
        
    }
}
