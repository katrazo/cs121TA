# Tips:

This is going to sound weird: Your `main()` method will throw errors. **That's on purpose.**

This activity shows you why you __should__ make ~~almost~~ everything private and why you **should** use getters and setters--by showing you firsthand how confusing it is __when you *don't* do that__. Roll with it.

---

The four methods do NOT have to be getters/setters. They can be, but don't need to be. Moreover, the four method keywords are, from most restrictive to least:

- `private`: only accessible inside that class
- `none (default)`: aka "private-package"; only accessible by classes in the same package
- `protected`: only accessible by classes in the same package or by subclasses
- `public`: accessible everywhere

When your method calls in `main()` cause errors, comment them out.

---

When seeing "which variables can run," access them **DIRECTLY**.

For example, if your object is an instance of the class Student, and the object has a name variable:
- Do NOT use `myStudent.setName()` or `myStudent.getName()`
- **Instead, use `myStudent.name = <...>` or `System.out.println(myStudent.name)`**

When this way of doing things in `main()` causes errors, comment the lines out.

---