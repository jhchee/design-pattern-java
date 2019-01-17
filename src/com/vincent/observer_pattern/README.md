- Used when there is one-to-many relationship between objects such as if one object is modified, its 
**dependent** objects are to be notified automatically
- Multiple observers over one studied subject 
- Observer pattern falls under behavioral pattern category

- Subject class contains method to call the update its attached observers
- The calling of update is immediate after the state of subject changes
- Changes to either subject or object will not effect the other (mutates the state of the other)

- Can add new observers at any time irrespective of the state of the subject object and without modifying the subject object