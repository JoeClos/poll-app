# Opinion Poll Application
### One-page website to showcase some poll sample. 
- The application shall inquiry from user without login or registration opinion to some topic in multiple choice format. 

- After answering, the app present the distribution of answers - <b> Work in progress. </b>
</br></br>

![poll](https://github.com/JoeClos/poll-app/assets/89244648/44a412ca-1075-42b2-a496-9bfb3cfdb47b)


## Technologies
 * UI
   - [React ](https://react.dev/)
   - [MUI- Material UI](https://mui.com/material-ui/getting-started/overview/)
   - [AOS](https://michalsnik.github.io/aos/) - Animate On Scroll Library
 * Back-End
   - [Java](https://www.java.com/en/download/)
   - [Maven 3](https://maven.apache.org/)
   - [Spring Boot 3.1.0](https://spring.io/projects/spring-boot) 
   - [MySQL Database](https://www.javatpoint.com/creating-mysql-database-with-xampp)

## Development environment
- [Node.js 18.14.2](https://nodejs.org/en) is installed.
### Environment setup
1. Install Node.js
2. Clone this repository or download ZIP. 
3. Set up database:
   - Update back-end repo `src/main/resources/application.properties` with appropriate connection parameters. 
   - Personally I installed and used XAMPP for creating MySQL database.

### Commands
- ### UI
  - ### `npm install`
    - Install the dependencies to the local `node_modules` folder and will install all modules listed as dependencies in `package.json`.
  - ### `npm start`
    - Runs UI locally and opens it in the default browser on: http://localhost:3000.
  - ### `npm run build`
    - Builds development version of the UI to the `./build` folder.
- ### Back-end
  - ### `mvn clean install`
  - ### `mvn spring-boot:run`. 
    - Service should start in `http://localhost:8080`.
