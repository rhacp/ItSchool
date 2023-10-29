# Challenge

---

1. Given a list of integers, create a new list that contains only the even numbers. Use streams to achieve this. (Input:
   List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)<br /><br />
2. Using a list of strings, find and print the longest string using Java streams. (Input: List<String> strings =
   Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)<br /><br />
3. Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.<br /><br />
4. Given a list of strings, use streams to create a single string which is a concatenation of all strings separated by a
   comma. (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)<br /><br />
5. Given a list of people with attributes: first name, last name, and age; use streams to find all people who are older
   than 18 years. <br />
   class Person {<br /> String firstName;<br /> String lastName;<br /> int age;<br />
   } <br />
   List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));<br /><br />
6. Create a stream of integers from an array and find the sum of all integers using the reduce method. (Input: Integer[]
   numbers = {1, 2, 3, 4, 5};)<br /><br />
7. Use streams to transform a list of strings into a list of their respective lengths. (Input: List<String> strings =
   Arrays.asList("Hello", "World", "Java", "Streams");)<br /><br />
8. Given a string, use streams to count the number of vowels in it. (Input: String sentence = "Hello World";)<br /><br />
9. Given a list of sentences, use flatMap to create a list of all words in all the sentences, and then find the most
   frequently occurring word. (Input: List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome
   to the World of Java");)<br /><br />
10. Using streams, find the total number of characters across a list of strings excluding whitespace characters. (Input:
    List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)<br /><br />
11. Create a stream from a text file and use stream operations to find and print the longest word in the file. <br /><br />
12. Given a list of employee objects with attributes: name, department, and salary; find the department with the highest total
    salary. <br /><br />
13. Using a stream of strings representing numbers (e.g., "1", "2", "3"), convert them to integers and find
    the product of all numbers using reduce. (Input: List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");)<br /><br />
14. Given a list of products with attributes: name, category, and price; find the category with the highest average
    price.<br /><br />
15. Given a list of books with attributes: title, author, and year of publication; use streams to find all the books
    published before the year 2000 and group them by author in a map where the key is the author and the value is a list
    of titles of their books.