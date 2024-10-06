class InnerMost {

    public static int inter(int n, int m) {
        if (n == 0) {
            return m;
        } else {
            return inter(n - 1, 2 * (m + n)); //Keeps parentheses to show intermost
        }
    }

    public static int outer(int n, int m){
        if (n == 0) {
            return m;
        } else {
            return outer(n - 1, 2*m + n); //Takes off parentheses to show outermost
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int result = inter(n, m);
        int result2 = outer(n, m);
        System.out.println("Intermost Result: " + result);
        System.out.println("Outermost Results: " + result2);
    }
}
