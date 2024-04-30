package Latihan;

public class QiwQiw {
    Pembeli[] data;
    int front, rear;
    int max;
    int size;

    public QiwQiw(int n) {
        max = n;
        data = new Pembeli[max];
        front = rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void Enqueue(Pembeli dt) {
        if (isFull()) {
            System.out.println("\nQueue sudah penuh\n");
        } else {
            if (size == 0) {
                front = rear = 0;
            } else if (front == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
            data[rear] = dt;
            size++;
            System.out.println("data berhasil ditambahkan");
        }
    }

    Pembeli Dequeue() {
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("\nQueue kosong\n");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        return dt;
    }

    void peekHead() {
        if (!isEmpty()) {
            System.out.println("Data terdepan adalah: " + data[front].nama + ", dengan nomor Hp: " + data[front].noHp);
        } else {
            System.out.println("\nAntriannya aj kosong\n");
        }
    }

    void peekTail() {
        if (!isEmpty()) {
            System.out.println("Data terbelakang adalah: " + data[rear].nama + ", dengan nomor Hp: " + data[rear].noHp);
        } else {
            System.out.println("\nAntriannya aj kosong\n");
        }
    }

    void peekPosition(String namanya) {
        sampaiSini:
        if (!isEmpty()) {
            int i = front;
            int antreBrpa = 1;
            while (i != rear) {
                if (data[i].nama.equals(namanya)) {
                    System.out
                            .println(data[i].nama + " (" + data[i].noHp + ")" + " Berada di antrian ke: " + antreBrpa);
                    break sampaiSini;
                }
                i = (i + 1) % max;
                antreBrpa++;
            }
            if (data[i].nama.equals(namanya)) {
                System.out.println(data[i].nama + " (" + data[i].noHp + ")" + " Berada di antrian ke: " + antreBrpa);
            }
        } else {
            System.out.println("\nAntriannya aj kosong\n");
        }
    }

    void print() {
        if (!isEmpty()) {
            int i = front;
            System.out.println("Data antrian: ");
            while (i != rear) {
                System.out.println(data[i].nama + " (" + data[i].noHp + ")");
                i = (i + 1) % max;
            }
            System.out.println(data[i].nama + " (" + data[i].noHp + ")");
            System.out.println("Jumlah antrian : " + size);
        } else {
            System.out.println("\nAntriannya aj kosong\n");
        }
    }
}
