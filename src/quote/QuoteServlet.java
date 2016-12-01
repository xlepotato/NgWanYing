package quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 152658F on 12/1/2016.
 */
@WebServlet(name = "QuoteServlet", urlPatterns = "/quote")
public class QuoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession session = request.getSession();
        String quote = request.getParameter("quote");
        String username = session.getAttribute("name").toString();

        QuoteDAO db = new QuoteDAO();
        Quote a = new Quote(username,quote);
        db.addQuote(a);
        request.setAttribute("quoteobj",a);
        getServletContext().getRequestDispatcher("/success.jsp").forward(request,response);

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("whaaaaaaaaaat");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        QuoteDAO db = new QuoteDAO();
        Quote quote = db.getRandomQuote();
        System.out.println(quote.getAuthor()+ quote.getQuote());
        HttpSession session = request.getSession();
        //String quote = db.getRandomQuote().getQuote();
        session.setAttribute("rdmquote",quote);
        session.setAttribute("name", name);
        session.setAttribute("age", age);

        getServletContext().getRequestDispatcher("/quote.jsp").forward(request, response);
    }
}
