import java.util.Scanner;

public class GraphMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph17 gedung = new Graph17(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        try {
            gedung.degree(0);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            gedung.printGraph();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            gedung.removeEdge(1, 3);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            gedung.printGraph();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.print("Masukkan gedung asal: ");
        char atsal = sc.next().charAt(0);
        System.out.print("Masukkan gedung tujuan: ");
        char toedjoean = sc.next().charAt(0);

        try {
            gedung.isAdjacency(atsal, toedjoean);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
