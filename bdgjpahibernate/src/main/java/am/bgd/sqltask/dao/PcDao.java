package am.bgd.sqltask.dao;

import am.bgd.sqltask.model.Pc;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by User on 13.09.2020.
 */
public interface PcDao {
//     Pc insert(Pc Pc) throws SQLException;
//
//    Optional<Pc> fetch(int id) throws SQLException;

    Map<String, Double> fetchAvgPriceEachMaker() throws SQLException;
    Map<String, List<Pc>> getMakersPc() throws SQLException;
    Optional<List<Pc>> fetchAll() throws SQLException;
}
