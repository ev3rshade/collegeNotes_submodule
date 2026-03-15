Opened 02-25-2026 12:12

Status:

Tags: [[🔴 c programming]]

prev: next:
# c programming Arrays

## Array Operator Equivalence
```
int a[20];
a[i]
*(a + i)
*(&a[0] + i)
*((int *) ((char *)&a[0] + i * sizeof(int)))
```



# References