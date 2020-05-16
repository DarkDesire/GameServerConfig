// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package protobuf.model.packets



@SerialVersionUID(0L)
final case class PacketManna(
    current: Int = 0,
    maximum: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[PacketManna] with com.trueaccord.lenses.Updatable[PacketManna] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (current != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, current) }
      if (maximum != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, maximum) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = current
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = maximum
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): protobuf.model.packets.PacketManna = {
      var __current = this.current
      var __maximum = this.maximum
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __current = _input__.readInt32()
          case 16 =>
            __maximum = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      protobuf.model.packets.PacketManna(
          current = __current,
          maximum = __maximum
      )
    }
    def withCurrent(__v: Int): PacketManna = copy(current = __v)
    def withMaximum(__v: Int): PacketManna = copy(maximum = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = current
          if (__t != 0) __t else null
        }
        case 2 => {
          val __t = maximum
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(current)
        case 2 => _root_.scalapb.descriptors.PInt(maximum)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = protobuf.model.packets.PacketManna
}

object PacketManna extends com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketManna] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketManna] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): protobuf.model.packets.PacketManna = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    protobuf.model.packets.PacketManna(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[protobuf.model.packets.PacketManna] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      protobuf.model.packets.PacketManna(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PacketsProto.javaDescriptor.getMessageTypes.get(18)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PacketsProto.scalaDescriptor.messages(18)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = protobuf.model.packets.PacketManna(
  )
  implicit class PacketMannaLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, protobuf.model.packets.PacketManna]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, protobuf.model.packets.PacketManna](_l) {
    def current: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.current)((c_, f_) => c_.copy(current = f_))
    def maximum: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.maximum)((c_, f_) => c_.copy(maximum = f_))
  }
  final val CURRENT_FIELD_NUMBER = 1
  final val MAXIMUM_FIELD_NUMBER = 2
}
