package domain.user

import domain.DomainEntity

case class UserProfile(id: String,
                       name: String,
                       email: String,
                       avatarUrl: Option[String] = None,
                       spotifyUri: String) extends DomainEntity
