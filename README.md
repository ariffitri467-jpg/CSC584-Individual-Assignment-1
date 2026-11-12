# CSC584 Individual Assignment 1 - Personal Profile Web Application

A simple web application that collects personal profile details in an HTML form,
sends them to a Java Servlet using HTTP POST, and displays them on a styled JSP page.

**Data flow:** `index.html` (form) -> `ProfileServlet` (HTTP POST) -> `profile.jsp` (display)

## Technologies Used

* HTML5 and CSS3
* Java Servlet 3.1 and JavaServer Pages (JSP)
* JDK 8, Java EE 7 Web
* GlassFish Server 4.1 (bundled with NetBeans 8.2)
* NetBeans IDE 8.2 (Ant-based Java Web project, no Maven)

## Project Structure

```
PersonalProfile/
├── build.xml
├── nbproject/                 NetBeans project configuration
├── src/java/com/csc584/profile/ProfileServlet.java
├── web/
│   ├── index.html             form (Step 1 and 2)
│   ├── profile.jsp            profile display (Step 4)
│   ├── css/style.css          styling (Step 5)
│   └── WEB-INF/web.xml
└── screenshots/
```

## Requirements

* JDK 8
* NetBeans IDE 8.2 (Java EE bundle) with GlassFish Server 4.1 registered

## How to Run

1. Clone or download this repository.
2. In NetBeans: **File > Open Project** and select the `PersonalProfile` folder.
3. If NetBeans reports a missing server, right-click the project > **Properties > Run**
and select **GlassFish Server**.
4. Right-click the project and choose **Clean and Build**, then **Run**.
5. The browser opens `http://localhost:8080/PersonalProfile/`.
Fill in the form and click **Submit Profile**.

## Screenshots

|Form|Profile output|
|-|-|
|!\[Form](screenshots/form.png)|!\[Profile](screenshots/profile.png)|

## Author

* Name: YOUR NAME
* Student ID: YOUR STUDENT ID
* Programme: YOUR PROGRAMME

