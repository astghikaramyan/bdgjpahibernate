package am.bgd.sqltask.dao.daoimpl;

import am.bgd.sqltask.dao.PcDao;
import am.bgd.sqltask.model.Pc;
import am.bgd.sqltask.model.Product;
import am.bgd.sqltask.util.DatabaseConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * Created by User on 13.09.2020.
 */
public class PcDaoImpl implements PcDao {
    @Override
    public Optional<List<Pc>> fetchAll() throws SQLException {
        String q = "select code, pc.model,  speed, price, maker from pc join product on pc.model = product.model;";
        List<Pc> list = new LinkedList<>();
        Pc pc;
        try(Connection conn = DatabaseConnectionFactory.getInstance().getConnection();
            Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(q)){
            while (resultSet.next()){
                pc = new Pc();
                pc.setCode(resultSet.getInt(1));
                pc.setModel(resultSet.getString(2));
                pc.setSpeed(resultSet.getDouble(3));
                pc.setPrice(resultSet.getFloat(4));
                pc.setMaker(resultSet.getString(5));
                list.add(pc);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.of(list);
    }

    @Override
    public Map<String, List<Pc>> getMakersPc() throws SQLException {
//        String qu = "select code, pc.entity, speed,price, maker  from product left join pc on product.entity = pc.entity where type='pc' order by maker Asc;";
        String query = "select code, pc.model, speed,price, maker  from product join pc on product.model = pc.model where type='pc' order by maker Asc;";
        Map<String, List<Pc>> map = new HashMap<>();
        List<Pc> list;
        Pc pc;
        String maker;
        try(Connection conn = DatabaseConnectionFactory.getInstance().getConnection();
            Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(query)){
            while (resultSet.next()){
                list = new LinkedList<>();
                pc = new Pc();
                maker = resultSet.getString(5);
                pc.setCode(resultSet.getInt(1));
                pc.setModel(resultSet.getString(2));
                pc.setSpeed(resultSet.getDouble(3));
                pc.setPrice(resultSet.getFloat(4));
                pc.setMaker(maker);
                if(map.containsKey(maker)){
                    list = map.get(maker);
                    list.add(pc);
                    map.put(maker, list);
                }else{
                    list.add(pc);
                    map.put(maker, list);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map<String, Double> fetchAvgPriceEachMaker() throws SQLException {
        String q = "select maker, avg(price)  from product join pc on product.model = pc.model group by maker;";
        Map<String, Double> map = new HashMap<>();
        try(Connection conn = DatabaseConnectionFactory.getInstance().getConnection();
            Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(q)){
            while (resultSet.next()){
                map.put(resultSet.getString(1), resultSet.getDouble(2));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return map;
    }

    //    @Override
//    public Pc insert(Pc Pc) throws SQLException {
//        return null;
//    }
//
//    @Override
//    public Optional<Pc> fetch(int id) throws SQLException {
//        return null;
//    }
//    @Override
//    public User insert(User user) throws SQLException {
//        String query = String.format("insert into users (name, surname) values('%s', '%s');",
//                user.getName(), user.getSurname());
//        try (Connection connection = DatabaseConnectionFactory.getInstance().getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//            try (ResultSet resultSet = statement.getGeneratedKeys()) {
//                if (resultSet.next()) {
//                    user.setId(resultSet.getInt(1));
//                }
//            }
//        }
//        return user;
//    }
//
//
//
//    public class CountriesDaoSql implements CountriesDao{
//        @Override
//        public Optional<Countries> fetch(int id) throws SQLException {
//            String query = String.format("select * from countries where id = %s;", id);
//            try (Connection connection = DatabaseConnectionFactory.getInstance().getConnection();
//                 Statement statement = connection.createStatement();
//                 ResultSet resultSet = statement.executeQuery(query)) {
//                if (resultSet.next()) {
//                    Countries countries = new Countries();
//                    countries.setId(resultSet.getInt("id"));
//                    countries.setCountryName(resultSet.getString("counthry_name"));
//                    return Optional.of(countries);
//                }
//            }
//            return Optional.empty();
//        }
//
//        @Override
//        public List<Countries> fetchAll() throws SQLException {
//            String query = "select * from countries;";
//            try (Connection connection = DatabaseConnectionFactory.getInstance().getConnection();
//                 Statement statement = connection.createStatement();
//                 ResultSet resultSet = statement.executeQuery(query)) {
//                List<Countries> countries = new LinkedList<>();
//                while (resultSet.next()) {
//                    Countries country = new Countries();
//                    country.setId(resultSet.getInt("id"));
//                    country.setCountryName(resultSet.getString("country_name"));
//                    countries.add(country);
//                }
//                return countries;
//            }
//        }
//
//        @Override
//        public Countries insert(Countries country) throws SQLException {
//            String query = String.format("insert into countries (country_name)" +
//                            " value('%s');",
//                    country.getCountryName());
//            try (Connection connection = DatabaseConnectionFactory.getInstance().getConnection();
//                 Statement statement = connection.createStatement()) {
//                statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//                try (ResultSet resultSet = statement.getGeneratedKeys()) {
//                    if (resultSet.next()) {
//                        country.setId(resultSet.getInt(1));
//                    }
//                }
//            }
//            return country;
//        }

//    @Override
//    public Optional<User> fetch(int id) throws SQLException {
//
//        return Optional.empty();
//    }
}
