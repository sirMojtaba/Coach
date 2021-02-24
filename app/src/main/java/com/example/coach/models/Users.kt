package com.example.coach.models

abstract class Users {
    private var firstName = ""
    private var lastName = ""
    private var mobile = ""
    private var email = ""
    private var nationalCode = ""
    private var gender = true
    private var address = ""
    private var registerDate = ""
    private var birthDate = ""
    private var height = 0
    private var weight = 0
    private var age = 0
    private var cityId = 0
    private lateinit var cities: Cities
    private var imageProfile = ""
    private var lastVistTime = ""
    private var notificationToken = ""
    private var notificationGroups = ""
    private var id = 0

}