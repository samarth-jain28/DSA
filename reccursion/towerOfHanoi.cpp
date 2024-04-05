#include<iostream>
using namespace std;
void solve(string s,string h,string d,int n){
    if (n==1){
        cout<<"Move disk "<<n<<" from "<<s<<" to "<<d<<"\n";
        return;
    }
    solve(s,d,h,n-1);
    cout<<"Move disk "<<n<<" from "<<s<<" to "<<d<<"\n";
    solve(h,s,d,n-1);    
}
int main(){
    cout<<"Enter the number of Disks: ";
    int n;
    cin>>n;
    string s = "source" , d = "destination" , h = "helper";
    solve(s,h,d,n);
    cout<<"\n\n\n";
    return 0;
}
