package app.controllers;

import app.models.Product;
import app.models.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;
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


public class ProductController extends HttpServlet {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAE-ArquitecturaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String actionP = (String)request.getParameter("actionP");
            
            switch(actionP){   
                case "CreateP":
                    int lastId;
                    String name = (String)request.getParameter("product_name");
                    String file = (String)request.getParameter("image_path");
                    String information = (String)request.getParameter("description");
                    BigDecimal unit_cost = new BigDecimal(request.getParameter("unitCost"));
                    int stock = (Integer.parseInt(request.getParameter("stock")));
                    String departament = (String)request.getParameter("departament");
                    
                    tx.begin();
                    try{
                        Query query = em.createQuery("SELECT Max(p.idProduct) FROM Product p");
                        
                        if(query.getSingleResult() == null){
                            lastId = 1;
                        }else{
                            lastId = (Integer) query.getSingleResult();
                            lastId++;
                        }

                        Product createProduct = new Product(lastId, name, file, information, unit_cost, stock, departament);
                        out.println(createProduct.getName());
                        
                        em.persist(createProduct);
                        tx.commit();
                        out.println("Se insertó el producto de forma exitosa");
                        RequestDispatcher vista = request.getRequestDispatcher("products.jsp");
                        vista.forward(request, response);
                    }catch(Exception e){
                        tx.rollback();
                        out.println(e);
                    }
                    break;
                case "UpdateP":
                    int idP = Integer.parseInt(request.getParameter("id_product"));                    
                    Product productFindU = em.find(Product.class, idP);
                    
                    String nameU = (String)request.getParameter("product_name");
                    String fileU = (String)request.getParameter("image_path");
                    String informationU = (String)request.getParameter("description");
                    BigDecimal unit_costU = new BigDecimal(request.getParameter("unitCost"));
                    int stockU = (Integer.parseInt(request.getParameter("stock")));
                    String departamentU = (String)request.getParameter("departament");
                    
                    tx.begin();
                    try{
                        productFindU.setName(nameU);
                        productFindU.setImagePath(fileU);
                        productFindU.setInformation(informationU);
                        productFindU.setUnitCost(unit_costU);
                        productFindU.setStock(stockU);
                        productFindU.setDepartament(departamentU);
                        tx.commit();
                        System.out.println("El registro se modificó con éxito");
                        RequestDispatcher vista = request.getRequestDispatcher("products.jsp");
                        vista.forward(request, response);
                    }catch(Exception e){
                        tx.rollback();
                        System.out.println(e);
                    }
                    break;
                case "ReadP":
                    int id = Integer.parseInt(request.getParameter("id_product"));                    
                    Product productFind = em.find(Product.class, id);
                    tx.begin();
                    try{
                        tx.commit();
                        request.setAttribute("infoProduct", productFind);
                        RequestDispatcher vista = request.getRequestDispatcher("products.jsp");
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
