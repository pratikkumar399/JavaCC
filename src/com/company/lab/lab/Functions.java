// package lab;

// import java.io.IOException;
// import javax.servlet.*;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// /**
// * Servlet implementation class functions
// */
// @WebServlet(name = "functions", urlPatterns = { "/functions" })
// public class functions extends HttpServlet {
// protected void doPost(HttpServletRequest request, HttpServletResponse
// response)
// throws ServletException, IOException {
// String a = request.getParameter("pal");
// // String fun=request.getParameter("fun");
// try {
// // System.out.println(a+fun);
// int n = a.length();
// String ans;
// if (n <= 1) {
// ans = a;
// request.setAttribute("ans", ans);
// request.getRequestDispatcher("index.jsp").forward(request, response);
// } else {
// int len = 1, s = 0;
// int low, high;
// for (int i = 1; i < n; i++) {
// low = i - 1;
// high = i + 1;
// while (high < n && a.charAt(high) == a.charAt(i)) {
// high++;
// }
// while (high < n && a.charAt(low) == a.charAt(i)) {
// low++;
// }
// while (low >= 0 && high < n && a.charAt(low) == a.charAt(high)) {
// low--;
// high++;
// }
// int length = high - low - 1;
// if (len < length) {
// len = length;
// s = low + 1;
// }
// }
// ans = a.substring(s, s + len);
// request.setAttribute("ans", ans);
// request.getRequestDispatcher("index.jsp").forward(request, response);
// }
// } catch (Exception e) {
// System.out.println(e);
// }
// }
// }
