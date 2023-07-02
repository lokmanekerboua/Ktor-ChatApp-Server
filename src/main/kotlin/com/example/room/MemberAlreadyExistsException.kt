package com.example.room

class MemberAlreadyExistsException : Exception(
    "member with this username already exists"
)