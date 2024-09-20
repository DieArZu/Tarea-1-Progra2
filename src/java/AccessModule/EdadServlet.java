import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NombreEdadServlet")
public class EdadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));

        // Crear el mensaje según la edad
        String mensaje;
        if (edad >= 18) {
            mensaje = "Hola, " + nombre + ", eres mayor de edad.";
        } else {
            mensaje = "Hola, " + nombre + ", eres menor de edad.";
        }

        // Configurar la respuesta
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>" + mensaje + "</h2>");
        response.getWriter().println("</body></html>");
    }
}