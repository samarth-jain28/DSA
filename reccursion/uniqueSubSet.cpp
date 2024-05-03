#include<iostream>
#include<set>

using namespace std;
set<string>sub_seq;
void solve(string in, string out=""){
    if(in.length()==0){
        sub_seq.insert(out);
        return;
    }
    string o1=out, o2=out;
    o2.push_back(in.at(0));
    in.erase(in.begin()+0);
    solve(in, o1);
    solve(in, o2);
   
}
int main(){
    cout<<"Enter a string: ";
    string s;
    cin>>s;
    solve(s);
    for(string str:sub_seq){
        cout<<str<<" ";
    }
    cout<<"\n\n\n";
    return 0;
}
