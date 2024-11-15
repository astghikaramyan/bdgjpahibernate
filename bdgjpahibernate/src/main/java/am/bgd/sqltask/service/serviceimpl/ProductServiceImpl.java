package am.bgd.sqltask.service.serviceimpl;

import am.bgd.sqltask.dao.ProductDao;
import am.bgd.sqltask.dao.daoimpl.ProductDaoImpl;
import am.bgd.sqltask.model.Product;
import am.bgd.sqltask.service.ProductService;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 13.09.2020.
 */
public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;

    public ProductServiceImpl(){
        this.productDao = new ProductDaoImpl();
    }
    @Override
    public List<String> getMakersByType(String type) throws SQLException {
        return this.productDao.fetchAllMakers(type);
    }

    @Override
    public Map<String, Integer> getModelCountByMakers() throws SQLException {
        return this.productDao.fetchModelCountByMakers();
    }

    @Override
    public Map<String, Integer> getMakersByTypeCount() throws SQLException {
        return this.productDao.fetchMakerByTypeCount();
    }

    @Override
    public List<String> getMakersOfLaptopWichDontMakePrinters() throws SQLException {
        return productDao.fetchMakersOfLaptopWichDontMakePrinters();
    }
}
