# Project 1
- [ ] Math Evaluator
	- [ ] Forgot to put the last operator at the end of rpn
		- [ ] Clear the entire stack at the end of parsing all nums
	- [ ] Parsing numbers with more than just the one's place
		- [ ] Different storage??
			- [ ] ASCII not enough
	- [ ] PARENTHESES NOT WORKING
		- [ ] and order of ops

# Project 3
```
#pragma once

  

#include "better_hash_table.hpp"

  

namespace cs251 {

  

class PalindromeProtocol {

public:

    /**

     * Find a palindrome subsequence of length >= 5.

     * Try to leverage a hash table and vector to efficiently solve this problem.

     *

     * @param requestIds: all the request ids in order

     * @return a vector of indices that form an odd-length palindrome subsequence of length >= 5,

     *         or empty vector if none exists.

     */

    std::vector<int> findValidPalindromeSubsequence(const std::vector<int>& requestIds) {

  

        /* code that works */

        std::vector<int> pairs = std::vector<int>(0);

        BetterHashTable<int, std::vector<int>> vals = BetterHashTable<int, std::vector<int>>();

  

        if (requestIds.size() < 5) {

            return std::vector<int>(0);

        }

        size_t n = requestIds.size();

        for (int i = 0; i < n; i++) {

            if (vals.containsKey(requestIds[i])) {

                pairs.push_back(requestIds[i]); // keep track of numbers that appear more than once

                vals.get(requestIds[i])->push_back(i);

            }

            else {

                vals.insert(requestIds[i], std::vector<int>(1, i));

            }

        }

        /* code that works */

  

        std::vector<int> values = std::vector<int>(0);

        std::vector<int> indices = std::vector<int>(0);

        for (int i = 0; i < pairs.size(); i++) {

            values.push_back()

        }

  
  

        return pairs;

    }

  

};

  

} // namespace cs251
```

```
#pragma once

  

#include "better_hash_table.hpp"

#include <vector>

  

namespace cs251 {

  

class PalindromeProtocol {

public:

    /**

     * Find a palindrome subsequence of length >= 5.

     * Try to leverage a hash table and vector to efficiently solve this problem.

     *

     * @param requestIds: all the request ids in order

     * @return a vector of indices that form an odd-length palindrome subsequence of length >= 5,

     *         or empty vector if none exists.

     */

    std::vector<int> findValidPalindromeSubsequence(const std::vector<int>& requestIds) {

        std::vector<int> pairs = std::vector<int>();;

        std::vector<int> indices = std::vector<int>(0);

        BetterHashTable<int, int> vals = BetterHashTable<int, int>();

        if (requestIds.size() < 5) {

            return std::vector<int>(0);

        }

        size_t n = requestIds.size();

  

        for (int i = 0; i < n; i++) {

            int id = requestIds[i];

            int *val = vals.get(id);

            if (val != nullptr) {

  

                // beginning

                int index = 0;

                while (index < indices.size() && indices[index] < index) {

                    index += 1;

                }

  

                auto interval_pair = pairs.begin() + index;

                auto interval_in = indices.begin() + index;

  
  

                pairs.insert(interval_pair, id);

                indices.insert(interval_in, *val);

  

                // end

                pairs.push_back(id);

                indices.push_back(i);

  

                vals.remove(id);

  

            }

            else {

                vals.insert(id, i);

  

            }

        }

        // search for valid palindrome

        std::vector<int> ret_vector = {0, 0, 0, 0, 0};

        int len = indices.size();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < len; j++) {

                for (int k = j + 1; k < len; k++) {

                    if (pairs[j] == pairs[k] && (indices[j] < i && indices[k] > i)) {

                        for (int l = 0; l < j; l++) {

                            for (int m = k + 1; m < len; m++) {

                                if (pairs[l] == pairs[m]) {

                                    return {indices[l], indices[j], i, indices[k], indices[m]};

                                }

                            }

                        }

                    }

                }

            }

        }

  
  

        return std::vector<int>(0);

    }

  

};

  

} // namespace cs251
```