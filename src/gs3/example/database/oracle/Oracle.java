package gs3.example.database.oracle;

import gs3.example.database.Database;

/**
 * Created by YG-MAC on 2017. 7. 8..
 */
public class Oracle implements Database {

    private OracleCore oracleCore = new OracleCore();
    private OracleConnector oracleConnector = new OracleConnector();

    @Override
    public void connect() {
        System.out.println("Oracle Connect");
    }

    @Override
    public void excute(String query) {
        oracleConnector.getPool();
        oracleCore.executeOracle();
    }
}
