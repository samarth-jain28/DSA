#include<iostream>
using namespace std;
void solve(string in,string out=""){
    if(in.length()==0){
        cout<<out<<" ";
        return;
    }
    string o1=out,o2=out;
    o2.push_back(in[0]);
    in.erase(in.begin()+0);
    solve(in,o1);
    solve(in,o2);
    return;
}
int main(){
    string s;
    cout<<"Enter string: ";
    cin>>s;
    solve(s);
    cout<<"\n\n\n";
}