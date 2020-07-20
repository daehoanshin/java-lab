package jpa.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SEmp is a Querydsl query type for Emp
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SEmp extends com.querydsl.sql.RelationalPathBase<Emp> {

    private static final long serialVersionUID = -135704048;

    public static final SEmp emp = new SEmp("emp");

    public final NumberPath<Long> deptno = createNumber("deptno", Long.class);

    public final NumberPath<Long> empno = createNumber("empno", Long.class);

    public final StringPath ename = createString("ename");

    public final StringPath job = createString("job");

    public final NumberPath<Long> sal = createNumber("sal", Long.class);

    public final com.querydsl.sql.PrimaryKey<Emp> primary = createPrimaryKey(empno);

    public final com.querydsl.sql.ForeignKey<Dept> gbxl70x5ckxun8hi19v4n6dfbFK = createForeignKey(deptno, "deptno");

    public SEmp(String variable) {
        super(Emp.class, forVariable(variable), "null", "emp");
        addMetadata();
    }

    public SEmp(String variable, String schema, String table) {
        super(Emp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SEmp(Path<? extends Emp> path) {
        super(path.getType(), path.getMetadata(), "null", "emp");
        addMetadata();
    }

    public SEmp(PathMetadata metadata) {
        super(Emp.class, metadata, "null", "emp");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deptno, ColumnMetadata.named("deptno").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(empno, ColumnMetadata.named("empno").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(ename, ColumnMetadata.named("ename").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(job, ColumnMetadata.named("job").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(sal, ColumnMetadata.named("sal").withIndex(4).ofType(Types.BIGINT).withSize(19));
    }

}

