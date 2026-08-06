class Solution {

    public int product(int n) {
        int product = 1;
        while (n > 0) {
            if (n / 10 != 0) {
                product *= n % 10;
            }
            n /= 10;
        }

        return product;
    } 

    public int smallestNumber(int n, int t) {

        for (int i = n; i <= 100; i++) {

            if (product(i) % t == 0 || i == t) { 
                return i;
            }

        }

        return -1;
    }
}