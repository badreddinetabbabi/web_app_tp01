package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnexionAction
 */
@WebServlet("/ConnexionAction")
public class ConnexionAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnexionAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupérer les paramètres du formulaire
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        // Préparer la réponse
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Afficher les paramètres
        out.println("<html><body>");
        out.println("<h1>Paramètres reçus :</h1>");
        out.println("<p>Nom : " + login + "</p>");
        out.println("<p>Mot de passe : " + password + "</p>");
        out.println("</body></html>");
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupérer les paramètres du formulaire
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        // Préparer la réponse
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Afficher les paramètres
        out.println("<html><body>");
        out.println("<h1>Paramètres reçus :</h1>");
        out.println("<p>Nom : " + login + "</p>");
        out.println("<p>Mot de passe : " + password + "</p>");
        out.println("</body></html>");
        
        PrintWriter out1 = response.getWriter();
      //Récupérer la valeur du paramètre login" 
      String l = request.getParameter("login");
      //Afficher la valeur du paramètre
      out1.println("La valeur du nom est:"+l);
      //Récupérer la valeur du paramètre password" 
      String pwd = request.getParameter("password");
      //Afficher la valeur du paramètre
      out1.println("La valeur du mot de passe est:"+pwd);
      // validation
      if (l!=null && l.equals(""))
      {
      out1.append("Champs login vide. Merci de spécifier une valeur..");
      }
      if (pwd!=null && pwd.equals(""))
      {
      out1.append("Champs password vide. Merci de spécifier une valeur..");
      }
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
