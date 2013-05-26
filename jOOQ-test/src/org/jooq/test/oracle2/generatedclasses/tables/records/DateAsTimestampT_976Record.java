/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DateAsTimestampT_976Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle2.generatedclasses.tables.records.DateAsTimestampT_976Record> implements org.jooq.Record4<java.lang.Integer, java.sql.Timestamp, org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord, org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord> {

	private static final long serialVersionUID = -1321705974;

	/**
	 * Setter for <code>TEST.T_976.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_976.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_976.D</code>. 
	 */
	public void setD(java.sql.Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_976.D</code>. 
	 */
	public java.sql.Timestamp getD() {
		return (java.sql.Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_976.T</code>. 
	 */
	public void setT(org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_976.T</code>. 
	 */
	public org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord getT() {
		return (org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_976.O</code>. 
	 */
	public void setO(org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_976.O</code>. 
	 */
	public org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord getO() {
		return (org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.sql.Timestamp, org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord, org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.sql.Timestamp, org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord, org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord> field3() {
		return org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord> field4() {
		return org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976.DATE_AS_TIMESTAMP_O;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976VarrayTypeRecord value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle2.generatedclasses.udt.records.DateAsTimestampT_976ObjectTypeRecord value4() {
		return getO();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DateAsTimestampT_976Record
	 */
	public DateAsTimestampT_976Record() {
		super(org.jooq.test.oracle2.generatedclasses.tables.DateAsTimestampT_976.DATE_AS_TIMESTAMP_T_976);
	}
}
