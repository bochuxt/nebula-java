/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class VertexIndexData implements TBase, java.io.Serializable, Cloneable, Comparable<VertexIndexData> {
  private static final TStruct STRUCT_DESC = new TStruct("VertexIndexData");
  private static final TField VERTEX_ID_FIELD_DESC = new TField("vertex_id", TType.I64, (short)1);
  private static final TField PROPS_FIELD_DESC = new TField("props", TType.STRING, (short)2);

  public long vertex_id;
  public byte[] props;
  public static final int VERTEX_ID = 1;
  public static final int PROPS = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __VERTEX_ID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(VERTEX_ID, new FieldMetaData("vertex_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(PROPS, new FieldMetaData("props", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(VertexIndexData.class, metaDataMap);
  }

  public VertexIndexData() {
  }

  public VertexIndexData(
    long vertex_id,
    byte[] props)
  {
    this();
    this.vertex_id = vertex_id;
    setVertex_idIsSet(true);
    this.props = props;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VertexIndexData(VertexIndexData other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.vertex_id = TBaseHelper.deepCopy(other.vertex_id);
    if (other.isSetProps()) {
      this.props = TBaseHelper.deepCopy(other.props);
    }
  }

  public VertexIndexData deepCopy() {
    return new VertexIndexData(this);
  }

  @Deprecated
  public VertexIndexData clone() {
    return new VertexIndexData(this);
  }

  public long  getVertex_id() {
    return this.vertex_id;
  }

  public VertexIndexData setVertex_id(long vertex_id) {
    this.vertex_id = vertex_id;
    setVertex_idIsSet(true);
    return this;
  }

  public void unsetVertex_id() {
    __isset_bit_vector.clear(__VERTEX_ID_ISSET_ID);
  }

  // Returns true if field vertex_id is set (has been assigned a value) and false otherwise
  public boolean isSetVertex_id() {
    return __isset_bit_vector.get(__VERTEX_ID_ISSET_ID);
  }

  public void setVertex_idIsSet(boolean value) {
    __isset_bit_vector.set(__VERTEX_ID_ISSET_ID, value);
  }

  public byte[]  getProps() {
    return this.props;
  }

  public VertexIndexData setProps(byte[] props) {
    this.props = props;
    return this;
  }

  public void unsetProps() {
    this.props = null;
  }

  // Returns true if field props is set (has been assigned a value) and false otherwise
  public boolean isSetProps() {
    return this.props != null;
  }

  public void setPropsIsSet(boolean value) {
    if (!value) {
      this.props = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case VERTEX_ID:
      if (value == null) {
        unsetVertex_id();
      } else {
        setVertex_id((Long)value);
      }
      break;

    case PROPS:
      if (value == null) {
        unsetProps();
      } else {
        setProps((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case VERTEX_ID:
      return new Long(getVertex_id());

    case PROPS:
      return getProps();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case VERTEX_ID:
      return isSetVertex_id();
    case PROPS:
      return isSetProps();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VertexIndexData)
      return this.equals((VertexIndexData)that);
    return false;
  }

  public boolean equals(VertexIndexData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_vertex_id = true;
    boolean that_present_vertex_id = true;
    if (this_present_vertex_id || that_present_vertex_id) {
      if (!(this_present_vertex_id && that_present_vertex_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.vertex_id, that.vertex_id))
        return false;
    }

    boolean this_present_props = true && this.isSetProps();
    boolean that_present_props = true && that.isSetProps();
    if (this_present_props || that_present_props) {
      if (!(this_present_props && that_present_props))
        return false;
      if (!TBaseHelper.equalsSlow(this.props, that.props))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_vertex_id = true;
    builder.append(present_vertex_id);
    if (present_vertex_id)
      builder.append(vertex_id);

    boolean present_props = true && (isSetProps());
    builder.append(present_props);
    if (present_props)
      builder.append(props);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(VertexIndexData other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetVertex_id()).compareTo(other.isSetVertex_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(vertex_id, other.vertex_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetProps()).compareTo(other.isSetProps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(props, other.props);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case VERTEX_ID:
          if (field.type == TType.I64) {
            this.vertex_id = iprot.readI64();
            setVertex_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PROPS:
          if (field.type == TType.STRING) {
            this.props = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(VERTEX_ID_FIELD_DESC);
    oprot.writeI64(this.vertex_id);
    oprot.writeFieldEnd();
    if (this.props != null) {
      oprot.writeFieldBegin(PROPS_FIELD_DESC);
      oprot.writeBinary(this.props);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("VertexIndexData");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("vertex_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getVertex_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("props");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getProps() == null) {
      sb.append("null");
    } else {
        int __props_size = Math.min(this. getProps().length, 128);
        for (int i = 0; i < __props_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getProps()[i]).length() > 1 ? Integer.toHexString(this. getProps()[i]).substring(Integer.toHexString(this. getProps()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getProps()[i]).toUpperCase());
        }
        if (this. getProps().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
