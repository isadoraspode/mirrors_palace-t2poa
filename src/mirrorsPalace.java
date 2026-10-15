import java.math.BigInteger;
import java.util.Scanner;

public class mirrorsPalace {

    public static BigInteger contar(int n, int k) {
        BigInteger[] descAnt = new BigInteger[n + 2];
        BigInteger[] sobeAnt = new BigInteger[n + 2];
        BigInteger[] desc = new BigInteger[n + 2];
        BigInteger[] sobe = new BigInteger[n + 2];
        java.util.Arrays.fill(descAnt, BigInteger.ZERO);
        java.util.Arrays.fill(sobeAnt, BigInteger.ZERO);

        for (int r = 0; r <= k; r++) {
            java.util.Arrays.fill(desc, BigInteger.ZERO);
            java.util.Arrays.fill(sobe, BigInteger.ZERO);

            for (int i = 1; i <= n; i++) {
                BigInteger v = (i == 1) ? (r == 0 ? BigInteger.ONE : BigInteger.ZERO) : desc[i - 1];
                if (r > 0) v = v.add(sobeAnt[i]);
                desc[i] = v;
            }
            for (int i = n; i >= 1; i--) {
                BigInteger v = (i == n) ? BigInteger.ZERO : sobe[i + 1];
                if (r > 0) v = v.add(descAnt[i]);
                sobe[i] = v;
            }

            BigInteger[] t;
            t = descAnt; descAnt = desc; desc = t;
            t = sobeAnt; sobeAnt = sobe; sobe = t;
        }
        return descAnt[n].add(sobeAnt[1]);
    }

    public static void main(String[] args) {
        int n, k;
        if (args.length >= 2) {
            n = Integer.parseInt(args[0]);
            k = Integer.parseInt(args[1]);
        } else {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            k = sc.nextInt();
        }
        if (n < 1 || k < 0) {
            System.out.println("Entrada inválida: n >= 1 e k >= 0");
            return;
        }
        System.out.println(contar(n, k) + " reflexões");
    }
}