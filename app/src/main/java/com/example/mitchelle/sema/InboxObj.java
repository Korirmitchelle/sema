package com.example.mitchelle.sema;

/**
 * Created by mitchelle on 3/6/2018.
 */

public class InboxObj {
    Message lastMsg;
    Boolean islastMsgSeen;
    String receiverID;
    String senderID;

    public Message getLastMsg() {
        return lastMsg;
    }

    public void setLastMsg(Message lastMsg) {
        this.lastMsg = lastMsg;
    }

    public Boolean getIslastMsgSeen() {
        return islastMsgSeen;
    }

    public void setIslastMsgSeen(Boolean islastMsgSeen) {
        this.islastMsgSeen = islastMsgSeen;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    @Override
    public String toString() {
        return "InboxObj{" +
                "lastMsg=" + lastMsg +
                ", islastMsgSeen=" + islastMsgSeen +
                ", receiverID='" + receiverID + '\'' +
                ", senderID='" + senderID + '\'' +
                '}';
    }
}
