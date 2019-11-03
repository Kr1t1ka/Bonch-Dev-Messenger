package bonch.dev.school.ui.moduls

import android.text.format.DateUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import bonch.dev.school.R

class MessageAdapter: RecyclerView.Adapter<MessageAdapter.MessageHolder>() {

    val messageList = MessageLab().messageList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageHolder {


        val view=if(viewType==1)
            LayoutInflater.from(parent.context).inflate(R.layout.user_message_item, parent, false)
        else
            LayoutInflater.from(parent.context).inflate(R.layout.other_message_item, parent, false)

        return MessageHolder(view)
    }

    override fun getItemCount(): Int = messageList.size

    override fun onBindViewHolder(holder: MessageHolder, position: Int) {
        holder.bind(position)

    }

    override fun getItemViewType(position: Int): Int {
        return if(messageList[position].sentUser) 1 else 2
    }

    inner class MessageHolder(view: View) : RecyclerView.ViewHolder(view){

        fun bind(position: Int){
            val dateTextView = itemView.findViewById<TextView>(R.id.date_user_message)
            dateTextView.text = messageList[position].sentDate.toLocaleString()
            val messageTextView = itemView.findViewById<TextView>(R.id.user_message)
            messageTextView.text = messageList[position].messageText

        }

    }

}