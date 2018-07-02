package com.example.android.quizapp;

public class QuestionLibrary {
    private String mQuestionImage[] = {
            "_1", "_2", "_3", "_4", "_5", "_6", "_7", "_8", "_9", "_10", "_11", "_12", "_13", "_14", "_15",
            "_16", "_17", "_18", "_19","_20", "_21", "_22", "_23", "_24", "_25", "_26","_27","_28","_29","_30"
    };

    private String mChoices [][] = {
            {"A:  The Achilleion Palace, Greece","B:  Acropolis of Athens, Greece","C:  Rhodes, Palace of the Grand Masters, Greece"},
            {"A:  Hjbjbjk msoosmosm","B:  Agia Sophia in Istanbul, Turkey","C:  Jjnn smomos"},
            {"A:  Jjnn smomos","B:  Jjnn smomos","C:  Big Ben in London"},
            {"A:  Brandenburg Gate in Berlin, Germany","B:  ","C:  "},
            {"A:  Jjnn smomos","B:  Jjnn smomos","C:  Capitol Hill in Washington DC"},
            {"A:  Christ the Redeemer in Rio de Janeiro","B:  Jjnn smomos","C:  Jjnn smomos"},
            {"A:  Easter Island in the Polynesian Triangle, Pacific Ocean","B:  ","C:  "},
            {"A:  ","B:  Machu Picchu in Peru","C:  "},
            {"A:  ","B:  ","C:  Mount Eden crater in New Zealand"},
            {"A:  Mount Everest on the border of Tibet and Nepal","B:  ","C:  "},
            {"A:  ","B:  ","C:  Mount Fuji in Japan"},
            {"A:  ","B:  Mount Rushmore in South Dakota","C:  "},
            {"A:  Neptune and the Palace of Versailles in France","B:  ","C:  "},
            {"A:  ","B:  ","C:  Neuschwanstein in Bavaria"},
            {"A:  Niagara Falls at the border of Ontario ( Canada ) and New York ( USA )","B:  ","C:  "},
            {"A:  ","B:  ","C:  Sagrada Familia in Barcelona, Spain"},
            {"A:  St. Basil’s Cathedral in Moscow, Russia","B:  ","C:  "},
            {"A:  ","B:  Stonehenge in the English county of Wiltshire","C:  "},
            {"A:  ","B:  ","C:  The Burj al Arab Hotel in Dubai"},
            {"A:  ","B:  ","C:  The Door to Hell, Derweze, Ahal Province, Turkmenistan"},
            {"A:  ","B:  The Eiffel Tower in Paris, France","C:  "},
            {"A:  The Great Buddha of Kamakura in Japan","B:  ","C:  "},
            {"A:  ","B:  ","C:  The Great Chinese Wall in China"},
            {"A:  The Great Sphinx at Giza, Egypt","B:  ","C:  "},
            {"A:  The Little Mermaid in Copenhagen, Denmark","B:  ","C:  "},
            {"A:  ","B:  The Pyramids of Giza in Egypt, Denmark","C:  "},
            {"A:  The Statue of Liberty in New York, USA","B:  ","C:  "},
            {"A:  ","B:  ","C:  Tower of Pisa, Italy"},
            {"A:  ","B:  Uluru in the Northern Territory, Australia","C:  "},
            {"A:  Victoria Falls between Zambia and Zimbabwe","B:  ","C:  "}
    };

    private String mCorrectAnswers[] = {
            "B:  Acropolis of Athens, Greece","B:  Agia Sophia in Istanbul, Turkey","C:  Big Ben in London","A:  Brandenburg Gate in Berlin, Germany",
            "C:  Capitol Hill in Washington DC","A:  Christ the Redeemer in Rio de Janeiro","A:  Easter Island in the Polynesian Triangle, Pacific Ocean","B:  Machu Picchu in Peru",
            "C:  Mount Eden crater in New Zealand","A:  Mount Everest on the border of Tibet and Nepal","C:  Mount Fuji in Japan","B:  Mount Rushmore in South Dakota",
            "A:  Neptune and the Palace of Versailles in France","C:  Neuschwanstein in Bavaria","A:  Niagara Falls at the border of Ontario ( Canada ) and New York ( USA )","C:  Sagrada Familia in Barcelona, Spain",
            "A:  St. Basil’s Cathedral in Moscow, Russia","B:  Stonehenge in the English county of Wiltshire","C:  The Burj al Arab Hotel in Dubai","C:  The Door to Hell, Derweze, Ahal Province, Turkmenistan",
            "B:  The Eiffel Tower in Paris, France","A:  The Great Buddha of Kamakura in Japan","C:  The Great Chinese Wall in China","A:  The Great Sphinx at Giza, Egypt",
            "A:  The Little Mermaid in Copenhagen, Denmark","B:  The Pyramids of Giza in Egypt","A:  The Statue of Liberty in New York, USA","C:  Tower of Pisa, Italy",
            "B:  Uluru in the Northern Territory, Australia","A:  Victoria Falls between Zambia and Zimbabwe"
    };

    public String getQuestionImage(int a){
        String questionImage = mQuestionImage[a];
        return questionImage;
    }

    public String getChoice1(int a){
        String choice1 = mChoices[a][0];
        return choice1;
    }

    public String getChoice2(int a){
        String choice2 = mChoices[a][1];
        return choice2;
    }

    public String getChoice3(int a){
        String choice3 = mChoices[a][2];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
