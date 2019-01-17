- Hide how objects are created and help make the overall system independent of how its objects are created
- Define an interface for creating an object, but let its related subclasses decide which classes to instantiate
- Used when the class does not know precisely which class of objects it must create

- Create object without exposing the creation logic to the client and refer to newly created object using a common interface
![alt](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)