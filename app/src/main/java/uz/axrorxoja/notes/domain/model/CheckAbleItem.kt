package uz.axrorxoja.notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class CheckAbleItem(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    val isChecked: Boolean,
    val lastModifiedDate: Date
)