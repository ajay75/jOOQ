/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class Iischema extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -861714426;

	/**
	 * The singleton instance of $ingres.iischema
	 */
	public static final org.jooq.util.ingres.ingres.tables.Iischema IISCHEMA = new org.jooq.util.ingres.ingres.tables.Iischema();

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
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.CHAR, IISCHEMA);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_OWNER = createField("schema_owner", org.jooq.impl.SQLDataType.CHAR, IISCHEMA);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> SCHEMA_ID = createField("schema_id", org.jooq.impl.SQLDataType.INTEGER, IISCHEMA);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> SCHEMA_IDX = createField("schema_idx", org.jooq.impl.SQLDataType.INTEGER, IISCHEMA);

	/**
	 * No further instances allowed
	 */
	private Iischema() {
		super("iischema", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
