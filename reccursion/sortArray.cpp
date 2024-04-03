#include<iostream>
#include<vector>
using namespace std;

void insert(vector<int>&v , int temp){
    if(v.empty()==1||v.back()<=temp){  //base condition
        v.push_back(temp);
        return;
    }
    int temp2 = v.back();
    v.pop_back();
    insert(v , temp);
    v.push_back(temp2);
}

void Sort(vector<int>&v){
    if(v.empty()==1){ //base condition
        return;
    }
    int temp = v.back();
    v.pop_back();
    Sort(v);          //hypothesis
    insert(v,temp);   //induction

}

int main(){
    vector<int> v{5,4,7,6,1,2,9,8};
    Sort(v);
    for(int i : v){
        cout<<i<<endl;
    }
    cout<<"\n\n\n";
}