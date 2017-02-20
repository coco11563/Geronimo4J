package pub.sha0w.geronimo.controller;

import org.apache.log4j.Logger;
import pub.sha0w.geronimo.model.HbaseCell;
import pub.sha0w.geronimo.util.PropsUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by coco1 on 2017/2/13.
 * SAMPLE HBASE CELL SERVLET CONTROLLER
 */
@WebServlet("/HbaseCell")
public class HbaseCellServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(HbaseCellServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO
    }
}
