public class Graph17 {
    int vertex;
    DoubleLinkedList17 list[];

    public Graph17(int vertex) {
        this.vertex = vertex;
        list = new DoubleLinkedList17[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedList17();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                } 
            }
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i)
                        + " terhubung dengan Gedung ");
                for (int j = 0; j < list[i].size; j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " ( " + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    void isAdjacency(char asal, char tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if ((char) ('A' + i) == asal) {
                if (list[i].size > 0) {
                    for (int j = 0; j < list[i].size; j++) {
                        if ((char) ('A' + list[i].get(j)) == tujuan) {
                            System.out.println(
                                    "Gedung " + (char) ('A' + i) + " dan " + tujuan + " bertetangga");
                        } else {
                            System.out.println("Gedung " + (char) ('A' + i) + " dan " + tujuan
                                    + " tidak bertetangga");
                        }
                    }
                } else {
                    System.out.println("Gedung " + (char) ('A' + i) + " tidak memiliki tetangga");
                }
            }
        }
    }
}
