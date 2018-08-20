#include <iostream>
#include <algorithm>
using namespace std;
/**
 * @autor Juan Pablo Camargo Lasso
 * A2OJ Problem #167. Windows
 * https://a2oj.com/p?ID=167
 */
int main(){
    int cases;
    int x1;
    int y1;
    int x2;
    int y2;
    int xx1;
    int yy1;
    int xx2;
    int yy2;
    int val = 0;
    cin >> cases;
    cin >> x1;
    cin >> y1;
    cin >> x2;
    cin >> y2;
    while(cases > 1){
        cin >> xx1;
        cin >> yy1;
        cin >> xx2;
        cin >> yy2;
		x1 = max(x1, xx1);
		y1 = max(y1, yy1);
		x2 = min(x2, xx2);
		y2 = min(y2, yy2);
		cases--;
    }
    for(int i = y1; i<y2; i++)
		for(int j = x1; j<x2; j++){
			val++;
		}
	cout << val;
    return 0;        
}
