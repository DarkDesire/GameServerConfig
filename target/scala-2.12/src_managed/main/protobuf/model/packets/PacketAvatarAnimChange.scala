// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package protobuf.model.packets



@SerialVersionUID(0L)
final case class PacketAvatarAnimChange(
    avatar: scala.Option[protobuf.model.packets.PacketAvatar] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[PacketAvatarAnimChange] with com.trueaccord.lenses.Updatable[PacketAvatarAnimChange] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (avatar.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(avatar.get.serializedSize) + avatar.get.serializedSize }
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
      avatar.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): protobuf.model.packets.PacketAvatarAnimChange = {
      var __avatar = this.avatar
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __avatar = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __avatar.getOrElse(protobuf.model.packets.PacketAvatar.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      protobuf.model.packets.PacketAvatarAnimChange(
          avatar = __avatar
      )
    }
    def getAvatar: protobuf.model.packets.PacketAvatar = avatar.getOrElse(protobuf.model.packets.PacketAvatar.defaultInstance)
    def clearAvatar: PacketAvatarAnimChange = copy(avatar = None)
    def withAvatar(__v: protobuf.model.packets.PacketAvatar): PacketAvatarAnimChange = copy(avatar = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => avatar.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => avatar.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = protobuf.model.packets.PacketAvatarAnimChange
}

object PacketAvatarAnimChange extends com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketAvatarAnimChange] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketAvatarAnimChange] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): protobuf.model.packets.PacketAvatarAnimChange = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    protobuf.model.packets.PacketAvatarAnimChange(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[protobuf.model.packets.PacketAvatar]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[protobuf.model.packets.PacketAvatarAnimChange] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      protobuf.model.packets.PacketAvatarAnimChange(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[protobuf.model.packets.PacketAvatar]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PacketsProto.javaDescriptor.getMessageTypes.get(23)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PacketsProto.scalaDescriptor.messages(23)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = protobuf.model.packets.PacketAvatar
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = protobuf.model.packets.PacketAvatarAnimChange(
  )
  implicit class PacketAvatarAnimChangeLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, protobuf.model.packets.PacketAvatarAnimChange]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, protobuf.model.packets.PacketAvatarAnimChange](_l) {
    def avatar: _root_.com.trueaccord.lenses.Lens[UpperPB, protobuf.model.packets.PacketAvatar] = field(_.getAvatar)((c_, f_) => c_.copy(avatar = Some(f_)))
    def optionalAvatar: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[protobuf.model.packets.PacketAvatar]] = field(_.avatar)((c_, f_) => c_.copy(avatar = f_))
  }
  final val AVATAR_FIELD_NUMBER = 1
}
