package br.ucsal.sistem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.sistem.model.Usuario;

/**
 * Servlet implementation class LogingServlet
 */
@WebServlet("/LogingServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Usuario user = new Usuario();
		user.setLogin(login);
		user.setSenha(senha);

		if (this.autenticado(user)) {
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("dashboard.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("error", "Acesso Negado");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
	}

	private boolean autenticado(Usuario usuario) {
		boolean resultado = false;
		if (usuario != null && usuario.getLogin() != null && usuario.getSenha() != null
				&& usuario.getLogin().equals(usuario.getSenha())) {
			resultado = true;
		}
		return resultado;
	}

}
