// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package protobuf.model.packets



@SerialVersionUID(0L)
final case class PacketLoginSuccess(
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[PacketLoginSuccess] with com.trueaccord.lenses.Updatable[PacketLoginSuccess] {
    final override def serializedSize: Int = 0
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): protobuf.model.packets.PacketLoginSuccess = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case tag => _input__.skipField(tag)
        }
      }
      protobuf.model.packets.PacketLoginSuccess(
      )
    }
    def getFieldByNumber(__fieldNumber: Int): scala.Any = throw new MatchError(__fieldNumber)
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = throw new MatchError(__field)
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = protobuf.model.packets.PacketLoginSuccess
}

object PacketLoginSuccess extends com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketLoginSuccess] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[protobuf.model.packets.PacketLoginSuccess] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): protobuf.model.packets.PacketLoginSuccess = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    protobuf.model.packets.PacketLoginSuccess(
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[protobuf.model.packets.PacketLoginSuccess] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      protobuf.model.packets.PacketLoginSuccess(
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PacketsProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PacketsProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = protobuf.model.packets.PacketLoginSuccess(
  )
  implicit class PacketLoginSuccessLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, protobuf.model.packets.PacketLoginSuccess]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, protobuf.model.packets.PacketLoginSuccess](_l) {
  }
}
