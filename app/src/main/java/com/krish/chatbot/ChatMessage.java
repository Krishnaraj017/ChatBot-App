package com.krish.chatbot;

public class ChatMessage {
    private final boolean isUserMessage;
    private final String message;

    public ChatMessage(boolean isUserMessage, String message) {
        this.isUserMessage = isUserMessage;
        this.message = message;
    }

    public boolean isUserMessage() {
        return isUserMessage;
    }

    public String getMessage() {
        return message;
    }
}


