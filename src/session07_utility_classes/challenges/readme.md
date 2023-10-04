Challenge
1. Displaying Today's Date Description: Write a method named displayTodaysDate that, when called, prints the current date to the console. Expected Output: Today's date in the format YYYY-MM-DD.
2. Date Decomposition Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately. Input: A date in the format YYYY-MM-DD. Expected Output: makefile Copy code Year: YYYY Month: MM Day: DD
3. Create a Specific Date Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025. Expected Output: A date object for 2025-8-19.Challenge
4. Comparing User-Entered Dates
   Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false
   otherwise.
   Input: Two dates entered by the user in the format YYYY-MM-DD.
   Expected Output:
   true if both dates are equal.
   false if they are different.
5. Is Today a Specific Date?
   Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
   Expected Output:
   true if today's date is 2019-12-10.
   false otherwise.
6. Getting Current Time
   Description: Write a method named displayCurrentTime that prints the current time to the console.
   Expected Output: The current time in the format HH:MM:SS.Challenge
7. Date Arithmetic
   Description: Write a method named addWeeksToToday that accepts an integer as its argument. This integer denotes the number of weeks.
   The method should add this number of weeks to today's date and return the resultant date.
   Input: An integer n (e.g., 4).
   Expected Output: A date object that is n weeks from today.
8. Weekday Identifier
   Description: Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday,
   etc.) for that date.
   Input: A date in the format YYYY-MM-DD.
   Expected Output: The day of the week in string format (e.g., "Wednesday").
9. Interval Between Dates
   Description: Design a method titled daysBetween that reads two dates from the console and computes the total number of days between
   them.
   Input: Two dates given by the user in the format YYYY-MM-DD.
   Expected Output: An integer showcasing the difference in days between the two dates.Challenge
10. Date Authenticator
    Description: Engineer a method named isValidDate that captures a date string from the console and assesses if it conforms to a valid date
    format (YYYY-MM-DD). The method should also consider leap years when validating February dates.
    Input: A string of a date from the console.
    Expected Output:
    true if the input adheres to the date format and denotes a genuine date.
    false if otherwise.
11. Duration Since
    Description: Construct a method dubbed elapsedTimeSince that ingests a prior time (in the HH:MM:SS format) as its input and displays the
    time duration from that moment to the present.
    Input: A time given in the format HH:MM:SS.
    Expected Output: The time span given as X hours, Y minutes, Z seconds.
12. Time Conversion Across Zones
    Description: Develop a method named convertToTimeZone that collects a date and time from the console in the pattern YYYY-MM-DD
    HH:MM:SS and a timezone (like "EST", "PST"). The objective is to transmute the specified date and time to align with the provided timezone
    and then showcase the result.

    Input:

    Date and time structured as YYYY-MM-DD HH:MM:SS.
    A string indicating the timezone (e.g., "EST").
    Expected Output: The recalibrated date and time synchronized with the inputted timezone.Challenge
    Event Scheduler and Reminder

    Description:

    The Event Planner Corporation has hired you to create a Java application that manages event schedules and reminders. Clients of the Event
    Planner have busy schedules and need an automated system to help them organize their events and notify them of upcoming events.
    For this task, you're required to:
    Design classes that will help model and manage events.
    Use LocalDate and LocalDateTime for scheduling and timing purposes.

    Specifications:

    **Event Class**

    Attributes:

    ● eventName: A string containing the name of the event.
    ● eventDescription: A brief description of the event.
    ● eventDateTime: A LocalDateTime object that represents when the event will take place.
    ● reminderDateTime: A LocalDateTime object that indicates when the user should be reminded of the event.
   
    Methods:

    ● Constructors, getters, setters, etc.
    ● timeUntilEvent(): Returns the time remaining until the event.
    ● timeUntilReminder(): Returns the time left until the reminder should notify the user.Challenge
    Event Scheduler and Reminder
    Scheduler Class
    Attributes:
    ● events: A list containing multiple events.
    Methods:
    ● addEvent(Event e): Adds an event to the list.
    ● removeEvent(String eventName): Removes an event by its name.
    ● getUpcomingEvents(int n): Returns the next n upcoming events.
    ● getEventsOn(LocalDate date): Returns all events scheduled for a specific date.
    ● getPendingReminders(): Returns all reminders that are due to notify the user soon (e.g., in the next 24 hours).
    
    Example:

    Input:
    Output (when querying for next reminders):Challenge Event Scheduler and Reminder
    Hints: You will need to make use of LocalDate and LocalDateTime functionalities to compare times, determine the current time, and calculate durations. Think about how to structure your classes in an OOP manner to ensure clean code and clear relationships between classes. For extra complexity, consider adding a feature to handle recurring events (e.g., weekly or monthly).