# AI Usage
Only the supercharged Intellisense was used in terms of AI. Did not use prompts or the chat function. Corrected variable names, clerical errors, and if the AutoComplete was irrelevant I didn't use it.

# Design rationale
- The abstract implementation is more scalable and better in my opinion as the code is more concise. In the interface implementation, variables could not be defined unless they were static and constant. Therefore, I had to define ~10 variables in each class that I didn't in the abstract implementation. Another advantage is that functionality is not split up across files. Since Java requires each file to be a class, interface, whatever, I had 2 files with only 3 lines of code defining the interface. The abstract class approach offers more flexibility and allows us to reuse more code.

### Polymorphism
- Polymorphism is more useful in the abstract implementation as well