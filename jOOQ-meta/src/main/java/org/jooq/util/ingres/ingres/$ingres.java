/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class $ingres extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 234779151;

	/**
	 * The singleton instance of $ingres
	 */
	public static final $ingres $INGRES = new $ingres();

	/**
	 * No further instances allowed
	 */
	private $ingres() {
		super("$ingres");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.ingres.ingres.tables.Iicolumns.IICOLUMNS,
			org.jooq.util.ingres.ingres.tables.IiconstraintIndexes.IICONSTRAINT_INDEXES,
			org.jooq.util.ingres.ingres.tables.Iiconstraints.IICONSTRAINTS,
			org.jooq.util.ingres.ingres.tables.IidbComments.IIDB_COMMENTS,
			org.jooq.util.ingres.ingres.tables.IidbSubcomments.IIDB_SUBCOMMENTS,
			org.jooq.util.ingres.ingres.tables.IiindexColumns.IIINDEX_COLUMNS,
			org.jooq.util.ingres.ingres.tables.Iiindexes.IIINDEXES,
			org.jooq.util.ingres.ingres.tables.IirefConstraints.IIREF_CONSTRAINTS,
			org.jooq.util.ingres.ingres.tables.Iischema.IISCHEMA,
			org.jooq.util.ingres.ingres.tables.Iisequences.IISEQUENCES,
			org.jooq.util.ingres.ingres.tables.Iitables.IITABLES);
	}
}
