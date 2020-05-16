// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package protobuf.model.packets



@SerialVersionUID(0L)
final case class PacketShootToAvatar(
    avatarId: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[PacketShootToAvatar] with com.trueaccord.lenses.Updatable[PacketShootToAvatar] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (avatarId != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, avatarId) }
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
        val __v = avatarId
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): protobuf.model.packets.PacketShootToAvatar = {
      var __avatarId = this.avatarId
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __avatarId = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      protobuf.model.packets.PacketShootToAvatar(
          avatarId = __avatarId
      )
    }
    def withAvatarId(__v: Int): PacketShootToAvatar = copy(avatarId = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = avatarId
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(avatarId)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = protobuf.model.packets.PacketShootToAvatar
}

object PacketShootToAvatar extends com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketShootToAvatar] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketShootToAvatar] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): protobuf.model.packets.PacketShootToAvatar = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    protobuf.model.packets.PacketShootToAvatar(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[protobuf.model.packets.PacketShootToAvatar] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      protobuf.model.packets.PacketShootToAvatar(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PacketsProto.javaDescriptor.getMessageTypes.get(25)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PacketsProto.scalaDescriptor.messages(25)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = protobuf.model.packets.PacketShootToAvatar(
  )
  implicit class PacketShootToAvatarLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, protobuf.model.packets.PacketShootToAvatar]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, protobuf.model.packets.PacketShootToAvatar](_l) {
    def avatarId: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.avatarId)((c_, f_) => c_.copy(avatarId = f_))
  }
  final val AVATARID_FIELD_NUMBER = 1
}
