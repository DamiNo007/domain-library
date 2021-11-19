package domain.room

import domain.CustomEnumeration

sealed trait RoomStatus

object RoomStatus extends CustomEnumeration[RoomStatus] {

  override val values: Seq[RoomStatus] = Seq(
    ACTIVE,
    NOT_ACTIVE
  )

  case object ACTIVE extends RoomStatus

  case object NOT_ACTIVE extends RoomStatus

}
