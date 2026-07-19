#include <iostream>
using namespace std;
 
int main() {
    
    int n, k;
    cin >> n >> k;
    int a[n];
    // Input scores
    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int count = 0;
    int cutoff = a[k - 1];
    // Count qualified participants
    for(int i = 0; i < n; i++) {
        if(a[i] >= cutoff && a[i] > 0) {
            count++;
        }
    }
    cout << count;
    return 0;
}