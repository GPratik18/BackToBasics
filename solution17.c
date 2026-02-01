/*

 1    3    4   10   11
 2    5    9   12   19
 6    8   13   18   20
 7   14   17   21   24
15   16   22   23   25
*/

#include<stdio.h>
void main(int n)
{
	int i=0, j=0, val = 1;
	for(;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d", val);
			if(i%2==0)
			{
				val = i+j+1;
			}
			else
			{
				val = i++;
			}
		}
		printf("\n");
	}


}