package jpa.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SDept is a Querydsl query type for Dept
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SDept extends com.querydsl.sql.RelationalPathBase<Dept> {

    private static final long serialVersionUID = 88104445;

    public static final SDept dept = new SDept("dept");

    public final NumberPath<Long> deptno = createNumber("deptno", Long.class);

    public final StringPath dname = createString("dname");

    public final com.querydsl.sql.PrimaryKey<Dept> primary = createPrimaryKey(deptno);

    public final com.querydsl.sql.ForeignKey<Emp> _gbxl70x5ckxun8hi19v4n6dfbFK = createInvForeignKey(deptno, "deptno");

    public SDept(String variable) {
        super(Dept.class, forVariable(variable), "null", "dept");
        addMetadata();
    }

    public SDept(String variable, String schema, String table) {
        super(Dept.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SDept(Path<? extends Dept> path) {
        super(path.getType(), path.getMetadata(), "null", "dept");
        addMetadata();
    }

    public SDept(PathMetadata metadata) {
        super(Dept.class, metadata, "null", "dept");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deptno, ColumnMetadata.named("deptno").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(dname, ColumnMetadata.named("dname").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

