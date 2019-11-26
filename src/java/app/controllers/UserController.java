package app.controllers;

import app.models.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserController extends HttpServlet {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAE-ArquitecturaPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = (String)request.getParameter("action");
            
            switch(action){
                case "Login":
                    String nicknameL = (String)request.getParameter("userI");
                    String passwordL = (String)request.getParameter("passwordI");
                    
                    Query queryL = em.createQuery("SELECT u.userType FROM User u WHERE u.nickname='"+nicknameL+"' AND u.password='"+passwordL+"'");
                    String a = queryL.getSingleResult().toString();
                    out.println(a);
                    HttpSession sesion = request.getSession();
                    sesion.setAttribute("user", nicknameL);
                    sesion.setAttribute("privilegio", a);
                    response.sendRedirect("products.jsp");
                    break;
                case "Register":
                    String nickname = (String)request.getParameter("userR");
                    String password = (String)request.getParameter("passwordR");
                    String email = (String)request.getParameter("emailR");
                    
                    tx.begin();
                    try{
                        Query query = em.createQuery("SELECT Max(u.idUser) FROM User u");
                        int lastId;
                        
                        if(query.getSingleResult() == null){
                            lastId = (Integer)1;
                        }else{
                            lastId = (Integer) query.getSingleResult();
                            lastId++;
                        }
                        
                        User userCreate = new User(lastId, nickname, password,"Customer","","","",email);
                        out.println(userCreate.getIdUser());
                        
                        em.persist(userCreate);
                        tx.commit();
                        out.println("Se insertó el usuario de forma éxitosa");
                        
                        response.sendRedirect("index.jsp");
                    }catch(Exception e){
                        tx.rollback();
                        out.println(e);
                    }
                    break;
                case "Insert":
                    String user = (String)request.getParameter("user");
                    String f_name = (String)request.getParameter("f_name");
                    String l_name = (String)request.getParameter("l_name");
                    String pass = (String)request.getParameter("password");
                    String mail = (String)request.getParameter("email");
                    String cellphone = (String)request.getParameter("cellphone");
                    String user_type = (String)request.getParameter("user_type");
                    
                    tx.begin();
                    try{
                        Query query = em.createQuery("SELECT Max(u.idUser) FROM User u");
                        int lastId = (Integer) query.getSingleResult();
                        lastId++;
                        
                        User userCreate = new User(lastId, user, pass,user_type, f_name, l_name, cellphone, mail);
                        out.println(userCreate.getIdUser());
                        
                        em.persist(userCreate);
                        tx.commit();
                        out.println("Se insertó el usuario de forma éxitosa");
                        RequestDispatcher vista = request.getRequestDispatcher("users.jsp");
                        vista.forward(request, response);
                    }catch(Exception e){
                        tx.rollback();
                        out.println(e);
                    }
                    break;
                case "Update":
                    int idU = Integer.parseInt(request.getParameter("id_user"));                    
                    User userFindU = em.find(User.class, idU);
                    
                    String userU = (String)request.getParameter("user");
                    String f_nameU = (String)request.getParameter("f_name");
                    String l_nameU = (String)request.getParameter("l_name");
                    String passU = (String)request.getParameter("password");
                    String mailU = (String)request.getParameter("email");
                    String cellphoneU = (String)request.getParameter("cellphone");
                    String user_typeU = (String)request.getParameter("user_type");
                    
                    tx.begin();
                    try{
                        userFindU.setNickname(userU);
                        userFindU.setFirstName(f_nameU);
                        userFindU.setLastName(l_nameU);
                        userFindU.setPassword(passU);
                        userFindU.setEmail(mailU);
                        userFindU.setCellphone(cellphoneU);
                        userFindU.setUserType(user_typeU);
                        tx.commit();
                        System.out.println("El registro se modificó con éxito");
                        RequestDispatcher vista = request.getRequestDispatcher("users.jsp");
                        vista.forward(request, response);
                    }catch(Exception e){
                        tx.rollback();
                        System.out.println(e);
                    }
                    break;
                case "Read":
                    int id = Integer.parseInt(request.getParameter("id_user"));                    
                    User userFind = em.find(User.class, id);
                    tx.begin();
                    try{
                        tx.commit();
                        request.setAttribute("infoUser", userFind);
                        RequestDispatcher vista = request.getRequestDispatcher("users.jsp");
                        vista.forward(request, response);
                    }catch(Exception e){
                        tx.rollback();
                        System.out.println(e);
                    }
                    break;
            }
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
