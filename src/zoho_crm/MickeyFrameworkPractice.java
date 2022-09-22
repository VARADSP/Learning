//$Id$
package zoho_crm;

public class MickeyFrameworkPractice {

	public static void update() {
		Persistence per= (Persistence)BeanUtil.lookup("Persistence");
		// Sets the criteria to applied while updating the data into the datasource.
		UpdateQuery s = new UpdateQueryImpl("Employee");
		Criteria c = new Criteria(new Column("Employee", "FIRSTNAME"),"xxx", QueryConstants.EQUAL); 
		s.setCriteria(c);
		s.setUpdateColumn("FIRSTNAME","aaa"); 
		//update row 
		per.update(s);
	}
	
	
	public static void mickeyCode(String query) {
		  try {
		   if (query.equalsIgnoreCase("select")) {
		    //for date between
		//    
//		    SelectQuery sq = new SelectQueryImpl(Table.getTable("Table_Date"));
//		    sq.addSelectColumn(Column.getColumn("Table_Date", "ID"));
//		    sq.addSelectColumn(Column.getColumn("Table_Date", "DATE_COL"));
//		    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
//		    Criteria c = new Criteria(Column.getColumn("Table_Date", "DATE_COL"), new java.sql.Date[]{new java.sql.Date(sdf.parse("1978-11-17").getTime()), new java.sql.Date(sdf.parse("1980-02-05").getTime())}, QueryConstants.BETWEEN);
//		    sq.setCriteria(c);


		    SelectQuery selectQuery = new SelectQueryImpl(Table.getTable("CrmModules"));

		    selectQuery.addSelectColumn(Column.getColumn("CrmModules", "*"));

		    Join join = new Join(CRMMODULES.TABLE,CRMTAB.TABLE,new String[] {CRMMODULES.TABID},new String[] {CRMTAB.TABID},Join.INNER_JOIN);
		    selectQuery.addJoin(join);
		    Column countColumn = new Column(CRMMODULES.TABLE,CRMMODULES.MODULEID).count();
		    countColumn.setColumnAlias("countId");
		//    
//		    selectQuery.addSelectColumn(countColumn);
		//    
//		    selectQuery.addGroupByColumn(Column.getColumn(CRMMODULES.TABLE, CRMMODULES.MODULEID));
		//    
		    ArrayList<Long> values = new ArrayList<Long>();

		   // Criteria criteria = new Criteria(new Column("CrmModules", "fieldlabel"), "dds", QueryConstants.EQUAL);

//		    selectQuery.setCriteria(criteria);

		    selectQuery.setCriteria(new Criteria(Column.getColumn(CRMTAB.TABLE, CRMTAB.NAME), "C*", QueryConstants.LIKE));
		    selectQuery.addSortColumn(new SortColumn(Column.getColumn(CRMTAB.TABLE, CRMTAB.NAME), false)); 

		    DataObject dataObject = DataAccess.get(selectQuery);

		    Iterator iterator;

		    iterator = dataObject.getRows("CrmModules");

		    while (iterator.hasNext()) {
		     Row row = (Row) iterator.next();
		     //int count = (Integer)row.get("countId");
		     values.add((Long) row.get(CRMMODULES.MODULEID));
		    }

		    System.out.println(values);

		   } else if (query.equalsIgnoreCase("insert")) {

		    DataObject dataObject = DataAccess.constructDataObject();
		    Row row = new Row(CRMMODULES.TABLE);
		    row.set(CRMMODULES.FIELDLABEL, "dds10");
		    // row.set(CRMTAB.TABID,(Object)111111000000000040l); auto generated , DB sharding is used
		    // row.set(CRMMODULES.MODULEID,(Object)10);
		    row.set(CRMMODULES.MOVETORECYCLE, false);
		    row.set(CRMMODULES.SHOWMENU, true);
		    row.set(CRMMODULES.BASETABLE, "CrmForecastQuota");
		    row.set(CRMMODULES.PERSONALITY, "FORECASTQUOTAPERSONALITY");
		    row.set(CRMMODULES.DISPLAYCOLUMN, "DDS10");
		    dataObject.addRow(row);
		    //DataAccess.add(dataObject);
		    PersistenceCacheUtil.getPurePersistenceLiteHandle().add(dataObject);

		   } else if (query.equalsIgnoreCase("update")) {

		    UpdateQuery updateQuery = new UpdateQueryImpl(CRMMODULES.TABLE);
		    updateQuery.setCriteria(new Criteria(Column.getColumn(CRMMODULES.TABLE, CRMMODULES.MODULEID), 111113000000059008L, QueryConstants.EQUAL));
		    updateQuery.setUpdateColumn(CRMMODULES.FIELDLABEL, "dds12");// NO I18N
		    // DataAccess.update(updateQuery);
		    PersistenceCacheUtil.getPurePersistenceLiteHandle().update(updateQuery);

		   } else if (query.equalsIgnoreCase("delete")) {

		    PersistenceCacheUtil.getPurePersistenceLiteHandle().delete(new Criteria(Column.getColumn(CRMMODULES.TABLE, CRMMODULES.FIELDLABEL), "dds12", QueryConstants.EQUAL));
		   }
		   else if(query.equalsIgnoreCase("create")) {

		    String tableName = "EmployeesLoans";
		    TableDefinition tableDef = new TableDefinition(false);
		    tableDef.setTableName(tableName);

		    ColumnDefinition colDef = new ColumnDefinition();
		    colDef.setTableName(tableName);
		    colDef.setColumnName("EMPID");
		    colDef.setDataType("INTEGER");
		    colDef.setMaxLength(5);
		    colDef.setNullable(false);
		    colDef.setKey(true);
		    tableDef.addColumnDefinition(colDef);

		    PrimaryKeyDefinition pkDef = new PrimaryKeyDefinition();
		    pkDef.setName(tableName+"_PK");
		    pkDef.setTableName(tableName);
		    pkDef.addColumnName("EMPID");

		    tableDef.setPrimaryKey(pkDef);
		    PersistenceCacheUtil.getPurePersistenceLiteHandle().createTable("Employee",tableDef);


		    //to/ to add a new column to the "Employee" table

		    AlterTableQuery atq = new AlterTableQueryImpl("Employees", AlterTableQuery.ADD_COLUMN);
		    atq.setColumnName("Joining_DT");
		    atq.setDataType("DATE");

		    //atq.setMaxLength(new Integer(10));

		    PersistenceCacheUtil.getPurePersistenceLiteHandle().alterTable(atq);

		    PersistenceCacheUtil.getPurePersistenceLiteHandle().dropTable("Employees");


		   }
		   else if(query.equalsIgnoreCase("union")) {

		    SelectQuery selectQuery1 = new SelectQueryImpl(Table.getTable("CrmModules"));
		    SelectQuery selectQuery2 = new SelectQueryImpl(Table.getTable("CrmModules"));
		    selectQuery1.addSelectColumn(Column.getColumn(CRMMODULES.TABLE, CRMMODULES.DISPLAYCOLUMN));
		    selectQuery1.setCriteria(new Criteria(Column.getColumn(CRMMODULES.TABLE, CRMMODULES.DISPLAYCOLUMN),"C*",QueryConstants.LIKE));
		    selectQuery2.addSelectColumn(Column.getColumn(CRMMODULES.TABLE, CRMMODULES.DISPLAYCOLUMN));
		    selectQuery1.setCriteria(new Criteria(Column.getColumn(CRMMODULES.TABLE, CRMMODULES.DISPLAYCOLUMN),"F*",QueryConstants.LIKE));

		    UnionQuery unionQuery = new UnionQueryImpl(selectQuery1, selectQuery2, false);


		    DerivedTable dt = new DerivedTable("CrmDummyTable", unionQuery); // No I18N
		    SelectQuery finalQuery = new SelectQueryImpl(dt);
		    finalQuery.addSelectColumn(Column.getColumn(null, "*"));
		    DataObject dataObject = PersistenceCacheUtil.getPurePersistenceLiteHandle().get(finalQuery);

		    Iterator iterator = dataObject.getRows("CrmDummyTable");

		    while(iterator.hasNext()) {
		     Row row = (Row)iterator.next();
		    }

		   }
		  } catch (Exception e) {

		   e.printStackTrace();
		   e.getCause();
		  }
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
