# Collections Super Slip - Explanation

## What this project demonstrates
- `ArrayList` for dynamic ordered lists
- `Vector` as synchronized legacy list
- `HashSet` for uniqueness
- `TreeSet` for sorted unique values
- `HashMap` for key-value storage
- iterators, sorting, and searching

## Why these collections matter
- `ArrayList`: fast random access, common default list choice
- `Vector`: older synchronized list, still appears in syllabus slips
- `HashSet`: removes duplicates automatically
- `TreeSet`: stores sorted unique elements
- `HashMap`: fast key-based lookup

## Time complexity basics
- `ArrayList` search: O(n)
- `HashSet` average search: O(1)
- `TreeSet` search: O(log n)
- `HashMap` average lookup: O(1)

## Common mistakes
- expecting `HashSet` to preserve insertion order
- using `containsValue()` as if it were as fast as `containsKey()`
- forgetting that `TreeSet` sorts automatically
- assuming `Vector` is preferred over `ArrayList` in modern code
