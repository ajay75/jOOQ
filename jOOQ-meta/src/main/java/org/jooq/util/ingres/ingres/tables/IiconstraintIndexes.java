/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class IiconstraintIndexes extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1510850887;

	/**
	 * The singleton instance of $ingres.iiconstraint_indexes
	 */
	public static final org.jooq.util.ingres.ingres.tables.IiconstraintIndexes IICONSTRAINT_INDEXES = new org.jooq.util.ingres.ingres.tables.IiconstraintIndexes();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINT_INDEXES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINT_INDEXES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.CHAR, IICONSTRAINT_INDEXES);

	/**
	 * No further instances allowed
	 */
	private IiconstraintIndexes() {
		super("iiconstraint_indexes", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
