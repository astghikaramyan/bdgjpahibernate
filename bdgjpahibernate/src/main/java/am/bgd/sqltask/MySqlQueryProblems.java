package am.bgd.sqltask;

import am.bgd.sqltask.service.LaptopService;
import am.bgd.sqltask.service.PcService;
import am.bgd.sqltask.service.PrinterService;
import am.bgd.sqltask.service.ProductService;
import am.bgd.sqltask.service.serviceimpl.LaptopServiceImpl;
import am.bgd.sqltask.service.serviceimpl.PcServiceImpl;
import am.bgd.sqltask.service.serviceimpl.PrinterServiceImpl;
import am.bgd.sqltask.service.serviceimpl.ProductServiceImpl;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by User on 13.09.2020.
 */
public class MySqlQueryProblems {
    public static void main(String[] args) throws SQLException {
        ProductService p = new ProductServiceImpl();
//        System.out.println(p.getMakersByType("pc"));
//        System.out.println(p.getModelCountByMakers());
//        System.out.println(p.getMakersByTypeCount());
        System.out.println(p.getMakersOfLaptopWichDontMakePrinters());

//        LaptopService  l = new LaptopServiceImpl();
//        System.out.println(l.getAvgPrice());
//
//        PcService p = new PcServiceImpl();
//        System.out.println(p.getAll().get());
//        System.out.println(p.getMakersPc());
//        System.out.println(p.getAvgPriceEachMaker());

//        PrinterService p = new PrinterServiceImpl();
//        System.out.println(p.getColoredPrinters().get());
//        System.out.println(p.getMakersPcAndColoredPrinters());




    }
}
