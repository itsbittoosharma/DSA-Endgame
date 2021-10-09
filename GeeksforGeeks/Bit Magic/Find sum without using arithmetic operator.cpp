/******************************************************************************
Problem  : Sum of two numbers without using arithmetic operators
Problem URL : https://practice.geeksforgeeks.org/problems/sum-of-two-numbers-without-using-arithmetic-operators/1/?page=2&query=page2
*******************************************************************************/

#include <iostream>
using namespace std;

int Sum( int num1 , int num2 ){
    while(num2!=0){
        unsigned carry = num1 & num2;
        num1 = num1 ^ num2;
        num2 = carry << 1;
    }
    return num1;
}

int main()
{
    int num1,num2;
    cout<<"\n\tEnter two numbers : ";
    cin>>num1>>num2;
    cout<<"\n\t\tSum of "<<num1<<" and "<<num2<<" is "<<Sum(num1,num2); 
    return 0;
}
