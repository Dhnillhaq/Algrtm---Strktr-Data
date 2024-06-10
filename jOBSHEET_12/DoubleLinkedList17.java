
public class DoubleLinkedList17 {
    Node17 head;
    int size;

    public DoubleLinkedList17() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node17(null, item, jarak, null);
        } else {
            Node17 newNode = new Node17(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas ");
        }
        Node17 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    
    public void remove(int index) {
        Node17 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev!= null) {
                    current.prev.next = current.next;
                } else {
                    head =current.next;
                } 
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    void clear() {
        head = null;
        size = 0;
    }

    int get(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas / List kosong");
        } else {
            Node17 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public int size() {
        return size;    
    }
    
}
