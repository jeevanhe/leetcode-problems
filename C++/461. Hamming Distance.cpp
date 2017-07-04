// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//
// Given two integers x and y, calculate the Hamming distance.
//
// Note:
// 0 ≤ x, y < 231.
//
// Example:
//
// Input: x = 1, y = 4
//
// Output: 2
//
// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
//        ↑   ↑
//
// The above arrows point to positions where the corresponding bits are different.
// https://en.wikipedia.org/wiki/Hamming_distance

class Solution {
public:
    int hammingDistance(int x, int y) {

        int num = x ^ y;
        int count = 0;
        for(int i=0; i<32; i++){
            if (num & 1 == 1)
                count++;
            num = num >> 1;
        }
        return count;
    }
};

//Runtime: 6 ms

class Solution {
public:
    int hammingDistance(int x, int y) {

        int num = x ^ y;
        int count = 0;
        while(num>0){
            if(num %2 == 1)
                count++;
            num /= 2;
        }
        return count;
    }
};

//Runtime: 3 ms
