package com.example.soccerquiz

class QuizItem {

    var question : String
    var answer : List<String>

    constructor(question: String, answer: List<String>) {
        this.question = question
        this.answer = answer
    }
}