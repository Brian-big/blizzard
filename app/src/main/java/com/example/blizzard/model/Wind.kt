package com.example.blizzard.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Wind (
    @SerializedName("speed")
    @Expose
    var speed: Double = 0.0
)