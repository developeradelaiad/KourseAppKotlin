package com.example.kourseappkotlin.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class AlertDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
            .setTitle("Exit")
            .setMessage("Do you Want To Exit?")
            .setPositiveButton("yes") { _, _ -> activity?.finish() }
            .setNegativeButton("No") { dialog, _ -> dialog.cancel() }
        return builder.create()

    }
}