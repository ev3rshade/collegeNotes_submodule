Opened 03-30-2026 17:13

Status:

Tags:

# malloc implementation




---
# Active Recall

1 Assume the following code. With out malloc implementation which of the following will happen?
```C
int main() {

      char * p = (int *)malloc(10);

      strcpy(p, "1234567890123"); 

      free(p);

   }
```
  a) The string will be written into the user area of the object
  b) The string will overwrite the header of the object at the right
  c) The next and/or previous pointers will be overwritten.
  d) The program will have a SEGV due to a memory overwrite
  e) Future calls to malloc/free will crash
||a) because the allocation will be rounded up to the nearest multiple of 8, 16 bytes, a string literal of length 14 (bc a null terminator will be added) will fit into the user area just fine.||

---
# References