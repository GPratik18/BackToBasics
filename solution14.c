#include <stdio.h>

int main() {
    	int a;
	scanf("%d", &a);
	int b;
	scanf("%d", &b);
	int count=0;
	while(a<=b){
		a *= 3;
		b *= 2;
		count ++;
	}
	printf("%d",count);
    	return 0;
}