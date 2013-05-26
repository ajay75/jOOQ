/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DateAsTimestampTDates extends org.jooq.impl.TableImpl<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord> {

	private static final long serialVersionUID = -277934348;

	/**
	 * The singleton instance of <code>TEST.T_DATES</code>
	 */
	public static final org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampTDates DATE_AS_TIMESTAMP_T_DATES = new org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampTDates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord> getRecordType() {
		return org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord.class;
	}

	/**
	 * The column <code>TEST.T_DATES.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord, java.lang.Integer> DATE_AS_TIMESTAMP_ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.T_DATES.D</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord, java.util.GregorianCalendar> DATE_AS_TIMESTAMP_D = createField("D", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new org.jooq.test._.converters.CalendarConverter()), this);

	/**
	 * The column <code>TEST.T_DATES.T</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord, java.util.GregorianCalendar> DATE_AS_TIMESTAMP_T = createField("T", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new org.jooq.test._.converters.CalendarConverter()), this);

	/**
	 * The column <code>TEST.T_DATES.TS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord, java.util.GregorianCalendar> DATE_AS_TIMESTAMP_TS = createField("TS", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new org.jooq.test._.converters.CalendarConverter()), this);

	/**
	 * The column <code>TEST.T_DATES.D_INT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord, java.lang.Integer> DATE_AS_TIMESTAMP_D_INT = createField("D_INT", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.T_DATES.TS_BIGINT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord, java.lang.Long> DATE_AS_TIMESTAMP_TS_BIGINT = createField("TS_BIGINT", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>TEST.T_DATES.I_Y</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord, org.jooq.types.YearToMonth> DATE_AS_TIMESTAMP_I_Y = createField("I_Y", org.jooq.impl.SQLDataType.INTERVALYEARTOMONTH, this);

	/**
	 * The column <code>TEST.T_DATES.I_D</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord, org.jooq.types.DayToSecond> DATE_AS_TIMESTAMP_I_D = createField("I_D", org.jooq.impl.SQLDataType.INTERVALDAYTOSECOND, this);

	/**
	 * Create a <code>TEST.T_DATES</code> table reference
	 */
	public DateAsTimestampTDates() {
		super("T_DATES", org.jooq.test.oracle2.generatedclasses.DateAsTimestampTest.DATE_AS_TIMESTAMP_TEST);
	}

	/**
	 * Create an aliased <code>TEST.T_DATES</code> table reference
	 */
	public DateAsTimestampTDates(java.lang.String alias) {
		super(alias, org.jooq.test.oracle2.generatedclasses.DateAsTimestampTest.DATE_AS_TIMESTAMP_TEST, org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampTDates.DATE_AS_TIMESTAMP_T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord> getPrimaryKey() {
		return org.jooq.test.oracle2.generatedclasses.Keys.DATE_AS_TIMESTAMP_PK_T_DATES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampTDatesRecord>>asList(org.jooq.test.oracle2.generatedclasses.Keys.DATE_AS_TIMESTAMP_PK_T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampTDates as(java.lang.String alias) {
		return new org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampTDates(alias);
	}
}
