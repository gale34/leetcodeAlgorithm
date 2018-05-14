#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> answer;
        for(int i = 0; i < nums.size(); i++)
        {
            if(target >= 0 && nums[i] > target)
                continue;
            else if(target < 0 && nums[i] < target)
                continue;

            int remain = target - nums[i];

            for(int j = 0; j < nums.size(); j++)
            {
                if(i == j)
                    continue;
                if(nums[j] == remain)
                {
                    answer.push_back(i);
                    answer.push_back(j);
                    return answer;
                }
            }
        }
        return answer;
    }
};

int main()
{
    cout << "Given nums = [2, 7, 11, 15], target = 9" << endl;
    cout << endl;
    cout << "Because nums[0] + nums[1] = 2 + 7 = 9, " << endl;
    cout << "return [0, 1]." << endl;

    vector<int> nums;
    nums.push_back(-1);
    nums.push_back(-2);
    nums.push_back(-3);
    nums.push_back(-4);
    nums.push_back(-5);
    Solution solution = Solution();
    vector<int> answer = solution.twoSum(nums,-8);
    cout << "Your Answer is ";

    for(int i = 0; i < answer.size(); i++)
        cout << answer[i] << " ";
    cout << endl;

    return 0;
}
