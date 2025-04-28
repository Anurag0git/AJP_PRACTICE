## Problem Statement:  
Tumhe **Tomcat server** aur **Eclipse IDE** use karke ek simple sa login system banana hai using **Servlets**.

---
## Step 1: Setup Environment

1. **Download and Install**  
   - **Eclipse IDE for Enterprise Java Developers** (kyunki isme Java EE support hota hai).
   - **Apache Tomcat Server** (version 9 or 10, dono chalega).

2. **Tomcat ko Eclipse me Setup karo**  
   - Eclipse open karo → `Servers` tab → Right click → `New` → `Server` → Tomcat select karo → Path dikhado jahan Tomcat install kiya hai → Finish.

---

## Step 2: Create a Dynamic Web Project

- Eclipse → `File` → `New` → `Dynamic Web Project`.
- Project Name: `LoginApp` (ya kuch bhi, easy rakhna).
- Runtime: Select Tomcat server.
- Finish.

🎯 Tumhara project ban gaya.

---

## Step 3: Servlet Create Karna (`LoginController.java`)

**Right-click** on `src` folder → `New` → `Package` banao → Name: `com.candid`.

**Package ke andar**:  
Right-click → `New` → `Servlet` → Name: `LoginController`.

**Code paste karo** 👇:

```java
package com.candid;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String un = request.getParameter("username");
        String pw = request.getParameter("password");

        if (un.equals("admin") && pw.equals("admin")) {
            response.sendRedirect("success.html");
        } else {
            response.sendRedirect("error.html");
        }
    }
}
```

### 🚀 Intuition:
- Jab user **login** karega (form bhar ke submit karega), ye servlet `POST` request handle karega.
- Username aur Password ko fetch karega.
- `admin-admin` match hua → `success.html` dikhega.
- Nahi hua → `error.html` dikhega.

---

## Step 4: Create 3 Web Pages inside `WebContent` or `Webapp`

### a. `login.jsp`
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login Page</title>
</head>
<body>
    <h2>Sample login Example (try username: admin and password: admin)</h2>
    <form action="LoginController" method="post">
        Enter username : <input type="text" name="username"><br>
        Enter password : <input type="password" name="password"><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
```

---

### b. `success.html`
```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Success Page</title>
</head>
<body>
    <h2>Login Successful!</h2>
    <center>
        <big>Welcome to PCCOER College</big>
    </center>
</body>
</html>
```

---

### c. `error.html`
```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Error Page</title>
</head>
<body>
    <h2>Invalid username or password</h2>
</body>
</html>
```

---

## Step 5: Run the Project 🚀

- Right click on Project → `Run As` → `Run on Server`.
- Browser khulega → URL mein `http://localhost:8080/ProjectName/login.jsp` likho.
- Username & Password daalo:
  - Correct → success.html dikhega.
  - Galat → error.html dikhega.

---

## 📢 Final Intuition Summary:

- `login.jsp` se user data bhejta hai.
- `LoginController` Servlet woh data uthata hai aur verify karta hai.
- Agar sab sahi hai → success.html
- Agar kuch galat hai → error.html

---

## 🎯 One-Line Memory Trick:

> "**Form ➡️ Servlet ➡️ Logic ➡️ Redirect HTML Page**"

---
  
Agar tu chaahta hai, main isko ek **flowchart** ya **diagram** me bhi bana ke samjha du, taaki aur easily yaad rahe. 🚀  
Bata de!  
___

**Ready for diagram ya ek chhota project aur advance karne ke liye? 🔥**
