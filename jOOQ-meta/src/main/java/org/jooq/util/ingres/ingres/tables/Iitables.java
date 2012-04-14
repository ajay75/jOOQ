/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class Iitables extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1953759392;

	/**
	 * The singleton instance of $ingres.iitables
	 */
	public static final org.jooq.util.ingres.ingres.tables.Iitables IITABLES = new org.jooq.util.ingres.ingres.tables.Iitables();

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
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_OWNER = createField("table_owner", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ALTER_DATE = createField("alter_date", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_TYPE = createField("table_type", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SUBTYPE = createField("table_subtype", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_VERSION = createField("table_version", org.jooq.impl.SQLDataType.VARCHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SYSTEM_USE = createField("system_use", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_STATS = createField("table_stats", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_INDEXES = createField("table_indexes", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_READONLY = createField("is_readonly", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONCURRENT_ACCESS = createField("concurrent_access", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> NUM_ROWS = createField("num_rows", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> STORAGE_STRUCTURE = createField("storage_structure", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_COMPRESSED = createField("is_compressed", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> KEY_IS_COMPRESSED = createField("key_is_compressed", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DUPLICATE_ROWS = createField("duplicate_rows", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_RULE = createField("unique_rule", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> NUMBER_PAGES = createField("number_pages", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> OVERFLOW_PAGES = createField("overflow_pages", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ROW_WIDTH = createField("row_width", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> EXPIRE_DATE = createField("expire_date", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> MODIFY_DATE = createField("modify_date", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LOCATION_NAME = createField("location_name", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_INTEGRITIES = createField("table_integrities", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_PERMITS = createField("table_permits", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ALL_TO_ALL = createField("all_to_all", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> RET_TO_ALL = createField("ret_to_all", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_JOURNALLED = createField("is_journalled", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> VIEW_BASE = createField("view_base", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> MULTI_LOCATIONS = createField("multi_locations", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> TABLE_IFILLPCT = createField("table_ifillpct", org.jooq.impl.SQLDataType.SMALLINT, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> TABLE_DFILLPCT = createField("table_dfillpct", org.jooq.impl.SQLDataType.SMALLINT, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> TABLE_LFILLPCT = createField("table_lfillpct", org.jooq.impl.SQLDataType.SMALLINT, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_MINPAGES = createField("table_minpages", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_MAXPAGES = createField("table_maxpages", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_RELSTAMP1 = createField("table_relstamp1", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_RELSTAMP2 = createField("table_relstamp2", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_RELTID = createField("table_reltid", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_RELTIDX = createField("table_reltidx", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> UNIQUE_SCOPE = createField("unique_scope", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ALLOCATION_SIZE = createField("allocation_size", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> EXTEND_SIZE = createField("extend_size", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ALLOCATED_PAGES = createField("allocated_pages", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LABEL_GRANULARITY = createField("label_granularity", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ROW_SECURITY_AUDIT = createField("row_security_audit", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SECURITY_LABEL = createField("security_label", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_PAGESIZE = createField("table_pagesize", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> TABLE_RELVERSION = createField("table_relversion", org.jooq.impl.SQLDataType.SMALLINT, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_RELTOTWID = createField("table_reltotwid", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> TABLE_RELTCPRI = createField("table_reltcpri", org.jooq.impl.SQLDataType.SMALLINT, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TUPS_PER_PAGE = createField("tups_per_page", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> KEYS_PER_PAGE = createField("keys_per_page", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> KEYS_PER_LEAF = createField("keys_per_leaf", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> PHYS_PARTITIONS = createField("phys_partitions", org.jooq.impl.SQLDataType.SMALLINT, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> PARTITION_DIMENSIONS = createField("partition_dimensions", org.jooq.impl.SQLDataType.SMALLINT, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_RELDATAWID = createField("table_reldatawid", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_RELTOTDATAWID = createField("table_reltotdatawid", org.jooq.impl.SQLDataType.INTEGER, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ENCRYPTED_COLUMNS = createField("encrypted_columns", org.jooq.impl.SQLDataType.CHAR, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> ENCRYPTION_VERSION = createField("encryption_version", org.jooq.impl.SQLDataType.SMALLINT, IITABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ENCRYPTION_TYPE = createField("encryption_type", org.jooq.impl.SQLDataType.VARCHAR, IITABLES);

	/**
	 * No further instances allowed
	 */
	private Iitables() {
		super("iitables", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
