package bonch.dev.school.ui.moduls

import android.annotation.SuppressLint
import android.icu.text.SimpleDateFormat
import android.os.Parcel
import android.os.Parcelable
import java.util.*

data class Message(val ID: Int, val messageText: String?, val sentDate: Date, val sentUser: Boolean) :
    Parcelable {
    @SuppressLint("NewApi")
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        SimpleDateFormat("dd-MM-yyyy").parse(parcel.readString()),
        parcel.readByte() != 0.toByte()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(ID)
        parcel.writeString(messageText)
        parcel.writeByte(if (sentUser) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }


    companion object CREATOR : Parcelable.Creator<Message> {
        override fun createFromParcel(parcel: Parcel): Message {
            return Message(parcel)
        }

        override fun newArray(size: Int): Array<Message?> {
            return arrayOfNulls(size)
        }
    }
}

class  MessageLab() {
    val messageList: MutableList<Message>

    init {
        messageList = mutableListOf()
        for(i in 0..50){
            val message = Message(i, "Привет, верни сотку",  Date(), true)
            val message2 = Message(-i, "Не верну.",  Date(), false)
            messageList.add(message)
            messageList.add(message2)
        }
    }
}