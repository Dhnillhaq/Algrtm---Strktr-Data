public class Faktorial {
    public int nilai;

    public Faktorial() {
        
    }
    int faktorialBF(int n){
        int faktor = 1;
        int i = 1;
        while (i <= n) {
            faktor = faktor * i;
            i++;
        }
        return faktor;
    }
    int faktorialDC(int n){
        if (n == 1) {
            return 1;
        } else {
            int faktor = n * faktorialDC(n - 1);
            return faktor;
        }
    }
}
