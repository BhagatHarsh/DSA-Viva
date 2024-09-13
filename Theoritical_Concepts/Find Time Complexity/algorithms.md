# Time Complexity Algorithms

## Algorithm 1: O(n)

```python
def func(arr):
    total = 0
    for i in arr:
        total += i
    return total
```

## Algorithm 2: O(logn)

```python
def func(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    left = func(arr[:mid])
    right = func(arr[mid:])
    return merge(left, right)
```

## Algorithm 3: O(n^2)

```python
def func(arr):
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] > arr[j]:
                arr[i], arr[j] = arr[j], arr[i]
    return arr
```

## Algorithm 4: O(n log n)

```python
void func(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 1; j < n; j *= 2) {
            // Perform some constant time operation
            System.out.println("i: " + i + ", j: " + j);
        }
    }
}
```
