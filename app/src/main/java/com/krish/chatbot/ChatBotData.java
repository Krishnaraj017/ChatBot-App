//package com.krish.chatbot;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ChatBotData {
//    private static final Map<String, String> trainingData = new HashMap<>(String.CASE_INSENSITIVE_ORDER);
//
//    static {
//        trainingData.put("What is an apple?", "An apple is a round fruit that is typically red or green.");
//        trainingData.put("What are the health benefits of bananas?", "Bananas are a great source of potassium and provide energy.");
//        trainingData.put("How do you eat a pineapple?", "To eat a pineapple, you need to peel off the outer skin and cut it into slices.");
//        trainingData.put("hi", "Hello, ask questions about mite");
//        trainingData.put("gururaj", "He is an alpha legend");
//        trainingData.put("krishnaraj", "He is a living legend");
//        trainingData.put("mite", "Mangalore Institute of Technology");
//        trainingData.put("What is OpenAI?", "OpenAI is an artificial intelligence research laboratory. You can learn more about it [here](https://openai.com).");
//        trainingData.put("htu", "OpenAI is an artificial intelligence research laboratory. You can learn more about it [here](https://openai.com).");
//    }
//
//    public static String getResponse(String userInput) {
//        for (Map.Entry<String, String> entry : trainingData.entrySet()) {
//            String trainingQuestion = entry.getKey();
//            if (userInput.toLowerCase().contains(trainingQuestion.toLowerCase())) {
//                return entry.getValue();
//            }
//        }
//        return "I'm sorry, I don't have an answer.";
//    }
//}
