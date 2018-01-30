# date_difference 

Project environment
* java version "1.8.0_72"
* Apache Maven 3.3.9 
* OS name: "mac os x", version: "10.11.6", arch: "x86_64", family: "mac"

When in project directory  
To run the unit tests  
`mvn test`
To run the application
`mvn exec:java`

Sample input
```
Enter dates (DD MM YYYY, DD MM YYYY) or type exit to end: kdjvkjfvjfvk
Invalid input.
Enter dates (DD MM YYYY, DD MM YYYY) or type exit to end: 22 22 2222, 11 11 1111
Invalid date: 22 22 2222
Enter dates (DD MM YYYY, DD MM YYYY) or type exit to end: 02 01 1986, 31 12 1985
31 12 1985, 02 01 1986, 2
Enter dates (DD MM YYYY, DD MM YYYY) or type exit to end: 05 08 2000, 05 08 2001
05 08 2000, 05 08 2001, 365
```
