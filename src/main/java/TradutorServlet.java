

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/traduzir")
public class TradutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TradutorServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String palavra = request.getParameter("palavra");
		Tradutor t = new Tradutor(palavra);
		String traducao = t.traducao();
		
		request.setAttribute("traducao", traducao);
		request.getRequestDispatcher("Traduzido.jsp").forward(request, response);
	}
}
