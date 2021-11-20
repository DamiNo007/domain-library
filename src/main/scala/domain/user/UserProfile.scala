package domain.user

import domain.DomainEntity

/**
 * @param id     unique id of the profile of the user.
 * @param name   fullname of the user.
 * @param email  email address fo the user.
 * @avatarUrl    url of the avatar image of the user.
 * @spotifyUrl   link to the spotify account of the user.
 */

case class UserProfile(id: String,
                       name: String,
                       email: String,
                       avatarUrl: Option[String] = None,
                       spotifyUri: String) extends DomainEntity
