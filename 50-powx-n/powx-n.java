class Solution {
    public double myPow(double x, int n) 
    {
        if (x == 0.0) return (n <= 0) ? Double.NaN : 0.0; // optional guard
        long N = n;                          // avoid overflow on -2^31
        if (N < 0) { x = 1.0 / x; N = -N; }  // handle negatives

        double ans = 1.0;
        double base = x;
        while (N > 0) {
            if ((N & 1L) == 1L) ans *= base; // if current bit set, multiply
            base *= base;                    // square for next bit
            N >>= 1;                         // shift to next bit
        }
        return ans;


        // // Brute force
        // if(x == 0.0)
        //     return 0.0;
        // double product = 1.0;
        // long N = n;
        // boolean neg = N < 0;
        // if(neg)
        //     N = -N;

        // for(long i = 0; i < N; i++)
        // {
        //     product *= x;
        // }        

        // return neg ? 1.0 / product : product;
    }
}