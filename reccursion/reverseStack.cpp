#include<iostream>
#include<stack>
using namespace std;

void insert(stack<int>&s,int temp){
    if(s.empty()==1){
        s.push(temp);
        return;
    }
    int temp2= s.top();
    s.pop();
    insert(s,temp);
    s.push(temp2);
}

void rev(stack<int>&s){
    if(s.empty()==1){
        return;
    }
    int temp = s.top();
    s.pop();
    rev(s);
    insert(s,temp);
}

int main(){
    int arr[] = {1,2,3,4,5,6};
    stack<int>s;
    for (int i : arr){
        s.push(i);
    }
    
    rev(s);

    while(!s.empty()){
        cout<<s.top()<<" ";
        s.pop();
    }
    cout<<"\n\n\n";
    return 0;
}
