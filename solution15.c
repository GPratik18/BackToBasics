#include <stdio.h>

int main() {
    	int num;
	int c, c1;
	scanf("%d", &num);
	scanf("%d", &c);
	for(int i=1;i<num;i++){
		scanf("%d", &c1);
		if(c == c1){
			printf("%d", i);
			return 0;
		}
		else{
			printf("%d", c1);
		}
		c = c1;
	}
	printf("%d", 0);
    	return 0;
}