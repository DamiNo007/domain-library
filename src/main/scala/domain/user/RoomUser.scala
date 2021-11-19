package domain.user

import domain.DomainEntity

case class RoomUser(id: String,
                    profileId: String,
                    `type`: RoomUserType) extends DomainEntity
