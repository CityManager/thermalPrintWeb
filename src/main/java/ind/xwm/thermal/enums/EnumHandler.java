package ind.xwm.thermal.enums;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnumHandler<E extends Enumerable> extends BaseTypeHandler<E> {
    private static Logger logger = LogManager.getLogger(EnumHandler.class);

    private E[] enums;

    public EnumHandler(Class<E> eClass) {
        if (eClass == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.enums = eClass.getEnumConstants();
        if (this.enums == null) {
            throw new IllegalArgumentException(eClass.getSimpleName() + " does not represent an enum type.");
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E e, JdbcType jdbcType) throws SQLException {
        ps.setObject(i, e.getCode(), jdbcType.TYPE_CODE);
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Object code = rs.getObject(columnName);
        return getEnum(code);
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Object code = rs.getObject(columnIndex);
        return getEnum(code);
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Object code = cs.getObject(columnIndex);
        return getEnum(code);
    }

    private E getEnum(Object code) {
        for (E e : enums) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }
}
