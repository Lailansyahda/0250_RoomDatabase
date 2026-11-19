package com.example.meet9.viewmodel

import androidx.compose.runtime.mutableStateMapOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.meet9.repositori.RepositoriSiswa
import androidx.compose.runtime.mutableStateOf

class EditViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel() {

    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set


}