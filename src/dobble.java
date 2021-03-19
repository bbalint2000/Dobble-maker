public class dobble {
    public static void main(String[] args) {
        int i, j, k, cardnum = 0, n = 5;
        String symbols[] = {/*21 strings */};


        // elso n+1 kartya
        for (j = 0; j <= n; j++) {
            System.out.printf("kartya" + ++cardnum + ": "); // hanyadik kartya
            System.out.printf(symbols[0] + ",");   //elso minta
            for (k = 0; k < n; k++) {
                System.out.printf(symbols[n * j + k + 1] + ",");
            }
            System.out.println("");
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("kartya" + ++cardnum + ": ");
                System.out.printf(symbols[i + 1] + ",");
                for (k = 0; k < n; k++) {
                    System.out.printf(symbols[n + 1 + n * k + (i * k + j) % n] + ",");
                }
                System.out.println("");
            }
        }
    }
}

