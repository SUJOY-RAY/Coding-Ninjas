bool checkArmstrong(int n){
	vector<int>digits;
	int copyN=n;
	while(n>0){
		int temp=n%10;
		digits.push_back(temp);
		n/=10;
	}
	
	int sum=0;
	for(int a:digits){
		sum+=pow(a,digits.size());
	}
	return (sum==copyN);
}
