public class Queue2 {
    Nasabah[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue2(int n) {
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Nasabah dt) {
        if (isFull()) {
            System.out.println("\nQueue sudah penuh\n");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            System.out.println("....");
            System.out.println("Antrean ditambahkan\n");
        }
    }

    public Nasabah Dequeue() {
        Nasabah dt = new Nasabah();
        if (isEmpty()) {
            System.out.println("\nData masih kosong\n");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println(
                    "Elemen terdepan : " + data[front].norek + " " + data[front].nama + " " + data[front].Alamat
                            + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("\nData antrian kosong\n");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Element paling belakang: " + data[rear].norek + " " + data[rear].nama + " "
                    + data[rear].Alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("\nData antrian kosong\n");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("\nData antrian kosong\n");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].Alamat + " " + data[i].umur + " "
                        + data[i].saldo + "\n");
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].Alamat + " " + data[i].umur + " "
                    + data[i].saldo + "\n");
            System.out.println("Jumlah elemen = " + size);
        }
    }
}
