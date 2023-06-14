/*
There are N bags with diamonds in them. The i'th of these bags contains A[i] diamonds. If you drop a bag with A[i] diamonds, it changes to A[i]/2 diamonds and you gain A[i] diamonds. Dropping a bag takes 1 minute. Find the maximum number of diamonds that you can take if you are given K minutes.
*/
#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    long long maxDiamonds(int A[], int N, int K) {
        long long res = 0;
        
        priority_queue<int>pq;
        
        for(int i=0;i<N;i++)
        {
            pq.push(A[i]);
        }
        
        while(K--)
        {
            res += (long long)(pq.top());
            int t = pq.top()/2;
            pq.pop();
            pq.push(t);
        }
        return res;
    }
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N,K;
        
        cin>>N>>K;
        int A[N];
        
        for(int i=0; i<N; i++)
            cin>>A[i];

        Solution ob;
        cout << ob.maxDiamonds(A,N,K) << endl;
    }
    return 0;
}

