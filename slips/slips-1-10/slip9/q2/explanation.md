# Slip 9 – Q2: Interface vs Abstract Class

## What the program does
Side-by-side demonstration of:
1. **Abstract Class** (`Vehicle`) with a concrete method `displayBrand()` and
   abstract method `fuelType()` — implemented by `Car` and `ElectricCar`.
2. **Interface** (`Printable`, `Scannable`) — both implemented by `MultifunctionPrinter`
   to show **multiple interface implementation**.

## Java Concepts Used
- **Abstract Class** – `abstract class`, `abstract void`, concrete methods, constructors
- **Interface** – `interface`, multiple implementation
- **Inheritance** – `extends` for abstract class, `implements` for interface
- **@Override** – marks overriding methods

## Key Difference Table
| Feature | Abstract Class | Interface |
|---|---|---|
| Constructor | Yes | No |
| Concrete methods | Yes | Only `default` (Java 8+) |
| Multiple inheritance | No (single) | Yes |
| Fields | Yes (any type) | Only `public static final` |

## Syllabus Unit
**UNIT 1** – Interface, Abstract Class, Abstraction