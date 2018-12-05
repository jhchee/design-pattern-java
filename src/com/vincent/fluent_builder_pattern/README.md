**Preface**
1)  Original design pattern is very good dealing with complex objects but the design is a little complicated.
2)  This is an improved version of the builder pattern which is clean, highly readable (because it makes use of fluent design) and easy to use from client's perspective.
3)  When the complexity of creating object increases, the Builder pattern can separate out the instantiation process by using another object (a builder) to construct the object.

**Implementation**
1)  All the access modifiers on the fields are declared private since we don't want outer objects to access them directly.
2)  The constructor is also private so that only the Builder assigned to this class can access it.
3)  All of the properties set in the constructor are extracted from the builder object which we supply as an argument.
4)  Notice that same set of fields that outer class contains is declared in builder class again.
5)  Any mandatory fields are required as arguments to the inner class's constructor while the remaining optional fields can be specified using the setter methods.
6)  Line above means that the fields that are needed to initialise an object are passed into the builder while those remaining (considered optional field can be set later using setter method in original class).

**When to use builder pattern**
1)  When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters.
2)  When an increase in the number of constructor parameters leads to a large list of constructors.
3)  When client expects different representations for the object that's constructed.