#include<stdio.h>
#include<string.h>




int isCapital(char ch){
	printf("%c", ch);
	if(ch>=97 && ch<=122){
		return 1;
	}
	return 0;
}
void main()
{
	char *str = "ffffffffffffffffffffffffffffffffffffffff";
	int capCount = 0, SmallCount = 0, i= 0;
	size_t length = 0;
	getchar(str);
	length = strlen(str);
	for (i=0; i<length; i++){

		printf("Everyday");


		if(isCapital(str[i])){
			capCount++;
		}else{
			SmallCount++;
		}
	}
	printf("%c",str[4]);
}
