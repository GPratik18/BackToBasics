#include <stdio.h>

int main() {
    	int num;
	scanf("%d", &num);
	int n;
	for(int i=0;i<num;i++){
		scanf("%d", &n);
		if(n%4==0){
			printf("Bob\n");
		}
		else{
			printf("Alice\n");
		}
	}
    	return 0;
}