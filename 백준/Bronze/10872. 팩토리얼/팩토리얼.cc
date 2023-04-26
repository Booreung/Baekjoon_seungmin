#include<stdio.h>
#include<stdlib.h>
#pragma warning(disable : 4996)
int factorial(int n) {
    if (n <= 1) return 1;
    else return (n * factorial(n - 1));
}

int main()
{
    int n;
    scanf("%d", &n);
    printf("%d", factorial(n));
    return 0;
}