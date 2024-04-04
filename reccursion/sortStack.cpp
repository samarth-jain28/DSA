#include<iostream>
#include<stack>
using namespace std;

void insert(stack<int> &s , int temp){
    if(s.empty()==1||s.top()>=temp){
        s.push(temp);
        return;
    }
    int temp2 = s.top();
    s.pop();
    insert(s,temp);
    s.push(temp2);
}

void sortStack(stack<int> &s){
    if(s.empty()==1){
        return;
    }
    int temp = s.top();
    s.pop();
    sortStack(s);
    insert(s,temp);
}

int main(){
    int ar[] ={9,0,12,8,1,20,5}; 
    stack<int> s;
    for(int i : ar){
        s.push(i);
    }

    sortStack(s);

    while (!(s.empty())){
        cout<<s.top()<<" ";
        s.pop();
    }
    

    cout<<"\n\n\n";
}
