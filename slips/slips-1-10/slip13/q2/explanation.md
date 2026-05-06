# Slip 13 – Q2: Interface vs Abstract Class

## What the program does
Two side-by-side demonstrations:
1. **Abstract Class** `Animal` with concrete `breathe()` + abstract `sound()`,
   implemented by `Dog` and `Cat`.
2. **Interfaces** `Flyable` + `Swimmable` both implemented by `Duck` —
   showing **multiple interface implementation** (impossible with abstract class).

## Java Concepts Used
- **Abstract Class** – constructor, concrete method, abstract method
- **Interface** – all-abstract contract, `implements`, multiple inheritance
- **@Override** – marks overriding/implementing methods

## Key Difference Table
| Feature | Abstract Class | Interface |
|---|---|---|
| Constructor | ✅ Yes | ❌ No |
| Concrete methods | ✅ Yes | ❌ No (Java 7) |
| Multiple inheritance | ❌ Single only | ✅ Multiple |
| Fields | ✅ Any type | Only `public static final` |

## Syllabus Unit
**UNIT 1** – Interface, Abstract Class, Abstraction
