import java.util.Scanner;

public class QueueMain1 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitan Queue: ");
        int capasity = sc.nextInt();
        Queue gas = new Queue(capasity);
        int mauApa;
        do {
            menu();
            mauApa = sc.nextInt();
            switch (mauApa) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    gas.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = gas.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: "+dataKeluar);
                    }
                    break;
                case 3:
                    gas.print();
                    break;
                case 4:
                    gas.peek();
                    break;
                case 5:
                    gas.clear();
                    break;
            
                default:
                    break;
            }
        } while (mauApa == 1 || mauApa == 2 || mauApa == 3 || mauApa == 4 || mauApa == 5);
    }
}
