// imports
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// * ******************************************************************************************************
// * Class Name    : FileProcessor.java                                                                   *
// * Description   : Reads person data from input.txt, writes formatted output.txt,                       *
// *                 and serializes data into people.xml using JAXB and Java NIO.                         *
// *                 Demonstrates modern file I/O, modular design, and XML serialization.                 *
// * Author        : Alejandro Palacio Caro                                                               *
// * Date Written  : July 6, 2025                                                                         *
// * References    : Java File I/O - Coding with John (YouTube), Java How to Program, 11/e chapter 15     *
// *                 JAXB API Documentation                                                               *
// * ******************************************************************************************************
public class FileProcessor {

    // * ********************************************************************************
    // * Function Name : main                                                           *
    // * Purpose       : Entry point to execute file reading, writing, and XML export   *
    // * Parameters    : String[] args - command-line arguments                         *
    // * Return        : void                                                           *
    // * Author        : Alejandro Palacio Caro                                         *
    // * Date Written  : July 6, 2025                                                   *
    // * Assignment    : Calls all major assignment tasks: reading, writing, serializing*
    // * ********************************************************************************
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        String xmlFile = "people.xml";

        List<Person> people = readInputFile(inputFile);
        writeOutputFile(outputFile, people);
        serializeToXML(xmlFile, people);

        System.out.println("Process completed successfully.");
    }

    //Note:since i cannot use a Wrapper class i ended up parsing Person objects
    // * ********************************************************************************
    // * Function Name : readInputFile                                                  *
    // * Purpose       : Reads person data from a CSV-style input file                  *
    // * Parameters    : String fileName - input file name                              *
    // * Return        : List<Person> - list of parsed Person objects                   *
    // * Author        : Alejandro Palacio Caro                                         *
    // * Date Written  : July 6, 2025                                                   *
    // * ********************************************************************************
    public static List<Person> readInputFile(String fileName) {
        List<Person> people = new ArrayList<>();
        Path path = Paths.get(fileName);

        if (!Files.exists(path)) {
            System.out.println("File not found: " + fileName);
            return people;
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length == 3) {
                    String name = tokens[0].trim();
                    int age = Integer.parseInt(tokens[1].trim());
                    String email = tokens[2].trim();
                    people.add(new Person(name, age, email));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        return people;
    }
    // Note: Learned this from source :(Java File Input/Output - It's Way Easier Than You Think) by coding with John-Online link https://www.youtube.com/watch?v=ScUJx4aWRi0&t=283s
    // * ********************************************************************************
    // * Function Name : writeOutputFile                                                *
    // * Purpose       : Writes formatted output to a text file  output.txt             *
    // * Parameters    : String fileName - output file name                             *
    // *                 List<Person> people - list of person objects                   *
    // * Return        : void                                                           *
    // * Author        : Alejandro Palacio Caro                                         *
    // * Date Written  : July 6, 2025                                                   *
    // * ********************************************************************************
    public static void writeOutputFile(String fileName, List<Person> people) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            for (Person p : people) {
                writer.write("Name: " + p.getName() + " | Age: " + p.getAge() + " | Email: " + p.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing output: " + e.getMessage());
        }
    }

    // * ********************************************************************************
    // * Function Name : serializeToXML                                                 *
    // * Purpose       : Serializes list of people into an XML file using JAXB          *
    // * Parameters    : String fileName - XML output file name                         *
    // *                 List<Person> people - list to serialize                        *
    // * Return        : void                                                           *
    // * Author        : Alejandro Palacio Caro                                         *
    // * Date Written  : July 6, 2025                                                   *
    // * ********************************************************************************
    public static void serializeToXML(String fileName, List<Person> people) {
        try {
            JAXBContext context = JAXBContext.newInstance(PeopleWrapper.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            PeopleWrapper wrapper = new PeopleWrapper(people);
            marshaller.marshal(wrapper, new File(fileName));
        } catch (Exception e) {
            System.out.println("Error serializing to XML: " + e.getMessage());
        }
    }

    // * ********************************************************************************
    // * Class Name    : PeopleWrapper                                                  *
    // * Description   : Wrapper class to act as XML root for a list of Person objects. *
    // *                 Required by JAXB to marshal collections into valid XML.        *
    // * Author        : Alejandro Palacio Caro                                         *
    // * Date Written  : July 6, 2025                                                   *
    // * ********************************************************************************
    @XmlRootElement(name = "people")
    public static class PeopleWrapper {
        private List<Person> person;

        public PeopleWrapper() {
        }

        public PeopleWrapper(List<Person> person) {
            this.person = person;
        }

        @XmlElement(name = "person")
        public List<Person> getPerson() {
            return person;
        }

        public void setPerson(List<Person> person) {
            this.person = person;
        }
    }
}
