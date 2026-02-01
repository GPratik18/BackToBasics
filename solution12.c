#include <stdio.h>

int main() {
    	int num;
	scanf("%d", &num);
	int k;
	scanf("%d", &k);

	for(int i=0;i<k;i++){
		if(num%10==0){
			num /= 10;
		}
		else{
			num -= 1;
		}
	}
	printf("%d", num);
    	return 0;
}