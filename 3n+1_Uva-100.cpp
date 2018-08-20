#include<iostream>
#include<algorithm>
using namespace std;
/**
 * Autor: Juan Pablo Camargo Lasso (juancholasso)
 * UEB - UNAL
 * 
 * The Problem 3n+1 - UVa #100
 */

int main(){
	
	int i = 0;
	int j = 0;
	int k = 0;
	int k_ite = 0;
	bool swap_ = false;
	int max = 0;
	int max_ite = 1;
	
	while(cin>>i){
		cin >> j;
		if(j<i){
			swap(i,j);
			swap_=true;
		}
		for(k = i; k<=j; k++){
			k_ite = k;
			while(k_ite != 1){
				if(k_ite % 2 == 0)
					k_ite /= 2;
				else
					k_ite = (k_ite*3)+1;
				max_ite++;
			}
			if(max_ite > max)
				max = max_ite;
			max_ite = 1;
		}
		if(swap_)
			cout<<j<<" "<<i<<" "<<max<<endl;
		else
			cout<<i<<" "<<j<<" "<<max<<endl;
		max = 0;
		swap_ = false;
	}
}
