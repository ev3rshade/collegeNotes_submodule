Opened 03-08-2026 13:32

Status:

Tags: [[unistd.h]]

prev: next:
# fork



---
# Active Recall

1 How many times is "Hello" printed in the code below?
```C
#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int
main()
{
  for (int i = 0; i < 5; i++) {
    fork();
  }
  printf("Hello\n");
}

```
||32. Each fork doubles the number of processes, 2^5 = 32||


---
# References
1 [linux manual page](https://man7.org/linux/man-pages/man2/fork.2.html)
2 [fork example (waterloo)](https://ece.uwaterloo.ca/~dwharder/icsrts/Tutorials/fork_exec/)