# Final Keyword
* When a variable is declared with a final keyword, its value can’t be modified,
essentially, a constant. This also means that you must initialize a final
variable.

 * If the final variable is a reference, this means that the variable cannot be
re-bound to reference another object, but the internal state of the object
pointed by that reference variable can be changed i.e. you can add or
remove elements from the final array or final list.

 * Final keywords can be used to initialise constants

###### Initializing a final variable:
````
final int {name_of_variable} = {value};
````
Example:
~~~Java
final int pi = 3.14;
~~~
