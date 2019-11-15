/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProductController extends HttpServlet {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAE-ArquitecturaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = (String)request.getParameter("action");
            int lastId;
            
            switch(action){   
                case "Create":
                    String name = (String)request.getParameter("nombre_producto");
                    String image_path = (String)request.getParameter("ruta_imagen");
                    String information = (String)request.getParameter("descripcion_producto");
                    BigDecimal unit_cost = new BigDecimal(request.getParameter("costo_unidad"));
                    int stock = (Integer.parseInt(request.getParameter("existencia")));
                    String departament = (String)request.getParameter("departamento");
                    
                    tx.begin();
                    try{
                        Query query = em.createQuery("SELECT Max(p.idProduct) FROM Product p");
                        
                        //Cuando se quiere insertar un producto en una tabla vacía el getSingleResult devuelve nulo lo cual provoca una excepción
                        if(query.getSingleResult()== null){
                            lastId = (Integer)1;
                        }else{
                        lastId = (Integer) query.getSingleResult();
                        lastId++;
                        }
                        Product createProduct = new Product(lastId, name, image_path, information, unit_cost, stock, departament);
                        out.println(createProduct.getIdProduct());
                        
                        em.persist(createProduct);
                        tx.commit();
                        out.println("Se insertó el producto de forma exitosa");
                    }catch(Exception e){
                        tx.rollback();
                        out.println(e);
                    }
                    break;
                case "Update":
                    break;
                case "Read":
                    int id = Integer.parseInt(request.getParameter("id_user"));                    
                    Product findProduct = em.find(Product.class, id);
                    tx.begin();
                    try{
                        tx.commit();
                        /*request.setAttribute("infoUser", userFind);
                        RequestDispatcher vista = request.getRequestDispatcher("users.jsp");
                        vista.forward(request, response);*/
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