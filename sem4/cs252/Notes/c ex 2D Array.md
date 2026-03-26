Opened 02-19-2026 23:09

Status:

Tags: [[c programming Arrays]]

# c ex 2D Array

1st approach - normal 2D Array
```
int a[4][3];

a[i][j] == *(int *)((char *)a + i*3*sizeof(int) + j*sizeof(int))
```

![[Screenshot 2026-02-25 120832.png]]

2nd approach - array of pointers to rows
works with jagged arrays
```
int *(a[4]);
for (int i=0; i<4; i++) {
	a[i] = (int *) malloc(sizeof(int) * 3);
	assert(a[i] != NULL);
}
```

![[Screenshot 2026-02-25 120845.png]]

3rd approach - a pointer to an array of pointers to rows
```
int **a;
a = (int **) malloc(4 * sizeof(int *));
assert(a != NULL);
for (int i=0; i<4; i++) {
	a[i] = (int *) malloc(3 * sizeof(int));
	assert(a[i] != NULL);
}
```

![[Screenshot 2026-02-25 120907.png]]
# References
[[CS252-Slides-Sprin2026.pdf]] 75-79