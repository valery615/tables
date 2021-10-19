package com.example.kmr.entity

import javax.persistence.*

@Entity
data class Room(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    val number: Int?
)
{
    constructor() : this(null,null, null)

    @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY, mappedBy = "order")
    val tablesList = mutableListOf<Table>()
}
