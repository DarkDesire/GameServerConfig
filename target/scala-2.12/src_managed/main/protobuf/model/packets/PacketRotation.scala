// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package protobuf.model.packets



@SerialVersionUID(0L)
final case class PacketRotation(
    pitch: Float = 0.0f,
    yaw: Float = 0.0f
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[PacketRotation] with com.trueaccord.lenses.Updatable[PacketRotation] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (pitch != 0.0f) { __size += _root_.com.google.protobuf.CodedOutputStream.computeFloatSize(1, pitch) }
      if (yaw != 0.0f) { __size += _root_.com.google.protobuf.CodedOutputStream.computeFloatSize(2, yaw) }
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
        val __v = pitch
        if (__v != 0.0f) {
          _output__.writeFloat(1, __v)
        }
      };
      {
        val __v = yaw
        if (__v != 0.0f) {
          _output__.writeFloat(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): protobuf.model.packets.PacketRotation = {
      var __pitch = this.pitch
      var __yaw = this.yaw
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 13 =>
            __pitch = _input__.readFloat()
          case 21 =>
            __yaw = _input__.readFloat()
          case tag => _input__.skipField(tag)
        }
      }
      protobuf.model.packets.PacketRotation(
          pitch = __pitch,
          yaw = __yaw
      )
    }
    def withPitch(__v: Float): PacketRotation = copy(pitch = __v)
    def withYaw(__v: Float): PacketRotation = copy(yaw = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = pitch
          if (__t != 0.0f) __t else null
        }
        case 2 => {
          val __t = yaw
          if (__t != 0.0f) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PFloat(pitch)
        case 2 => _root_.scalapb.descriptors.PFloat(yaw)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = protobuf.model.packets.PacketRotation
}

object PacketRotation extends com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketRotation] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketRotation] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): protobuf.model.packets.PacketRotation = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    protobuf.model.packets.PacketRotation(
      __fieldsMap.getOrElse(__fields.get(0), 0.0f).asInstanceOf[Float],
      __fieldsMap.getOrElse(__fields.get(1), 0.0f).asInstanceOf[Float]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[protobuf.model.packets.PacketRotation] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      protobuf.model.packets.PacketRotation(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[Float]).getOrElse(0.0f),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[Float]).getOrElse(0.0f)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PacketsProto.javaDescriptor.getMessageTypes.get(15)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PacketsProto.scalaDescriptor.messages(15)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = protobuf.model.packets.PacketRotation(
  )
  implicit class PacketRotationLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, protobuf.model.packets.PacketRotation]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, protobuf.model.packets.PacketRotation](_l) {
    def pitch: _root_.com.trueaccord.lenses.Lens[UpperPB, Float] = field(_.pitch)((c_, f_) => c_.copy(pitch = f_))
    def yaw: _root_.com.trueaccord.lenses.Lens[UpperPB, Float] = field(_.yaw)((c_, f_) => c_.copy(yaw = f_))
  }
  final val PITCH_FIELD_NUMBER = 1
  final val YAW_FIELD_NUMBER = 2
}
