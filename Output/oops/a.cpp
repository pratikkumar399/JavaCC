#include <iostream>
#include<vector>
using namespace std;

int main()
{
    vector<vector<int>> vec{
        {1,2,3,4},
        {4,3}
    };
    vector<int> vect{1,2,3,4,5};
    vec.push_back(vect);
    cout<<vec.size()<<endl;
    
    for(vector<int> i:vec){
        for(int it:i){
            cout<<it<<" ";
        }
    }

    return 0;
}