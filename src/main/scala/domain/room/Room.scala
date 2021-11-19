package domain.room

import domain.DomainEntity

case class Room(id: String,
                title: String,
                genre: Option[String],
                roomies: Seq[String], //Sequence of RoomUser ids
                status: RoomStatus,
                isPrivate: Boolean,
                imageUrl: String,
                inviteLink: String,
                bannedUsers: Seq[String]) extends DomainEntity
