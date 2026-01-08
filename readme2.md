
# Formations Manager (Java Console Application)

## Project Overview

**Formations Manager** is a Java console application created as part of a training evaluation project. The goal of the project is to allow users to view and filter training courses.

This implementation covers **Part 1** of the evaluation exercise: displaying available courses and filtering them. **Part 2** (shopping cart, user accounts, and order management) was not implemented.

The application is designed with a multi-layer architecture to facilitate future integration into a web application.

----------

## Features (Implemented)
-   Display all available trainings
-   Filter trainings by keyword
-   Show trainings available **in-person**
-   Show trainings available **remotely**
-   Menu-driven console interface


Each training has the following attributes:
-   Name
-   Description
-   Duration (in days)
-   Format (in-person or remote)
-   Price
----------

## Installation & Usage
**Database :**
1. **Open mariadb**

2. **Execute the scripts (don't forget to modify password)**

3. **Insert the database credentials into `src/fr/fms/daos/DAO.java`**

**Code :**
 
1**Clone the repository**

    `git clone https://github.com/rdpt03/FMS-JAVA-Eval-FormationsManager.git`
    `cd FMS-JAVA-Eval-FormationsManager`

2.  **Compile the Java source code**
    `javac -d bin src/fr/fms/**/*.java`

3.  **Run the main menu**
    `java -cp bin fr.fms.RunApp`

4.  **Follow the console prompts** to view or filter trainings.
----------
## Future Development (Part 2)
The second part of the exercise involves:
-   User account creation and login
-   Adding/removing trainings to a shopping cart
-   Placing orders associated with clients
-   Multi-layer business logic
-   Integration with a database for orders and clients

This part was **not implemented** in this project.

----------
## Technologies
-   Java 8+
-   SQL (database scripts included)
----------
## Notes
-   This project is an individual evaluation assignment for a training course.
-   Coding best practices were followed: proper naming, indentation, exception handling, and comments.
----------
## License
This project is for educational purposes only.