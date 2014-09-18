/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.provider.db.service.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TSentryPrivilege implements org.apache.thrift.TBase<TSentryPrivilege, TSentryPrivilege._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSentryPrivilege");

  private static final org.apache.thrift.protocol.TField PRIVILEGE_SCOPE_FIELD_DESC = new org.apache.thrift.protocol.TField("privilegeScope", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SERVER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("serverName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField URI_FIELD_DESC = new org.apache.thrift.protocol.TField("URI", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.I64, (short)8);
  private static final org.apache.thrift.protocol.TField GRANT_OPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("grantOption", org.apache.thrift.protocol.TType.I32, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSentryPrivilegeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSentryPrivilegeTupleSchemeFactory());
  }

  private String privilegeScope; // required
  private String serverName; // required
  private String dbName; // optional
  private String tableName; // optional
  private String URI; // optional
  private String action; // required
  private long createTime; // optional
  private TSentryGrantOption grantOption; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRIVILEGE_SCOPE((short)1, "privilegeScope"),
    SERVER_NAME((short)3, "serverName"),
    DB_NAME((short)4, "dbName"),
    TABLE_NAME((short)5, "tableName"),
    URI((short)6, "URI"),
    ACTION((short)7, "action"),
    CREATE_TIME((short)8, "createTime"),
    /**
     * 
     * @see TSentryGrantOption
     */
    GRANT_OPTION((short)9, "grantOption");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PRIVILEGE_SCOPE
          return PRIVILEGE_SCOPE;
        case 3: // SERVER_NAME
          return SERVER_NAME;
        case 4: // DB_NAME
          return DB_NAME;
        case 5: // TABLE_NAME
          return TABLE_NAME;
        case 6: // URI
          return URI;
        case 7: // ACTION
          return ACTION;
        case 8: // CREATE_TIME
          return CREATE_TIME;
        case 9: // GRANT_OPTION
          return GRANT_OPTION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATETIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.DB_NAME,_Fields.TABLE_NAME,_Fields.URI,_Fields.CREATE_TIME,_Fields.GRANT_OPTION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRIVILEGE_SCOPE, new org.apache.thrift.meta_data.FieldMetaData("privilegeScope", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVER_NAME, new org.apache.thrift.meta_data.FieldMetaData("serverName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.URI, new org.apache.thrift.meta_data.FieldMetaData("URI", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GRANT_OPTION, new org.apache.thrift.meta_data.FieldMetaData("grantOption", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TSentryGrantOption.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSentryPrivilege.class, metaDataMap);
  }

  public TSentryPrivilege() {
    this.dbName = "";

    this.tableName = "";

    this.URI = "";

    this.action = "";

    this.grantOption = org.apache.sentry.provider.db.service.thrift.TSentryGrantOption.FALSE;

  }

  public TSentryPrivilege(
    String privilegeScope,
    String serverName,
    String action)
  {
    this();
    this.privilegeScope = privilegeScope;
    this.serverName = serverName;
    this.action = action;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSentryPrivilege(TSentryPrivilege other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPrivilegeScope()) {
      this.privilegeScope = other.privilegeScope;
    }
    if (other.isSetServerName()) {
      this.serverName = other.serverName;
    }
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetURI()) {
      this.URI = other.URI;
    }
    if (other.isSetAction()) {
      this.action = other.action;
    }
    this.createTime = other.createTime;
    if (other.isSetGrantOption()) {
      this.grantOption = other.grantOption;
    }
  }

  public TSentryPrivilege deepCopy() {
    return new TSentryPrivilege(this);
  }

  @Override
  public void clear() {
    this.privilegeScope = null;
    this.serverName = null;
    this.dbName = "";

    this.tableName = "";

    this.URI = "";

    this.action = "";

    setCreateTimeIsSet(false);
    this.createTime = 0;
    this.grantOption = org.apache.sentry.provider.db.service.thrift.TSentryGrantOption.FALSE;

  }

  public String getPrivilegeScope() {
    return this.privilegeScope;
  }

  public void setPrivilegeScope(String privilegeScope) {
    this.privilegeScope = privilegeScope;
  }

  public void unsetPrivilegeScope() {
    this.privilegeScope = null;
  }

  /** Returns true if field privilegeScope is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivilegeScope() {
    return this.privilegeScope != null;
  }

  public void setPrivilegeScopeIsSet(boolean value) {
    if (!value) {
      this.privilegeScope = null;
    }
  }

  public String getServerName() {
    return this.serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public void unsetServerName() {
    this.serverName = null;
  }

  /** Returns true if field serverName is set (has been assigned a value) and false otherwise */
  public boolean isSetServerName() {
    return this.serverName != null;
  }

  public void setServerNameIsSet(boolean value) {
    if (!value) {
      this.serverName = null;
    }
  }

  public String getDbName() {
    return this.dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public String getTableName() {
    return this.tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public String getURI() {
    return this.URI;
  }

  public void setURI(String URI) {
    this.URI = URI;
  }

  public void unsetURI() {
    this.URI = null;
  }

  /** Returns true if field URI is set (has been assigned a value) and false otherwise */
  public boolean isSetURI() {
    return this.URI != null;
  }

  public void setURIIsSet(boolean value) {
    if (!value) {
      this.URI = null;
    }
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public void unsetAction() {
    this.action = null;
  }

  /** Returns true if field action is set (has been assigned a value) and false otherwise */
  public boolean isSetAction() {
    return this.action != null;
  }

  public void setActionIsSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  public long getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(long createTime) {
    this.createTime = createTime;
    setCreateTimeIsSet(true);
  }

  public void unsetCreateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  /** Returns true if field createTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  public void setCreateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATETIME_ISSET_ID, value);
  }

  /**
   * 
   * @see TSentryGrantOption
   */
  public TSentryGrantOption getGrantOption() {
    return this.grantOption;
  }

  /**
   * 
   * @see TSentryGrantOption
   */
  public void setGrantOption(TSentryGrantOption grantOption) {
    this.grantOption = grantOption;
  }

  public void unsetGrantOption() {
    this.grantOption = null;
  }

  /** Returns true if field grantOption is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantOption() {
    return this.grantOption != null;
  }

  public void setGrantOptionIsSet(boolean value) {
    if (!value) {
      this.grantOption = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRIVILEGE_SCOPE:
      if (value == null) {
        unsetPrivilegeScope();
      } else {
        setPrivilegeScope((String)value);
      }
      break;

    case SERVER_NAME:
      if (value == null) {
        unsetServerName();
      } else {
        setServerName((String)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case URI:
      if (value == null) {
        unsetURI();
      } else {
        setURI((String)value);
      }
      break;

    case ACTION:
      if (value == null) {
        unsetAction();
      } else {
        setAction((String)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((Long)value);
      }
      break;

    case GRANT_OPTION:
      if (value == null) {
        unsetGrantOption();
      } else {
        setGrantOption((TSentryGrantOption)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRIVILEGE_SCOPE:
      return getPrivilegeScope();

    case SERVER_NAME:
      return getServerName();

    case DB_NAME:
      return getDbName();

    case TABLE_NAME:
      return getTableName();

    case URI:
      return getURI();

    case ACTION:
      return getAction();

    case CREATE_TIME:
      return Long.valueOf(getCreateTime());

    case GRANT_OPTION:
      return getGrantOption();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRIVILEGE_SCOPE:
      return isSetPrivilegeScope();
    case SERVER_NAME:
      return isSetServerName();
    case DB_NAME:
      return isSetDbName();
    case TABLE_NAME:
      return isSetTableName();
    case URI:
      return isSetURI();
    case ACTION:
      return isSetAction();
    case CREATE_TIME:
      return isSetCreateTime();
    case GRANT_OPTION:
      return isSetGrantOption();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSentryPrivilege)
      return this.equals((TSentryPrivilege)that);
    return false;
  }

  public boolean equals(TSentryPrivilege that) {
    if (that == null)
      return false;

    boolean this_present_privilegeScope = true && this.isSetPrivilegeScope();
    boolean that_present_privilegeScope = true && that.isSetPrivilegeScope();
    if (this_present_privilegeScope || that_present_privilegeScope) {
      if (!(this_present_privilegeScope && that_present_privilegeScope))
        return false;
      if (!this.privilegeScope.equals(that.privilegeScope))
        return false;
    }

    boolean this_present_serverName = true && this.isSetServerName();
    boolean that_present_serverName = true && that.isSetServerName();
    if (this_present_serverName || that_present_serverName) {
      if (!(this_present_serverName && that_present_serverName))
        return false;
      if (!this.serverName.equals(that.serverName))
        return false;
    }

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_URI = true && this.isSetURI();
    boolean that_present_URI = true && that.isSetURI();
    if (this_present_URI || that_present_URI) {
      if (!(this_present_URI && that_present_URI))
        return false;
      if (!this.URI.equals(that.URI))
        return false;
    }

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_createTime = true && this.isSetCreateTime();
    boolean that_present_createTime = true && that.isSetCreateTime();
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (this.createTime != that.createTime)
        return false;
    }

    boolean this_present_grantOption = true && this.isSetGrantOption();
    boolean that_present_grantOption = true && that.isSetGrantOption();
    if (this_present_grantOption || that_present_grantOption) {
      if (!(this_present_grantOption && that_present_grantOption))
        return false;
      if (!this.grantOption.equals(that.grantOption))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_privilegeScope = true && (isSetPrivilegeScope());
    builder.append(present_privilegeScope);
    if (present_privilegeScope)
      builder.append(privilegeScope);

    boolean present_serverName = true && (isSetServerName());
    builder.append(present_serverName);
    if (present_serverName)
      builder.append(serverName);

    boolean present_dbName = true && (isSetDbName());
    builder.append(present_dbName);
    if (present_dbName)
      builder.append(dbName);

    boolean present_tableName = true && (isSetTableName());
    builder.append(present_tableName);
    if (present_tableName)
      builder.append(tableName);

    boolean present_URI = true && (isSetURI());
    builder.append(present_URI);
    if (present_URI)
      builder.append(URI);

    boolean present_action = true && (isSetAction());
    builder.append(present_action);
    if (present_action)
      builder.append(action);

    boolean present_createTime = true && (isSetCreateTime());
    builder.append(present_createTime);
    if (present_createTime)
      builder.append(createTime);

    boolean present_grantOption = true && (isSetGrantOption());
    builder.append(present_grantOption);
    if (present_grantOption)
      builder.append(grantOption.getValue());

    return builder.toHashCode();
  }

  public int compareTo(TSentryPrivilege other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TSentryPrivilege typedOther = (TSentryPrivilege)other;

    lastComparison = Boolean.valueOf(isSetPrivilegeScope()).compareTo(typedOther.isSetPrivilegeScope());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivilegeScope()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privilegeScope, typedOther.privilegeScope);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServerName()).compareTo(typedOther.isSetServerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverName, typedOther.serverName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(typedOther.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, typedOther.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(typedOther.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, typedOther.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetURI()).compareTo(typedOther.isSetURI());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetURI()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.URI, typedOther.URI);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAction()).compareTo(typedOther.isSetAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, typedOther.action);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTime()).compareTo(typedOther.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, typedOther.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantOption()).compareTo(typedOther.isSetGrantOption());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantOption()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantOption, typedOther.grantOption);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TSentryPrivilege(");
    boolean first = true;

    sb.append("privilegeScope:");
    if (this.privilegeScope == null) {
      sb.append("null");
    } else {
      sb.append(this.privilegeScope);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serverName:");
    if (this.serverName == null) {
      sb.append("null");
    } else {
      sb.append(this.serverName);
    }
    first = false;
    if (isSetDbName()) {
      if (!first) sb.append(", ");
      sb.append("dbName:");
      if (this.dbName == null) {
        sb.append("null");
      } else {
        sb.append(this.dbName);
      }
      first = false;
    }
    if (isSetTableName()) {
      if (!first) sb.append(", ");
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetURI()) {
      if (!first) sb.append(", ");
      sb.append("URI:");
      if (this.URI == null) {
        sb.append("null");
      } else {
        sb.append(this.URI);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("action:");
    if (this.action == null) {
      sb.append("null");
    } else {
      sb.append(this.action);
    }
    first = false;
    if (isSetCreateTime()) {
      if (!first) sb.append(", ");
      sb.append("createTime:");
      sb.append(this.createTime);
      first = false;
    }
    if (isSetGrantOption()) {
      if (!first) sb.append(", ");
      sb.append("grantOption:");
      if (this.grantOption == null) {
        sb.append("null");
      } else {
        sb.append(this.grantOption);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetPrivilegeScope()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'privilegeScope' is unset! Struct:" + toString());
    }

    if (!isSetServerName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'serverName' is unset! Struct:" + toString());
    }

    if (!isSetAction()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'action' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TSentryPrivilegeStandardSchemeFactory implements SchemeFactory {
    public TSentryPrivilegeStandardScheme getScheme() {
      return new TSentryPrivilegeStandardScheme();
    }
  }

  private static class TSentryPrivilegeStandardScheme extends StandardScheme<TSentryPrivilege> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSentryPrivilege struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRIVILEGE_SCOPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.privilegeScope = iprot.readString();
              struct.setPrivilegeScopeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SERVER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serverName = iprot.readString();
              struct.setServerNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // URI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.URI = iprot.readString();
              struct.setURIIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.action = iprot.readString();
              struct.setActionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createTime = iprot.readI64();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // GRANT_OPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.grantOption = TSentryGrantOption.findByValue(iprot.readI32());
              struct.setGrantOptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSentryPrivilege struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.privilegeScope != null) {
        oprot.writeFieldBegin(PRIVILEGE_SCOPE_FIELD_DESC);
        oprot.writeString(struct.privilegeScope);
        oprot.writeFieldEnd();
      }
      if (struct.serverName != null) {
        oprot.writeFieldBegin(SERVER_NAME_FIELD_DESC);
        oprot.writeString(struct.serverName);
        oprot.writeFieldEnd();
      }
      if (struct.dbName != null) {
        if (struct.isSetDbName()) {
          oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
          oprot.writeString(struct.dbName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.URI != null) {
        if (struct.isSetURI()) {
          oprot.writeFieldBegin(URI_FIELD_DESC);
          oprot.writeString(struct.URI);
          oprot.writeFieldEnd();
        }
      }
      if (struct.action != null) {
        oprot.writeFieldBegin(ACTION_FIELD_DESC);
        oprot.writeString(struct.action);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreateTime()) {
        oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
        oprot.writeI64(struct.createTime);
        oprot.writeFieldEnd();
      }
      if (struct.grantOption != null) {
        if (struct.isSetGrantOption()) {
          oprot.writeFieldBegin(GRANT_OPTION_FIELD_DESC);
          oprot.writeI32(struct.grantOption.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSentryPrivilegeTupleSchemeFactory implements SchemeFactory {
    public TSentryPrivilegeTupleScheme getScheme() {
      return new TSentryPrivilegeTupleScheme();
    }
  }

  private static class TSentryPrivilegeTupleScheme extends TupleScheme<TSentryPrivilege> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSentryPrivilege struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.privilegeScope);
      oprot.writeString(struct.serverName);
      oprot.writeString(struct.action);
      BitSet optionals = new BitSet();
      if (struct.isSetDbName()) {
        optionals.set(0);
      }
      if (struct.isSetTableName()) {
        optionals.set(1);
      }
      if (struct.isSetURI()) {
        optionals.set(2);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(3);
      }
      if (struct.isSetGrantOption()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetDbName()) {
        oprot.writeString(struct.dbName);
      }
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetURI()) {
        oprot.writeString(struct.URI);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeI64(struct.createTime);
      }
      if (struct.isSetGrantOption()) {
        oprot.writeI32(struct.grantOption.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSentryPrivilege struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.privilegeScope = iprot.readString();
      struct.setPrivilegeScopeIsSet(true);
      struct.serverName = iprot.readString();
      struct.setServerNameIsSet(true);
      struct.action = iprot.readString();
      struct.setActionIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.dbName = iprot.readString();
        struct.setDbNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.URI = iprot.readString();
        struct.setURIIsSet(true);
      }
      if (incoming.get(3)) {
        struct.createTime = iprot.readI64();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.grantOption = TSentryGrantOption.findByValue(iprot.readI32());
        struct.setGrantOptionIsSet(true);
      }
    }
  }

}

