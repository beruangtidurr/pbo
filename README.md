<h1>Association (--): </h1>

Example: Student -- Course
This shows that students take courses
A student can take multiple courses (1..*) and a course can have one student (1)
Basic relationship where objects are connected but independent


<h1>Dependency (..>):</h1>

Example: Order ..> PaymentProcessor
Order temporarily uses PaymentProcessor to process payments
Weaker relationship where one class uses another class temporarily


<h1>Aggregation (o--):</h1>

Example: University o-- Department
University contains departments
Departments can exist independently of the university
"Has-a" relationship where parts can exist without the whole


<h1>Composition (*--):</h1>

Example: Car *-- Engine, Car *-- Wheel
Car has an engine and wheels
Strong "has-a" relationship where parts cannot exist without the whole
If car is destroyed, its engine and wheels are also destroyed


<h1>Inheritance (<|--):</h1>

Example: Vehicle <|-- Car, Vehicle <|-- Motorcycle
Car and Motorcycle inherit from Vehicle
"Is-a" relationship
Child classes inherit properties and methods from parent class


<h1>Implementation (<|..):</h1>

Example: Payment <|.. CreditCardPayment, Payment <|.. CashPayment
CreditCardPayment and CashPayment implement Payment interface
Classes must implement all methods defined in the interface
Shows how different classes can provide different implementations of the same contract


![example image]([https://github.com/beruangtidurr/pbo/blob/Diagram/Example.png])
