#include <iostream>
using namespace std;

int main() {
   int H, M;
   int T;
   
   cin >> H >> M;
   cin >> T;
   int A = M + T;

   if (A >= 60) {
      H = H + (A / 60);
      M = A % 60;
   }
   else{
      M = A;
   }
   
   
   if (H >= 24) {
      H = H-24;
   }

   cout << H << " " << M << endl;

   return 0;
}