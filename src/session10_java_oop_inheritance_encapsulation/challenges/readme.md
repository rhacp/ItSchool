Challenges
---

1. Create an Animal class with sound() method that prints to console “animal makes sounds”.<br />
   <br />
2. Create a Dog class that extends Animal and overrides sound() method; dogs make a particular sound, so we want to print “bark”, in this case<br />
   <br />
3. Create a Cat class that extends Animal and overrides sound() method, and in this case, we want to print in our method “meow”<br />
   <br />
4. Create a Wolf class that extends Animal, and overrides sound() method, and print “how”. <br />
   <br />
5.  Create a TestAnimal Class with a main method, create objects with each animal class created (dog, cat, wolf) and call sound()<br />
<br />
---

<br />

6. Exploring Different Types of Inheritance with the "Vehicles" Domain Model<br />
   For this exercise, we'll dive into the world of vehicles. Your task is to design three separate packages in Java to demonstrate the three types of inheritance: Single, Multilevel, and Hierarchical.<br />
   <br /><br />
   Package 1: Single Inheritance <br />
   Domain Model: Bicycles <br />
   <br />
   Classes:<br />
   ● Bicycle<br />
   ● MountainBike (inherits from Bicycle)<br /><br />
   Attributes:<br />
   ● Bicycle: speed, gear<br />
   ● MountainBike: tireType, suspension<br /><br />
   Methods:<br />
   ● Bicycle: changeGear(), speedUp(), applyBrake()<br />
   ● MountainBike: adjustSuspension()Challenge<br /><br />
   Package 2: Multilevel Inheritance<br />
   Domain Model: Cars<br /><br />
   Classes:<br />
   ● Car<br />
   ● ElectricCar (inherits from Car)<br />
   ● Tesla (inherits from ElectricCar)<br /><br />
   Attributes:<br />
   ● Car: make, model, year<br />
   ● ElectricCar: batteryCapacity, range<br />
   ● Tesla: autopilotVersion<br /><br />
   Methods:<br />
   ● Car: start(), stop(), accelerate()<br />
   ● ElectricCar: charge()<br />
   ● Tesla: enableAutopilot()Challenge<br /><br />
   Package 3: Hierarchical Inheritance<br />
   Domain Model: Watercraft<br /><br />
   Classes:<br />
   ● Boat<br />
   ● SpeedBoat (inherits from Boat)<br />
   ● FishingBoat (inherits from Boat)<br /><br />
   Attributes:<br />
   ● Boat: length, weight<br />
   ● SpeedBoat: maxSpeed, engineType<br />
   ● FishingBoat: fishCapacity, typeOfNet<br /><br />
   Methods:<br />
   ● Boat: sail()<br />
   ● SpeedBoat: turboBoost()<br />
   ● FishingBoat: castNet()<br /><br />
   Note: While the aforementioned attributes and methods are suggestions, feel free to be creative and add any other attributes or methods you
   deem relevant.<br /><br />

---
<br />

7. Bank Account Management System
   Imagine you're designing a simple Bank Account management system. Given the sensitive nature of financial information, you need to make sure that the data of an account holder is securely encapsulated and cannot be directly accessed or modified without appropriate checks.<br /><br />
   Requirements:<br /><br />
   Classes:<br />
   ● BankAccount<br /><br />
   Attributes:<br />
   ● accountHolderName: The name of the account holder.<br />
   ● accountNumber: A unique identifier for the bank account. This should be automatically generated and read-only after account creation.<br />
   ● balance: The current balance in the account. This should not be directly accessible.<br /><br />
   Methods:<br /> 
   ● deposit(double amount): Allow a specified amount to be added to the balance. Ensure the deposited amount is positive. <br />
   ● withdraw(double amount): Allow a specified amount to be subtracted from the balance. Ensure the account has enough funds and that the withdrawal amount is positive. If not, print an appropriate error message.<br />
   ● getBalance(): Return the current balance. This is the only way to access the balance attribute from outside the class. <br />
   ● getAccountDetails(): Print details about the account, including the account holder's name and account number.<br /><br />
   Instructions: <br />
   ● Use private access modifiers for the attributes to ensure they are not directly accessible from outside the BankAccount class. <br />
   ● Implement public methods to provide controlled access and modification of these attributes. <br />
   ● Ensure that all methods have necessary checks to protect the integrity of the account data.<br /><br />
   Bonus: <br />
   Implement a transferFunds(BankAccount targetAccount, double amount) method that allows money to be transferred from one account to another. Ensure all required checks are in place for a successful transaction.<br />