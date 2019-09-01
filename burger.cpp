#include <iostream>

using namespace std;

int main(){
	int l;

	while(cin >> l && l != 0){
		char cadena[l];
		cin >> cadena;
		
		int r = 0;
		int d = 0;
		int h = 2000000;
		int haux = 0;
		
		for(int i = 0; i<l; i++){
			if(cadena[i] == 'R'){
				r = i+1;
				break;
			}
		}
		for(int i = 0; i<l; i++){
			if(cadena[i] == 'D'){
				d = i+1;
				break;
			}
		}
		
		for(int i = 0; i<l; i++){
			if(cadena[i] == 'Z'){
				h = 0;
				break;
			}	
			
			if(cadena[i] == 'R'){
				r=i+1;
			}
			else if(cadena[i] == 'D'){
				d=i+1;
			}

			haux = abs(r-d);

			if(haux < h){
				h = haux;
			}
		}

		cout << h << endl;
	}
}
