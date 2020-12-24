package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {
    private TodoService todoService = new TodoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String rawName = request.getParameter("deleteName");
        String rawCat = request.getParameter("deleteCategory");
        String name = new String(rawName.getBytes("ISO-8859-1"), "UTF-8");
        String category = new String(rawCat.getBytes("ISO-8859-1"), "UTF-8");
        todoService.deleteTodo(new Todo(name, category));
        response.sendRedirect("/todo.do");
    }
}
