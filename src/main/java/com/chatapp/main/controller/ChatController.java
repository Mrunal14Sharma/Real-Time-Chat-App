package com.chatapp.main.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chatapp.main.model.ChatMessage;

@Controller
public class ChatController {
		@MessageMapping("/sendMessage")
		@SendTo("/topic/messages")
		public ChatMessage sendMessage(ChatMessage msg) {
			return msg;
		}
		
		@GetMapping("chat")
		public String chat() {
			return "chat";
		}
}
