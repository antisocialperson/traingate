/*
TASK: numtri
ID: albert.28
LANG: C++
*/

#include <fstream>
#include <cmath>

using namespace std;

int main(){

	ifstream cin("numtri.in");
	ofstream cout("numtri.out");

	int r;
	cin >> r;
	int tri[r][r];
	for(int i = 0; i < r; i++){
		for(int j = 0; j <= i; j++){
			cin >> tri[i][j];
		}
	}

	for(int i = r-2; i >= 0; i--){
		for(int j = 0; j <= i; j++){
			tri[i][j] += max(tri[i+1][j], tri[i+1][j+1]); // only change nodes that need to be changed
		}
	}

	cout << tri[0][0] << endl; // taking the sums for each node

}	
