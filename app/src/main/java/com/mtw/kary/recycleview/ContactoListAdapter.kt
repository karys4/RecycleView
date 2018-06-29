package com.mtw.kary.recycleview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.contacto_list_item.view.*

class ContactoListAdapter (private val contactosList:ArrayList<Contacto>) : RecyclerView.Adapter<ContactoListAdapter.myViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactoListAdapter.myViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return myViewHolder(layoutInflater.inflate(R.layout.contacto_list_item,parent,false))
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        holder.bind(contactosList [position])
    }

    override fun getItemCount(): Int {
        return contactosList.size
    }



    class myViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bind (contacto: Contacto) {

            itemView.tvNombre.text = contacto.nombre
            itemView.tvTelefono.text = contacto.telefono
            itemView.setOnClickListener{
                Toast.makeText(it.context,"Elemento Seleccionado: " + contacto.nombre,Toast.LENGTH_LONG.show())
            }
        }

    }


}