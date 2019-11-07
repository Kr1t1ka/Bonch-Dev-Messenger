package bonch.dev.school.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.MultiAutoCompleteTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import bonch.dev.school.R
import bonch.dev.school.ui.moduls.Message
import bonch.dev.school.ui.moduls.MessageAdapter
import bonch.dev.school.ui.moduls.MessageLab
import java.util.*

class ChatFragmenst : Fragment() {

    lateinit var sendMessageButton: ImageButton

    private lateinit var messageRecyclerView: RecyclerView

    val messageList = MessageLab().messageList

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.chat_fragmenst_fragment, container, false)

        messageRecyclerView = view.findViewById(R.id.message_recycler_view)
        messageRecyclerView.layoutManager = LinearLayoutManager(container!!.context)
        var adapter = MessageAdapter()
        messageRecyclerView.adapter = adapter
        var list_size: Int = messageList.size
        messageRecyclerView.smoothScrollToPosition(list_size - 1)
        sendMessageButton = view.findViewById(R.id.send_message_button)
        sendMessageButton.setOnClickListener {
            val messageTextViev = view.findViewById<MultiAutoCompleteTextView>(R.id.message_et)
            val text = messageTextViev.text.toString()

            if(text.replace(" ", "")!="" && text.count()>0)
                adapter.messageList.add(Message(1, text , Date(), true))

            messageTextViev.text.clear()
        }

        return view
    }

}
