package com.majid.recyclerviewpratice

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.majid.recyclerviewpratice.databinding.ActivityMainBinding
import com.majid.recyclerviewpratice.databinding.DialogbtnBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var itemAdapter: ItemAdapter
    var list = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        itemAdapter = ItemAdapter(list)
        binding.recylev.layoutManager = LinearLayoutManager(this)
        binding.recylev.adapter=itemAdapter
        binding.fab.setOnClickListener {
            var dialog = Dialog(this)
            var dialogBinding = DialogbtnBinding.inflate(layoutInflater)
            dialog.setContentView(dialogBinding.root)

            dialogBinding.btnsave.setOnClickListener {

                if (dialogBinding.etName.text.toString().isEmpty()) {
                    dialogBinding.etName.error = "Enter name"
                } else {
                    list.add(dialogBinding.etName.text.toString())
                    dialog.dismiss()
                }
            }
            dialog.show()
        }
    }
}