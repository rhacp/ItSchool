Challenge
---

1. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.<br /><br />
2. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.<br /><br />
3. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the students.<br /><br />
4. An abstract class has a constructor which prints "This is constructor of abstract class", an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class". A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method". Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result) <br /><br />
5. Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.<br /><br />
6. We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.<br /><br />
7. Smart Home Management System<br /><br />
   Description:<br />
   With the rise of the Internet of Things (IoT) and smart devices, homes are becoming increasingly automated. In this system, you are tasked with simulating the working of a Smart Home which integrates various devices, automations, user profiles, and external integrations like weather forecasting.<br /><br />
   Functional Requirements<br /><br />
   User Profiles:<br />
   ● Multiple users can be registered to a home: homeowner, family members, and guests.<br />
   ● Each user profile has varying control levels: homeowners have full control, family members have partial control (can't add or remove devices), and guests have limited control (can only control devices in common areas).<br />
   ● Users should be able to remotely control devices linked to their profile.<br /><br />
   Device Management:<br />
   ● Various types of devices can be added to the home: lights, thermostats, doors, windows, cameras, entertainment systems, etc.<br />
   ● Each device type can have unique functionalities: lights can dim, thermostats set temperatures, doors can lock/unlock, cameras can record or take snapshots, etc.<br />
   ● Devices can be assigned to specific rooms or areas.<br /><br />
   Automations & Scenes:<br />
   ● Users can create "scenes" which are predefined settings for multiple devices: e.g., "Night Mode" might dim the lights, lock all doors, and set the thermostat to a particular temperature.<br />
   ● Automations can be created based on triggers: e.g., if the outside temperature drops below a certain level, the heating should turn on.<br /><br />
   External Integrations:<br />
   ● Integrate with a weather service to fetch local weather conditions. This should influence automations: e.g., if it's about to rain, close all open windows.<br />
   ● Integrate with a local news API to flash breaking news on the entertainment system.<br /><br />
   Energy Management:<br />
   ● Monitor the energy consumption of each device.<br />
   ● Suggest energy-saving automations: e.g., if a room is empty and the lights are on for more than 10 minutes, turn them off.<br />
   ● Generate monthly energy reports showing the consumption patterns and savings from the automations.<br /><br />
   Security and Alerts:<br />
   ● If a door or window is opened at odd hours, send an alert to the homeowner.<br />
   ● Cameras should automatically start recording if an unrecognized face is detected.<br />
   ● If smoke or fire detectors are triggered, alert all users and switch on all lights for safety.<br /><br />
   Voice Commands: <br />
   ● Simulate voice commands that users can give to control devices: e.g., "Turn off the living room lights" or "Set thermostat to 22 degrees".<br /><br />
   Maintenance: 
   ● Devices should have a "health" or "status" associated with them. If a device is malfunctioning or low on battery, an alert should be sent for maintenance.<br />
   ● Schedule routine checks for devices.<br />