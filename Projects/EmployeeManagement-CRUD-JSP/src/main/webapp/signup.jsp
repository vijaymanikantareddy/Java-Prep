<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Sign Up</title>
  </head>
  <body>
    <h1>Sign Up</h1>
    <form action="signup" method="post">
      <label for="email">Email: </label>
      <input type="email" name="email" placeholder="Enter Email" /><br />
      <br />
      <label for="password">Password: </label>
      <input type="password" name="password" placeholder="Enter Password" />

      <br />
      <br />
      <label for="password">Confirm Password: </label>
      <input
        type="password"
        name="confirm-password"
        placeholder="Enter Password Again"
      /><br />
      <br />
      <input type="submit" value="signup" />
    </form>
    
    <p>Are you an Existing User? <a href="index.html">Login</a></p>
  </body>
</html>
