// Problem statement : Calculate square of a number without using *, / and pow()
// Link to the problem : https://www.geeksforgeeks.org/calculate-square-of-a-number-without-using-and-pow/#:~:text=Given%20an%20integer%20n%2C%20calculate,*%2C%20%2F%20and%20pow().&text=A%20Simple%20Solution%20is%20to%20repeatedly%20add%20n%20to%20result.

#include <bits/stdc++.h>
using namespace std;
 
int square(int n)
{
    // Base case
    if (n == 0)
        return 0;
 
    // Handle negative number
    if (n < 0)
        n = -n;
 
    // Get floor(n/2) using right shift
    int x = n >> 1;
 
    // If n is odd
    if (n & 1)
        return ((square(x) << 2) + (x << 2) + 1);
    else // If n is even
        return (square(x) << 2);
}
 
// Driver Code
int main()
{
    // Function calls
    for (int n = 1; n <= 5; n++)
        cout << "n = " << n << ", n^2 = " << square(n)
             << endl;
    return 0;
}
// The complexity of above solution is O(nLogn)
