public class GraphMatriks17 {
    int vertex;
    int[][] matriks;

    public GraphMatriks17(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    }

    void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung "+(char) ('A' + i)+": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung "+(char) ('A' + j)+" ( "+matriks[i][j]+" m), ");
                }
            }
            System.out.println();
        }
    }

    int outDegree(int v){
        int degree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[v][i] != 0) {
                degree++;
            }
        }
    return degree;
    }

    int inDegree(int v){
        int degree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][v] != 0) {
                degree++;
            }
        }
    return degree;
    }

    void printDegrees(){
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung "+ (char) ('A'+i)+"\nOutDeegre : "+outDegree(i)+" - InDegree : "+inDegree(i)+"\nTotal Degree adalah "+(outDegree(i)+inDegree(i)));
        }
    }

}
