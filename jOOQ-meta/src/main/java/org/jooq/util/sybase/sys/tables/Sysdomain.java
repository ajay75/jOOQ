/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class Sysdomain extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1472447438;

	/**
	 * The singleton instance of SYS.SYSDOMAIN
	 */
	public static final org.jooq.util.sybase.sys.tables.Sysdomain SYSDOMAIN = new org.jooq.util.sybase.sys.tables.Sysdomain();

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
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PRECISION = createField("precision", org.jooq.impl.SQLDataType.SMALLINT, this);

	public Sysdomain() {
		super("SYSDOMAIN", org.jooq.util.sybase.sys.Sys.SYS);
	}

	public Sysdomain(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Sysdomain.SYSDOMAIN);
	}

	@Override
	public org.jooq.util.sybase.sys.tables.Sysdomain as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Sysdomain(alias);
	}
}
