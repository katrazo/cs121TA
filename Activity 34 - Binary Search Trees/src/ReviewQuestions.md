1. What is Big O used for?
   
   **BigO is used to express time and space complexities of certain algorithms and data structures independent of the actual speed of the computer executing/storing them.**


2. What is
   
   a. recursion

      **Recursion occurs when the method calls itself inside its own code. Often, this is done with a recursive case and a base case with a return value.**

   b. its base case?
      
      **The base case is when there is no more reason for recursion and the recursive method ends.**


3. Describe how linear search works in Java.
   
   **Linear search goes through elements in order, one by one, and returns the matching element, assuming that it finds one.**


4. Describe how binary search works in Java.
   
   **Binary search uses a middle value and splits the data structure into a left and a right. If the midvalue is greater than the key, it splits up the left; if the midvalue is less than the key, it splits up the right. It does this recursively until the midvalue equals the key element.
   For a binary search, the data structure MUST be ordered.**


5. Describe generics in Java.

   **Generics allow a method to take in any type of parameter and access/mutate accordingly, independent of the parameters' object type. This is often done with `<E>` for element or `<T>` for type.** 