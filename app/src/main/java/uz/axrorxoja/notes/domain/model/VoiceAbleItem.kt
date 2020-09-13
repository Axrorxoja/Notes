package uz.axrorxoja.notes.domain.model

import androidx.room.Entity
import java.util.*

@Entity
data class VoiceAbleItem(
    val id: Long,
    val lastModifiedDate: Date
)