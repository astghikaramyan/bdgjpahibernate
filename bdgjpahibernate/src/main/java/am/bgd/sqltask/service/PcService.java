package am.bgd.sqltask.service;

import am.bgd.sqltask.model.Pc;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by User on 13.09.2020.
 */
public interface PcService {
//    Pc add(Pc pc) throws SQLException;
//
//    Optional<Pc> get(int id) throws SQLException;

//
    Map<String, Double> getAvgPriceEachMaker() throws SQLException;
    Map<String, List<Pc>> getMakersPc() throws SQLException;
    Optional<List<Pc>> getAll() throws SQLException;
}
