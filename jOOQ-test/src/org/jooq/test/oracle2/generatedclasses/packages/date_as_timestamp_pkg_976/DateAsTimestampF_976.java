/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses.packages.date_as_timestamp_pkg_976;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DateAsTimestampF_976 extends org.jooq.impl.AbstractRoutine<java.sql.Timestamp> {

	private static final long serialVersionUID = -1435207091;

	/**
	 * The parameter <code>TEST.PKG_976.F_976.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> DATE_AS_TIMESTAMP_RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * The parameter <code>TEST.PKG_976.F_976.I</code>. 
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> DATE_AS_TIMESTAMP_I = createParameter("I", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public DateAsTimestampF_976() {
		super("F_976", org.jooq.test.oracle2.generatedclasses.DateAsTimestampTest.DATE_AS_TIMESTAMP_TEST, org.jooq.test.oracle2.generatedclasses.packages.DateAsTimestampPkg_976.DATE_AS_TIMESTAMP_PKG_976, org.jooq.impl.SQLDataType.TIMESTAMP);

		setReturnParameter(DATE_AS_TIMESTAMP_RETURN_VALUE);
		addInParameter(DATE_AS_TIMESTAMP_I);
	}

	/**
	 * Set the <code>I</code> parameter IN value to the routine
	 */
	public void setI(java.sql.Timestamp value) {
		setValue(org.jooq.test.oracle2.generatedclasses.packages.date_as_timestamp_pkg_976.DateAsTimestampF_976.DATE_AS_TIMESTAMP_I, value);
	}

	/**
	 * Set the <code>I</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setI(org.jooq.Field<java.sql.Timestamp> field) {
		setField(DATE_AS_TIMESTAMP_I, field);
	}
}
