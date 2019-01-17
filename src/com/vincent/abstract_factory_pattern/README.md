- Work around a super-factory which creates other factories
- Comes under **creational pattern**
- Abstract factory pattern responsible for creating a factory of related objects without explicitly specifying their classes / declaring the concrete class
- Each generated factory gives the objects


### Participants in the factory
- AbstractFactory: declares a interface for operations that create abstract products 
- ConcreteFactory: implements operations to create concrete products 
- AbstractProduct: declares an interface for a type of product objects 
- Product: defines a product to be created by the corresponding ConcreteFactory; it implements the AbstractProduct interface
- Client: uses the interfaces declared by the AbstractFactory and AbstractProduct classes

*In the example shown, "Shape" is a abstract product since it is an interface for a type of product objects</br>
*AbstractFactory is an interface that will be extended by Concrete factory</br>
*FactoryProducer uses AbstractFactory, inistatiate them, use parameter to specify which AbstractFactory to use

![alt](https://www.tutorialspoint.com/design_pattern/images/abstractfactory_pattern_uml_diagram.jpg)

