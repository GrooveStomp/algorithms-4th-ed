public class Ch1_1_20
{
        private static double e = 2.71828;

        private static int factorial(int N)
        {
                int prod = 1;
                for(int i = 1; i <= N; i++)
                {
                        prod *= i;
                }
                return prod;
        }

        // I had a somewhat more verbose implementation that checked more cases.
        // This accomplishes the same and is more terse.
        private static int ln_rec(double n, double b)
        {
                if (b > n)
                {
                        return 0;
                }
                else
                {
                        return 1 + ln_rec(n/b, b);
                }
        }

        public static int ln(int N)
        {
                return ln_rec(factorial(N), e);
        }

        public static void main(String[] args)
        {
                int N = Integer.parseInt(args[0]);
                System.out.printf("ln(%d): %d\n", N, ln(N));
        }
}
