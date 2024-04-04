#include<iostream>
#include<stack>
using namespace std;

void dltMid(stack<int>&s , int k ){
    if (k==0){
        return;
    }
    int temp = s.top();
    s.pop();
    dltMid(s,k-1);
    if(k==2){}
    else{
        s.push(temp);
    }
}

int main(){
    int ar[] = {1,2,3};
    stack<int> s1 ;
    for(int a : ar){
        s1.push(a);
    }
    int k ;
    k= s1.size()%2!=0? s1.size():(s1.size()/2)+1;
    //cout<<k<<endl;
    dltMid(s1,k);

    while(!s1.empty()){
        cout<<s1.top()<<" ";
        s1.pop();
    }
    cout<<"\n\n\n";
    return 0;
}