package com.example.the_notes_app.repository

import com.example.the_notes_app.database.NoteDatabase
import com.example.the_notes_app.model.Note


class NoteRepository(private val db:NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)


    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query:String?) = db.getNoteDao().searchNote(query)

}