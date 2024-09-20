import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EdadServlet")
public class EdadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));

        // Configurar la respuesta
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Generar el mensaje personalizado
        if (edad >= 18) {
            out.println("<h1>Hola, " + nombre + ", eres mayor de edad.</h1>");
        } else {
            out.println("<h1>Hola, " + nombre + ", eres menor de edad.</h1>");
        }
    }
}