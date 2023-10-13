#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    long long R;
    cin >> N >> R;
    cin.ignore(); // Consume the newline character after reading N and R
    string input;
    getline(cin, input); // Read the input line containing comma-separated strings

    vector<string> strings;
    stringstream ss(input);
    string item;
    
    // Split the comma-separated input into individual strings
    while (getline(ss, item, ',')) {
        strings.push_back(item);
    }

    vector<vector<string>> subsets;
    for (int i = 0; i < (1 << N); i++) {
        vector<string> subset;
        for (int j = 0; j < N; j++) {
            if (i & (1 << j)) {
                subset.push_back(strings[j]);
            }
        }
        subsets.push_back(subset);
    }

    // Sort subsets based on the number of elements and lexicographical order
    sort(subsets.begin(), subsets.end(), [&strings](const vector<string>& a, const vector<string>& b) {
        if (a.size() != b.size()) return a.size() < b.size();
        return lexicographical_compare(a.begin(), a.end(), b.begin(), b.end());
    });

    if (R > subsets.size()) {
        cout << "Rank is too large" << endl;
    } else {
        for (int i = 0; i < subsets[R - 1].size(); i++) {
            if (i > 0) cout << ",";
            cout << subsets[R - 1][i];
        }
        cout << endl;
    }

    return 0;
}
