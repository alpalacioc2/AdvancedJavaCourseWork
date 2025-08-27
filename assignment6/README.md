– Alejandro Palacio Caro  
– Assignment #6: File I/O, NIO, and XML Serialization

– This program reads person data from a file (`input.txt`), writes it in a formatted style  
to another file (`output.txt`), and serializes the data to an XML file (`people.xml`) using JAXB.  
It demonstrates Java NIO (`Paths`, `Files`) for file access and modular design using multiple methods.

– Files included in this assignment:
• FileProcessor.java — Main logic for reading, writing, and serializing
• Person.java — Class representing a person with name, age, and email
• input.txt — Sample input file containing comma-separated person data
• output.txt — Output file containing formatted lines per person
• people.xml — XML file containing serialized person data
• README.md — This file with setup and usage instructions

– To compile and run this project using Terminal (macOS or Linux):

    1. Open Terminal and navigate to the directory with your source files.

    2. Compile using:
        javac FileProcessor.java Person.java

       This will generate:
           FileProcessor.class
           Person.class

    3. Ensure `input.txt` is in the same directory.

    4. Run the program with:
        java FileProcessor

– To run this project in IntelliJ IDEA:

    1. Open the project folder in IntelliJ IDEA.
    2. Make sure `input.txt` is in the root directory (next to the `src` folder if needed).
    3. Run `FileProcessor.java` using the Run button or terminal.

– Output:
• `output.txt` will contain formatted person data.
• `people.xml` will contain a structured XML version of the data.

– Notes:
• JAXB requires a no-argument constructor and XML annotations in the `Person` class.
• The wrapper class `PeopleWrapper` is used internally to allow JAXB to serialize the list.

