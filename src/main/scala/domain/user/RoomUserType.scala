package domain.user

import domain.CustomEnumeration

sealed trait RoomUserType

object RoomUserType extends CustomEnumeration[RoomUserType] {

  override val values: Seq[RoomUserType] = Seq(
    CREATOR,
    ADMIN,
    DJ,
    ORDINARY
  )

  case object CREATOR extends RoomUserType

  case object ADMIN extends RoomUserType

  case object DJ extends RoomUserType

  case object ORDINARY extends RoomUserType

}