<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <style>
            body {
                background: linear-gradient(45deg, red, blue);
                backgroung-size: cover;
                color: white;
                align-items: center;
            }

            h1 {
                text-align: center;
            }

            .fall {
                border: 2px solid orange;
                background: blue;
                padding: 5px;
                max-width: 500px;
                height: 100px;
                margin: auto;
                font-size: 19px;
            }

            input {
                width: 250px;
            }

            button {
                position: relative;
                left: 170px;
                margin: 10px;
                width: 60px;
                height: 30px;
                cursor: pointer;
                border-radius: 5px;
            }

            button:hover {
                color: white;
                background: black;
            }
        </style>
    </head>

    <body>
        <h1>find the Longest Palindromic Substring</h1>
        <form class="fall" name="funcitons" action="<%=request.getContextPath()%>/functions" method="post">
            Enter the Palindromic String: <input class="check" type="text" name="pal" size="50"><br>
            <button type="submit">Submit</button>
            <button type="reset">Reset</button>
        </form>
        <h1> longest Palindromic SubString <br />
            <%=request.getAttribute("ans") %>
        </h1>
    </body>

    </html>