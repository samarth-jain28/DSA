#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> v1 = {1,2,3,4,5};
    vector<int> v2 {6,7,8,9};      
    vector<int> v3(5,1);  


    for(int i:v1){
        cout<<i<<endl;
    }
    cout << v1.back()<<endl;
    for(int i:v1){
        cout<<i<<endl;
    }



    cout<<"\n\n\n";
}
