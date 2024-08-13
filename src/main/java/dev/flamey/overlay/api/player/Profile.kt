package dev.flamey.overlay.api.player

data class Profile(
    var username: String,
    var displayName: String = username,
    val friends: Array<String> = emptyArray(),
    val lastSeen: Long = 0,
    val rank: Rank,
    val discordVerified: Boolean = false,
    val emailVerified: Boolean = false,
    val clanName: String? = "None",
    val discordBoosting: Boolean = false,
    val nicked: Boolean,
    val fkdr: Double = 0.0,
)

data class Rank(
    val level: Int,
    val experience: Int,
    val percentage: Int,
    val rankDisplay: String
)
