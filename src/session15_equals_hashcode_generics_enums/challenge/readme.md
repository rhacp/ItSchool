# Challenge

---

1. Implement the equals() and hashCode() methods for a Rectangle class with width and height fields. Test that two
   instances with the same width and height return true for equals() and have the same hash code.
2. Create a Person class with name, age, and email fields. Implement the equals() method to check only the name and age
   fields. Implement the hashCode() method to use the name and age fields to calculate the hash code. Test that two
   instances with the same name and age return true for equals() and have the same hash code.
3. Create a Student class with name, age, studentId, and email fields. Implement the equals() method to check all fields
   except the studentId. Implement the hashCode() method to use all fields except the studentId to calculate the hash
   code. Test that two instances with the same name, age, and email return true for equals() and have the same hash
   code.
4. Create a Song class with title, artist, and length fields. Implement the equals() method to
   check only the title and artist fields. Implement the hashCode() method to use the title and
   artist fields to calculate the hash code. Test that two instances with the same title and artist
   return true for equals() and have the same hash code.
5. Create a Product class with name, price, and id fields. Implement the equals() method to
   check only the id field. Implement the hashCode() method to use the id field to calculate the
   hash code. Test that two instances with the same id return true for equals() and have the
   same hash code. Then change the id of one instance and test that they are no longer equal
   and have different hash codes.Challenge
6. Create an enum called LightColor that represents the three colors of a traffic light: red,
   yellow, and green. Each color should have a string representation and a duration (in seconds)
   associated with it (e.g., red = "Stop", 30 seconds; yellow = "Caution", 5 seconds; green =
   "Go", 45 seconds).
7. Given a list of objects representing database entities with fields such as id, name, and
   timestamp, ensure that no two entities are considered equal if their id fields are different.
8. Simulate a cache where objects are stored. Objects with the same hashcode should
   overwrite existing objects in the cache. Consider how would you design the hashcode
   method to facilitate this.
9. Create a method that returns a JSON representation of an object. The method should make
   use of the toString method to facilitate this.
10. Implement the toString method in a class holding a large dataset to print a “summary”
    version of the dataset, facilitating debugging and logging.
11. Create a generic method to swap the positions of two elements in an array.
12. Create a class Pair which can hold a pair of objects, the objects can be of any type.
13. Create a day scheduler application that uses an enum to represent the days of the week. The
    application should be able to assign and retrieve activities for each day.
14. Create a simulation of a traffic light system using an enum to represent the different states
    of a traffic light.Challenge
15. Create a generic repository class for storing objects. The repository should use a HashMap
    internally. Override equals and hashcode methods to ensure the correct behavior of the
    repository.
16. Extend an enum representing car types to include properties such as average price and
    manufacturer. Override the toString method to provide a descriptive string representing
    each enum constant.Challenge

---

17. XML to JSON Conversion using External Library<br /><br />
    You are tasked with creating a Java application that reads an XML file and converts it to a JSON
    format. Utilize an external library such as Jackson or Gson to facilitate the XML to JSON conversion.
    Your application should be capable of handling complex XML structures with nested elements.<br /><br />
    This processor can be considered a module of your entire project and should be done in a package
    under sessionX - homework/challenges packages.<br /><br />
    On the next slide there is an example of an XML file that your application should be able to
    process.<br /><br />

```
<bookstore>
	<book>
		<isbn>123-456-789</isbn>
		<title>The Great Adventure</title>
		<author>John Doe</author>
		<price>19.99</price>
	</book>
	<book>
		<isbn>789-101-112</isbn>
		<title>Java Essentials</title>
		<author>Jane Doe</author>
		<price>29.99</price>
	</book>
</bookstore>
```

After processing the provided XML file, the pretty-printed JSON output in the console should resemble the following structure: 
```
{
  "bookstore": {
    "book": [
      {
        "isbn": "123-456-789",
        "title": "The Great Adventure",
        "author": "John Doe",
        "price": "19.99"
      },
      {
        "isbn": "789-101-112",
        "title": "Java Essentials",
        "author": "Jane Doe",
        "price": "29.99"
      }
    ]
  }
}
```