package com.geekbrains.productapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    private Product[] products;

    //    http://localhost:8080/store/products
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("Log: ProductServlet");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.printf("<html><head><title>МАГАЗИН</title></head><body><h1 align =\"center\">Популярные товары</h1><hr>");
        for (Product pr : products) {
            out.printf("<h2>" + pr.toString() + "<h2>");
        }
        out.printf("<footer><hr><p align=\"center\" =>Лучший магазин</p></footer></body></html>");
        out.close();
    }

    @Override
    public void init() {
        products = new Product[]{
                new Product(1, "MyPhoneX", 25000.00),
                new Product(2, "TV Samgnus", 20000.00),
                new Product(3, "TVbox IM", 10000.00),
                new Product(4, "StantionPlay III", 13000.00),
                new Product(5, "Headphones SuperSound2", 5000.00)
        };
    }
}
