int sumOfAllDivisors(int n)
{
    int ans = 0;

    for (int i = 1; i <= n; i++)
    {
        ans += i * (n / i);
    }

    return ans;
}




// int sumOfAllDivisors(int n){
// 	// Write your code here.
// 	int totalSum=0;
// 	for(int i=1;i<=n;i++){
// 		int sq=sqrt(i);
// 		int divisorSum=0;

// 		for(int j=1;j<=sq;j++){
// 			if(i%j==0){
// 				divisorSum+=j;
// 				if(j!=i/j){
// 					divisorSum+=i/j;
// 				}
// 			}
// 		}
// 		totalSum+=divisorSum;
// 	}	
// 	return totalSum;
// }
