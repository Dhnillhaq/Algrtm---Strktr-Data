public class SingleLinkedList {

    Node head, tail;

    boolean isEmpty() {
        return head != null;
    }

    void print() {
        if (isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.println("NIM: "+tmp.NIM+"\tNama: "+tmp.Nama );
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input, String inputNama) {
        Node ndInput = new Node(input, inputNama,  null);
        if (isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;

        }
    }

    void addLast(int input, String inputNama) {
        Node ndInput = new Node(input, inputNama, null);
        if (isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input, String inputNama) {
        Node ndInput = new Node(input, inputNama, null);
        Node temp = head;
        do {
            if (temp.NIM == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input, String inputNama) {
        Node ndInput = new Node(input, inputNama, null);
        if (index > 0) {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, inputNama, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        } else if (index == 0) {
            addFirst(input, inputNama);
        } else {
            System.out.println("index kaya gitu mau taro dimana bng");
        }
    }

    int getData(int index) {
        Node temp = head;
        if (index == 0) {
            return temp.NIM;
        } else {
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            return temp.next.NIM;
        }
    }

    int indexOf(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null && temp.NIM != key) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            return 1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (!isEmpty()) {
            System.out.println("Linked List Kosong, \ntidak dapat di hapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key){
        if (!isEmpty()) {
            System.out.println("Linked List Kosong, \ntidak dapat di hapus");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.NIM == key && temp == head) {
                    removeFirst();
                    break;   
                } else if (temp.next.NIM == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

}