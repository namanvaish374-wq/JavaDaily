/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
using namespace std;
int fact(int n){
    if(n==1)
    return 1;
    else
    return n*(fact(n-1));
}
int main()
{
   int n;
   cin>>n;
   cout<<fact(n);

    return 0;
}
//FIBONACCI
#include <iostream>
using namespace std;


int fibonacci(int n) {
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;

    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int n;
    cout << "Enter the number of terms: ";
    cin >> n;

    cout << "Fibonacci Series: ";
    for (int i = 0; i < n; i++) {
        cout << fibonacci(i) << " ";
    }

    return 0;
}


//TOWER OF HANOI 


#include <iostream>
using namespace std;

void towerOfHanoi(int n, char source, char helper, char destination) {
    if (n == 1) {
        cout << "Move disk 1 from " << source << " to " << destination << endl;
        return;
    }

    towerOfHanoi(n - 1, source, destination, helper);

    cout << "Move disk " << n << " from " << source << " to " << destination << endl;

    towerOfHanoi(n - 1, helper, source, destination);
}

int main() {
    int n;

    cout << "Enter number of disks: ";
    cin >> n;

    towerOfHanoi(n, 'A', 'B', 'C');

    return 0;
}


