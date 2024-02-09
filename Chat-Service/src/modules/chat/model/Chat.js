import mongoose from "mongoose";

const Schema = mongoose.Schema;
const model = mongoose.model;

const MessageSchema = new Schema({
  user: {
    type: Object,
    ref: "User",
    required: true,
  },
  text: {
    type: String,
    required: true,
  },
  sendAt: {
    type: Date,
    default: Date.now,
    required: true,
  },
});

const ChatRoom = new Schema({
  name: {
    type: String,
    required: true,
  },
  participants: [
    {
      type: Object,
      ref: "User",
    },
  ],
  messages: [MessageSchema],
});

export default model("ChatRoom", ChatRoom);
