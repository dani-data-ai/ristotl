package ai.chat2db.plugin.lineage;

import ai.chat2db.spi.MetaData;
import ai.chat2db.spi.model.*;
import ai.chat2db.spi.SqlBuilder;
import ai.chat2db.spi.ValueProcessor;
import ai.chat2db.spi.CommandExecutor;
import ai.chat2db.server.tools.base.wrapper.result.PageResult;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

public class LineagePlugin implements MetaData {

    @Override
    public List<Database> databases(Connection connection) { return Collections.emptyList(); }

    @Override
    public List<Schema> schemas(Connection connection, String databaseName) { return Collections.emptyList(); }

    @Override
    public List<Table> tables(Connection connection, String databaseName, String schemaName, String tableName) { return Collections.emptyList(); }

    @Override
    public List<String> tableNames(Connection connection, String databaseName, String schemaName, String tableName) { return Collections.emptyList(); }

    @Override
    public PageResult<Table> tables(Connection connection, String databaseName, String schemaName, String tableNamePattern, int pageNo, int pageSize) { return null; }

    @Override
    public Table view(Connection connection, String databaseName, String schemaName, String viewName) { return null; }

    @Override
    public List<String> viewNames(Connection connection, String databaseName, String schemaName) { return Collections.emptyList(); }

    @Override
    public List<Table> views(Connection connection, String databaseName, String schemaName) { return Collections.emptyList(); }

    @Override
    public List<Function> functions(Connection connection, String databaseName, String schemaName) { return Collections.emptyList(); }

    @Override
    public List<Trigger> triggers(Connection connection, String databaseName, String schemaName) { return Collections.emptyList(); }

    @Override
    public List<Procedure> procedures(Connection connection, String databaseName, String schemaName) { return Collections.emptyList(); }

    @Override
    public Function function(Connection connection, String databaseName, String schemaName, String functionName) { return null; }

    @Override
    public Trigger trigger(Connection connection, String databaseName, String schemaName, String triggerName) { return null; }

    @Override
    public Procedure procedure(Connection connection, String databaseName, String schemaName, String procedureName) { return null; }

    @Override
    public List<Type> types(Connection connection) { return Collections.emptyList(); }

    @Override
    public SqlBuilder getSqlBuilder() { return null; }

    @Override
    public TableMeta getTableMeta(String databaseName, String schemaName, String tableName) { return null; }

    @Override
    public String getMetaDataName(String... names) { return null; }

    @Override
    public ValueProcessor getValueProcessor() { return null; }

    @Override
    public CommandExecutor getCommandExecutor() { return null; }

    @Override
    public List<String> getSystemDatabases() { return Collections.emptyList(); }

    @Override
    public List<String> getSystemSchemas() { return Collections.emptyList(); }

    @Override
    public List<SimpleSequence> sequences(Connection connection, String databaseName, String schemaName) { return Collections.emptyList(); }

    @Override
    public Sequence sequences(Connection connection, String databaseName, String schemaName, String sequenceName) { return null; }

    @Override
    public List<String> usernames(Connection connection) { return Collections.emptyList(); }

    @Override
    public String sequenceDDL(Connection connection, String databaseName, String schemaName, String sequenceName) { return null; }

    @Override
    public List<Index> indexes(Connection connection, String databaseName, String schemaName, String tableName) {
        return Collections.emptyList();
    }
}