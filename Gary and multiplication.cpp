#include <bits/stdc++.h> 
vector<long long> multiplication(vector<int> & arr){
	int n=arr.size();
	vector<long long>ans;

	long long maxi=-1,secMax=-1,thirdMax=-1;

	long long prod=-1;
	for(int i=0;i<n;i++){
		if(arr[i]>=maxi){
			thirdMax=secMax;
			secMax=maxi;
			maxi=arr[i];
		}

		else if(arr[i]>=secMax){
			thirdMax=secMax;
			secMax=arr[i];
		}

		else if (arr[i]>thirdMax){
			thirdMax=arr[i];
		}
		if(maxi==-1||secMax==-1||thirdMax==-1){
			ans.push_back(-1L);
		}
		else{
			prod=maxi*secMax*thirdMax;
			ans.push_back(prod);
		}

	}
	return ans;

}
