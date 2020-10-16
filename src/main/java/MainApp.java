public class MainApp {
    int[][] cost = {
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 }
    };

    public static void main(String[] args) {
        System.out.println(new MainApp().minCost(4, 4));
    }

    //------- Rekursive Methode --------------
    int minCost(int m, int n) {
        // wegkosten zur zelle (0,0) = kosten der zelle (0,0)
        if(m == 0 && n == 0) {
            return cost[m][n];
        }

        // boundaries beachten!
        if(m == 0) {
            return cost[m][n] + minCost(m, n - 1);
        }
        if(n == 0) {
            return cost[m][n] + minCost(m - 1, n);
        }

        // rekursion
        return cost[m][n] + Math.min(minCost(m - 1, n), minCost(m, n - 1));

    }
}
