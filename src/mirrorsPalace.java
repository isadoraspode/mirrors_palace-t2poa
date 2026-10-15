import java.math.BigInteger;
import java.util.Scanner;

public class mirrorsPalace {

    static int n;
    static BigInteger[][][] memo;

    static BigInteger f(int j, boolean desce, int r) {
        if (r < 0) return BigInteger.ZERO;

        if (desce && j == n) return r == 0 ? BigInteger.ONE : BigInteger.ZERO;
        if (!desce && j == 0) return r == 0 ? BigInteger.ONE : BigInteger.ZERO;

        int d = desce ? 0 : 1;
        if (memo[j][d][r] != null) return memo[j][d][r];

        BigInteger res;
        if (desce) {
            res = f(j, false, r - 1).add(f(j + 1, true, r));
        } else {
            res = f(j, true, r - 1).add(f(j - 1, false, r));
        }
        memo[j][d][r] = res;
        return res;
    }

    public static BigInteger contar(int placas, int k) {
        n = placas;
        memo = new BigInteger[n + 1][2][k + 1];
        return f(0, true, k);
    }

    public static void main(String[] args) {
        int placas, k;
        if (args.length >= 2) {
            placas = Integer.parseInt(args[0]);
            k = Integer.parseInt(args[1]);
        } else {
            Scanner sc = new Scanner(System.in);
            placas = sc.nextInt();
            k = sc.nextInt();
        }
        if (placas < 1 || k < 0) {
            System.out.println("Entrada inválida: n >= 1 e k >= 0");
            return;
        }
        System.out.println(contar(placas, k) + " reflexões");
    }
}